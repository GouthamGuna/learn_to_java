@ECHO ON 

%CLASSPATH%=C:\Program Files\Java\jre1.8.0_111\bin

cd /D D:\CERPSOFT\application\tomcat\webapps\NationalAssociation\WEB-INF\classes

set classpath=%classpath%;D:\CERPSOFT\application\tomcat\webapps\NationalAssociation\WEB-INF\lib\*;



java -Xmx1024m com.centris.util.AttendancePostingFromAdmstoMysql



end



