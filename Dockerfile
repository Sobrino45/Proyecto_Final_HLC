# Etapa de construcción (builder)
FROM maven:3.8.6-openjdk-21 AS builder
WORKDIR /app
COPY . .
RUN mvn clean install

# Verificar la existencia del archivo JAR después de la construcción
RUN ls -l /app/target/

# Etapa de ejecución
FROM openjdk:21-jdk
COPY --from=builder /app/target/Proyecto_Final_HLC-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
