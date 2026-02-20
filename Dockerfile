# Use lightweight JDK image
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Copy jar file
COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
