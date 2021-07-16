FROM openjdk:11.0-jdk-slim

WORKDIR /app

COPY target/*.jar ./application.jar

EXPOSE 8080

CMD java -jar application.jar

ENTRYPOINT [ "/bin/bash" ]