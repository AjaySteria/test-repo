FROM node:7-onbuild

EXPOSE 8080

ADD target/docker-rest-api.jar docker-rest-api.jar

ENTRYPOINT ["java", "-jar", "docker-rest-api.jar"]
