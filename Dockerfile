FROM openjdk:8
LABEL maintainer="CRUD.net"
ADD target/CRUD-demo-0.0.1-SNAPSHOT.jar CRUD.jar
ENTRYPOINT ["java", "-jar", "CRUD.jar"]