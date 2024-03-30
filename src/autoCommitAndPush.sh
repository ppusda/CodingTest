baseDir=/c/Users/ppusd/Desktop/JDG/Study/JAVA/CodingTest

cd ${baseDir}

git fetch
flag=`git log --since='18 hour ago' --pretty=format:'%h'`

if [ -n "$flag" ]
then
  echo "커밋 기록이 있습니다."
  exit
fi

filePath=`git status -u -s | head -n 1`
filePath=${filePath:3}
dirPath=$(dirname "$filePath")

if [ -z "$filePath" ]
then
  echo '커밋할 파일이 없습니다.'
  exit
fi

cd $dirPath
filename=`ls -1 | head -1`
commitMsg=`cat $filename | head -1`

if echo "$commitMsg" | grep -q "package"
then
  echo "커밋 메시지를 최상단에 작성해주세요."
  exit
fi

commitMsg=${commitMsg:3}

git add ./
git commit -m "${commitMsg}"
git push origin master