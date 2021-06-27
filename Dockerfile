FROM openjdk:11
ADD target/springboot-docker-app-0.0.1-SNAPSHOT.jar docker-springboot-app.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-springboot-app.jar"]