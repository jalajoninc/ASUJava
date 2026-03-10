#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    pid_t pid = fork();

    if (pid == 0) {
        // This is the CHILD process
        //char *args[] = {"ls", "-l", "/Users", NULL};
        char *args[] = {"ls", "-l", "./", NULL};
        execvp(args[0], args); 
        
        // execvp only returns if there is an error
        perror("execvp failed");
        return 1;
    } else if (pid > 0) {
        // This is the PARENT process
        printf("Parent is waiting for child (PID: %d)...\n", pid);
        wait(NULL); 
        printf("Child finished.\n");
    } else {
        perror("fork failed");
    }

    return 0;


    
}