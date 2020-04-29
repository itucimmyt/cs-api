# EBS SG Micro Service - Base Project

This project is the core of a micro service by domain, so it can be added into Service Gateway Platform

## Considerations

 - The micro service can connect to a DB, which is not managed in this project.
 - There should be an API manager component which will manage the microservice access.
 - The main configuration item is the data source, found in `` src/main/resources/application.yml `` under ``spring.datasource``. The default database configuration follows the standard naming: _ebs-catalog-db:port/{domaindatabase}_. Example: ``jdbc:postgresql://ebs-tnt-db:5432/tntdb``. username and password default both to **postgres**
 - Endpoints in dataflows connecting with other microservices _must_ point to standard container names: ebs-sg-tnt, protocol (http) and port (8080). Example: http://ebs-sg-tnt:8080
 - Communication over HTTPS will be managed by the upper layer of API Manager

### Building tools

There are two building tools configured for the services component. Developers can use whichever they prefer: Gradle or Maven. If none of these is installed in the development environment, the wrappers for them can be used instead, which will take care of downloading and installing themselves locally.

|dev environment| chosen tool| wrapper
|--|--|--
|Windows|Gradle|gradlew.bat
|Windows|Maven |mvnw.cmd
|*nix   |Gradle|gradlew
|*nix   |Maven |mvnw

For the rest of the document, commands will be written as if a local installation of the build tool was available. If necessary, just replace the ``gradle`` or ``mvn`` command with the appropriate wrapper.

## Local Development

### Run from code

How to compile and run the services for local dev & testing
#### Maven

    #run with default values
    mvn spring-boot:run
    
    #run overriding values
    mvn spring-boot:run -D"spring-boot.run.arguments=--spring.datasource.url=jdbc:postgresql://my-new-host:5432/mydb --server.port=8081"
    
#### Gradle

	#run with default values
    gradle bootRun

	#run overriding values
	gradle bootRun --args="--spring.datasource.url=jdbc:postgresql://my-new-host:5432/mydb --server.port=8081"

### After run

When the log displays something like this it means the services are up and running:

    Tomcat started on port(s): 8080 (http) with context path ''
    Started Application in 6.718 seconds (JVM running for 7.074)

A Graphql client explorer will be deployed at: ``http://{host}:{port}/playground``

Graphql endpoint will be in ``http://localhost:{port}/graphql``

Rest Services will be published as defined in the Resource classes: ``http://localhost:{port}/{resource-path}``

### Build
#### Maven

    mvn package
The artifact will be created in path ``{project-home}/target/ebs-sg-tnt.jar``
#### Gradle

    gradle bootJar
The artifact will be created in path ``{project-home}/build/libs/ebs-sg-tnt.jar``

#### After build

You can run the artifact as a regular java executable:

    java -jar {project-home}/{artifact-path}/ebs-sg-tnt.jar

To override default configuration values:
     
    java -jar build/libs/ebs-sg-tnt.jar --spring.datasource.url=jdbc:postgresql://172.17.61.4:5434/mydb --server.port=8083
     

# EBS Service Gateway - Deploy Micro Service

This method has been tested in Linux (CentOS) environment. Testing under windows is still pending.

## Build Docker image

Check _Dockerfile_ and modify ENV variables to access the appropriate database:
    
    ENV spring.datasource.url=jdbc:postgresql://{hostname}:{port}/{databasename}
    ENV spring.datasource.username=username
    ENV spring.datasource.password=password

Run the following script to generate a docker image for the project:

    ./buildDockerImage.sh

This will generate an image named _ebs-sg-tnt:0.1.0_. Example: _ebs-sg-tnt:0.1_
The host running this script just needs docker to be installed, maven and java are not necessary.

## Deploy container
Run an image based on this generated image. Example:

    docker run --rm -dt -p 8080:8080 --name ebs-sg-tnt-0.1 --network ebs-sg-net ebs-sg-tnt:0.1

