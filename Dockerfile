FROM openjdk:11-jdk-slim
WORKDIR ./
COPY target/ebs-sg-ex.jar .

ENTRYPOINT ["java","-jar","ebs-sg-ex.jar"]
