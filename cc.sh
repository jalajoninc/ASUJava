#!/usr/bin/env bash

javac Hello.java
java Hello

files=( *.java )
for i in "${!files[@]}"; do
    echo "$((i+1))) ${files[$i]}"
done
