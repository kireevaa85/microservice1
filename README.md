# Microservice1 for JaCoCo Agent

See: https://www.jacoco.org/jacoco/trunk/doc/agent.html,
    https://www.jacoco.org/jacoco/trunk/doc/api/org/jacoco/agent/rt/IAgent.html (if JMX=true)
java -javaagent:[yourpath/]jacocoagent.jar=[option1]=[value1],[option2]=[value2]

java -javaagent:C:\jacoco-0.8.5\lib\jacocoagent.jar=includes=ru.*,
                                                   sessionid=microservice_instance_id,
                                                   output=tcpclient,
                                                   address=127.0.0.1,
                                                   port=6300,
                                                   jmx=true -jar -test.jar

