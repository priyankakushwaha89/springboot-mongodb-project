FROM openjdk:17

COPY target/sport.jar sportimage.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","sportimage.jar"]