FROM ismeade/java:openjdk8-jre-alpine
ADD /service-feign-1.0-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8765
