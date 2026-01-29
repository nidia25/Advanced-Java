#Start base JDK image
FROM openjdk:17-jdk-slim

ARG JAR_FILE=target/*.jar

#Copy project to image
COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar app.jar

#Expose front-end &back-end
EXPOSE 8080 4200

#Run when image started
ENTRYPOINT ["java", "-jar", "/app.jar"]
