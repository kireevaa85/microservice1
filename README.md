# Microservice1 for JaCoCo Agent

See: https://www.jacoco.org/jacoco/trunk/doc/agent.html,
    https://www.jacoco.org/jacoco/trunk/doc/api/org/jacoco/agent/rt/IAgent.html (if JMX=true)
java -javaagent:[yourpath/]jacocoagent.jar=[option1]=[value1],[option2]=[value2]

java -javaagent:C:\projects_gpb\executiondataserver\libs\coverage-1.0.0.133-t82fj05.jar=includes=ru.gpb.rkk2.*,sessionid=microservice1-1.0.0.371-f76fj36,output=tcpclient,address=127.0.0.1,port=6300,jmx=true -jar build/libs/microservice1-1.0.0.371-f76fj36.jar

