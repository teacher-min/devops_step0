FROM openjdk:17-jdk-slim
WORKDIR /app
COPY build/libs/*.jar app.jar
EXPOSE 8080git 
ENTRYPOINT ["java", "-jar", "app.jar"]