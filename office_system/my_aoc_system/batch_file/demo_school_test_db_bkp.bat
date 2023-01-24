@echo on
set dr=C:
set mySqlPath=cd C:\Program Files\MySQL\MySQL Server 5.7\bin
set dbHostName=localhost
set dbUser=root
set dbPassword=cERP!1@2#3
set dbName=demo_school_test
set date=%date:~-4%_%date:~4,2%_%date:~7,2%
set hour=%time:~0,2%
if "%hour:~0,1%" == " " set hour=0%hour:~1,1%
echo hour=%hour%
set min=%time:~3,2%
if "%min:~0,1%" == " " set min=0%min:~1,1%
echo min=%min%
set secs=%time:~6,2%
if "%secs:~0,1%" == " " set secs=0%secs:~1,1%
echo secs=%secs%

set currentdate=%date%_%hour%_%min%_%secs%
set bckfile=%currentdate%_%dbName%.sql
set path=C:\Users\Administrator\Desktop\Backup\MainDB\DEMO\%bckfile%

%dr%

%mySqlPath%
mysqldump -h localhost -u root -pcERP!1@2#3 demo_school_test> %path%

echo Done!
