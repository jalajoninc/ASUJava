#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <dirent.h>
#include <stdlib.h>
#include <string.h>


int has_extension(const char *name, const char *ext) {
    size_t nl = strlen(name);
    size_t el = strlen(ext);
    return nl >= el && strcmp(name + nl - el, ext) == 0;
}

struct dirent* list_files_array(const char *path, int *count) {
    DIR *dr = opendir(path);
    if (dr == NULL) return NULL;

    struct dirent *entry;
    int n = 0;

    // First pass: Count files
    //while ((entry = readdir(dr))) n++;
    while ((entry = readdir(dr))) {
        if (has_extension(entry->d_name, ".c")) n++;
    }
    rewinddir(dr); 

    // Allocate memory on the Heap
    struct dirent *array = malloc(n * sizeof(struct dirent));
    if (array == NULL) return NULL;
    
    // Second pass: Copy data into our array
    int i = 0;
    while ((entry = readdir(dr))) {
        if (has_extension(entry->d_name, ".c")) {
            memcpy(&array[i], entry, sizeof(struct dirent));
            i++;
        }
    }

    closedir(dr);
    *count = n; // Set the count for the caller
    return array; 
}

int main() {
    int fileCount = 0;
    
    // 1. Call the function and pass the address of fileCount
    struct dirent *myFiles = list_files_array(".", &fileCount);

    if (myFiles == NULL) {
        printf("Failed to read directory.\n");
        return 1;
    }

    // 2. Iterate through the returned array
    printf("Found %d entries:\n", fileCount);
    for (int i = 0; i < fileCount; i++) {
        printf("[%d] %s\n", i, myFiles[i].d_name);
    }

    // 3. CRITICAL: Free the memory allocated by malloc inside the function
    free(myFiles);
    return 0;
}
