FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/micr-kfk-inventory-service-*.jar
COPY ${JAR_FILE} /app/inventory-service.jar
ENTRYPOINT ["java", "-jar", "/app/inventory-service.jar"]