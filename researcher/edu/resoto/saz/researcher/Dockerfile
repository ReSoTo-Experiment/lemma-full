FROM eclipse-temurin:21.0.5_11-jre-jammy
#RUN addgroup spring && adduser spring -G spring
#USER spring:spring
RUN mkdir /app
ARG JAR_VERSION=0.0.1-SNAPSHOT
COPY target/researcher-full-${JAR_VERSION}.jar /app/researcher.jar
ENTRYPOINT ["java","-jar","/app/researcher.jar"]

