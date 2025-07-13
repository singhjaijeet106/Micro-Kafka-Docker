FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/micr-kfk-order-*.jar
COPY ${JAR_FILE} /app/order-service.jar
ENTRYPOINT ["java", "-jar", "/app/order-service.jar"]