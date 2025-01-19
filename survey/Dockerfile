FROM eclipse-temurin:21.0.5_11-jre-jammy
#RUN addgroup spring && adduser spring -G spring
#USER spring:spring
RUN mkdir /app
ARG JAR_VERSION=0.0.1-SNAPSHOT
COPY target/survey-full-${JAR_VERSION}.jar /app/wearableprocessor.jar
ENTRYPOINT ["java","-jar","/app/wearableprocessor.jar"]

# How to build this docker file
# docker build --build-arg JAR_VERSION=0.0.1-snapshot -t defjef/sazdatastreamsapi:0.0.1  .

# docker pull eclipse-temurin:20.0.2_9-jdk-jammy
