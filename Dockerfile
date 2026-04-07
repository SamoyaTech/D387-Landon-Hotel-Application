FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/D387-advanced-java-0.0.2-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

