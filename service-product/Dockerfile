FROM openjdk:8-jre-alpine
COPY build/libs/service-product-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "/app.jar"]