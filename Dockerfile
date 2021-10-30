#Image that we are using
FROM openjdk:latest
ADD target/docker-0.0.1-SNAPSHOT.jar docker.jar
#EXPOSE 8080
ENTRYPOINT ["java", "-jar", "docker.jar"]