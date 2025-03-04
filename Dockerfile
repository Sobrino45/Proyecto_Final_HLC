FROM openjdk:17-jdk-slim AS builder
WORKDIR /app
COPY . .
RUN mvn clean install

FROM openjdk:21-jre-slim
COPY --from=builder /app/target/Proyecto_Final_HLC-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
