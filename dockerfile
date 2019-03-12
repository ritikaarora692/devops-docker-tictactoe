From tomcat:8-jre8

#Maintainer
MAINTAINER "ritika arora"

#Copy war to tomcat path
RUN wget -O /usr/local/tomcat/webapps/messenger.war --user admin --password admin http://10.127.126.113:8081/artifactory/rarora_3146991_java/com/nagarro/nagp/messenger/0.0.1-SNAPSHOT/messenger-0.0.1-SNAPSHOT.war

EXPOSE 8080

CMD /usr/local/tomcat/bin/catalina.sh run