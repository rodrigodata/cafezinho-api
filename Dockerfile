FROM openjdk:8-jdk-alpine

RUN apk update
RUN apk add maven

COPY pom.xml /usr/local/cafezinho-api/pom.xml
COPY src /usr/local/cafezinho-api/src

WORKDIR /usr/local/cafezinho-api

RUN mvn package

CMD ["java", "-Xmx2g", "-jar", "target/api-test-0.0.1-SNAPSHOT.jar"]