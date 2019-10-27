FROM openjdk:8
ADD target/spring-boot-docker-example-0.0.1-SNAPSHOT.jar spring-boot-docker-example-0.0.1-SNAPSHOT.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "spring-boot-docker-example-0.0.1-SNAPSHOT.jar"]