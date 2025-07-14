# ---------- Build Stage ----------
FROM maven:3.9.6-eclipse-temurin-17-alpine as builder

WORKDIR /app

# Copy pom.xml and download dependencies first (for Docker cache efficiency)
COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

# ---------- Run Stage ----------
FROM openjdk:17-jdk-slim

WORKDIR /app

ARG JAR_FILE=/app/target/micr-kfk-order-*.jar
COPY --from=builder  ${JAR_FILE} /app/order-service.jar
ENTRYPOINT ["java", "-jar", "/app/order-service.jar", " --spring.profiles.active=dev"]