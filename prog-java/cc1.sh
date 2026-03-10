#!/usr/bin/env bash

# 1. Collect all .java files
files=( *.java )

# Check if any exist
if [ ! -e "${files[0]}" ]; then
    echo "No .java files found."
    exit 1
fi

echo "--- Java File Stepper ---"
echo "Press [ENTER] to cat the file, or 'n' to skip to the next one."
echo "--------------------------"

# 2. Loop through every file in the array
for file in "${files[@]}"; do
    # Prompt the user for the current file
    read -p "View '$file'? [Enter=Yes / n=Skip / q=Quit]: " choice

    # 3. Handle the input
    case "$choice" in
        "q"|"Q") 
            echo "Exiting..."
            break 
            ;;
        "n"|"N") 
            echo "Skipping $file..."
            continue 
            ;;
        "") 
            # Empty string means the user just hit Enter
            display_name="${file%.java}";
            echo "$display_name"
            javac $file
            java $display_name
            echo -e "\n--- Content of $file ---"
            #cat "$file"
            echo -e "--------------------------\n"
            ;;
        *)
            echo "Skipping... (Invalid input)"
            ;;
    esac
done

echo "Done iterating through files."