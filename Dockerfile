FROM openjdk:11-jdk-slim
WORKDIR ./
COPY target/ebs-sg-ex.jar .

ENV spring.datasource.url=jdbc:postgresql://{hostname}:{port}/{databasename}
ENV spring.datasource.username=username
ENV spring.datasource.password=password

ENTRYPOINT ["java","-jar","ebs-sg-ex.jar"]
