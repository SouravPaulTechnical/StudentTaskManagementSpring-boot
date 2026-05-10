FROM eclipse-temurin:21

WORKDIR /app

COPY target/StudentTaskManagement-0.0.1-SNAPSHOT.jar.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]