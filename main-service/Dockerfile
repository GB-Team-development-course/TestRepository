FROM openjdk:17
LABEL org.opencontainers.image.authors="com.geekbrains.web"
ADD target/*.jar main-service.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "main-service.jar"]
