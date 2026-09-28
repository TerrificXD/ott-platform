FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY target/audit-log-service-*.jar app.jar
EXPOSE 8092
ENTRYPOINT ["java", "-jar", "app.jar"]
