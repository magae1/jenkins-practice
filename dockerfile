FROM openjdk:17

WORKDIR spring

COPY build/libs/jenkins-practice-0.0.1-SNAPSHOT.jar server.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "server.jar"]