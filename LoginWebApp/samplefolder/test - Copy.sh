#!/bin/bash
for file in sample1/*.{jpg,jpeg,png,gif} ; do 
 if [ -f "$file" ]; then
  echo "$file"  
#   cp "$file" test/
 fi
done