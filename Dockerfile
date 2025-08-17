FROM ubuntu:latest
FROM openjdk:11-jre-slim
LABEL authors="asadu"

ENTRYPOINT ["top", "-b"]
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]