for file in sample1/* ; do 
 if [ -f "$file" ] then 
  echo "$file"
 fi
done