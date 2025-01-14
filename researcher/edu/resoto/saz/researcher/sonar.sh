#! /bin/bash
SONAR_TOKEN=940f970dad5774fe5834855711a743a1476bdc36
#mvn -e verify sonar:sonar

mvn clean verify -P sonar -Dsonar.token=940f970dad5774fe5834855711a743a1476bdc36