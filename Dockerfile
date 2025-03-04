# Usar openjdk:17-jdk-slim para la compilación
FROM openjdk:17-jdk-slim AS builder
WORKDIR /app
COPY . .
RUN mvn clean install

# Usar openjdk:17-jdk-slim también para la ejecución
FROM openjdk:17-jdk-slim
COPY --from=builder /app/target/Proyecto_Final_HLC-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
