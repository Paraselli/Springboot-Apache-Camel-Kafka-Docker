FROM openjdk:17
COPY target/camel-enterprise.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
