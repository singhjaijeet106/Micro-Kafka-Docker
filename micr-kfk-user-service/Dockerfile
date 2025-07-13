FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/micr-kfk-user-*.jar
COPY ${JAR_FILE} /app/user-service.jar
ENTRYPOINT ["java", "-jar", "/app/user-service.jar"]