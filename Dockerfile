FROM maven:3-openjdk-17 AS build
COPY . .
RUN mvn clean packege -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/management-0.0.1-SNAPSHOT.jar management.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]

