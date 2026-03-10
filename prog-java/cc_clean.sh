#!/usr/bin/env bash

files=( *.class )

# Check if the array is empty
if [ ${#files[@]} -eq 0 ]; then
    echo "No .java files were modified in the last 2 minutes."
    exit 0
fi

echo "--- Recent Java Files (Modified < 2m ago) ---"
echo "Press [ENTER] to cat, 'n' to skip, or 'q' to quit."
echo "----------------------------------------------"

for file in "${files[@]}"; do
    # Strip the leading './' and the '.java' extension
    clean_file="${file#./}"

    # Prompt user
    read -p "View '$clean_file'? [Enter/n/q]: " choice

    case "$choice" in
        [qQ]*) 
            echo "Exiting..."
            break 
            ;;
        [nN]*) 
            echo "Skipping $clean_file..."
            ;;
        "") 
            echo -e "\n--- Content of $clean_file ---"
            rm "$clean_file"
            echo -e "----------------------------------------------\n"
            ;;
    esac
done

echo "Done."