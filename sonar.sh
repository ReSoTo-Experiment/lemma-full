#export SONAR_TOKEN=b9899ece1eb6557720cb012ac53e222ba3885ba5
mvn -Dproject.settings=../sonar.properties -Dsonar.token=b9899ece1eb6557720cb012ac53e222ba3885ba5 clean install sonar:sonar