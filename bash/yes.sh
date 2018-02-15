toEcho="y"
  
if [ ${#1} -gt 1 ]; then
  toEcho=$1
fi

while true; do 
  echo $toEcho
done

