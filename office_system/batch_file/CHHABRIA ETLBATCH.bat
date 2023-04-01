@ECHO ON 

%CLASSPATH%=C:\Program Files\Java\jre7\bin

cd /D D:\CERP\Application\Apache Software Foundation\Tomcat 7.0\webapps\Chhabria_Tiles\WEB-INF\classes


set classpath=%classpath%;D:\CERP\Application\Apache Software Foundation\Tomcat 7.0\webapps\Chhabria_Tiles\WEB-INF\lib\*;



java -Xmx1024m com.centris.util.AttedencePostingFromMdbToMySql



end



