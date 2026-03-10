#!/usr/bin/env bash

# 1. Use 'find' to get files modified 2 minutes or less ago
# -maxdepth 1: stay in current directory
# -mmin -2: modified less than 2 minutes ago
# -name "*.java": filter by extension
files=()
while IFS= read -r line; do
    files+=("$line")
done < <(find . -maxdepth 1 -name "*.$1" -mmin -20)

# Check if the array is empty
if [ ${#files[@]} -eq 0 ]; then
    echo "No .cpp files were modified in the last 2 minutes."
    exit 0
fi

echo "--- Recent Java Files (Modified < 2m ago) ---"
echo "Press [ENTER] to cat, 'n' to skip, or 'q' to quit."
echo "----------------------------------------------"

for file in "${files[@]}"; do
    # Strip the leading './' and the '.java' extension
    clean_file="${file#./}"
    display_name="${clean_file%.$1}"

    # Prompt user
    read -p "View '$display_name'? [Enter/n/q]: " choice

    case "$choice" in
        [qQ]*) 
            echo "Exiting..."
            break 
            ;;
        [nN]*) 
            echo "Skipping $display_name..."
            ;;
        "") 
            g++ $clean_file -o $display_name
            ./$display_name
            echo -e "----------------------------------------------\n"
            ;;
    esac
done

echo "Done."