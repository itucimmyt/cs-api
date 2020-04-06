# EBS Service Gateway - Analytical Request  Manager (Services Project)

This project is the core of a micro service by domain, so it can be added into Service Gateway Platform

## Considerations

 - The micro service can connect to a DB, which is not managed in this project.
 - The should be an API manager component which will manage the microservice access.
 - The main configuration item is the data source, defined in `` src/main/resources/application.yml `` under ``spring.datasource``. The default database configuration follows the standard naming: _ebs-ex-db:port/exdb_. Example: ``jdbc:postgresql://ebs-ex-db:5432/exdb``. username and password default both to **postgres**
 - Endpoints in dataflows connecting with other microservices _must_ point to standard container names: ebs-sg-ex, protocol (http) and port (8290). Example: http://ebs-sg-sm:8290
 - Endpoints for communication with services inside the micro service _must_ be pointing to http://localhost:8080/
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

A Graphql client explorer will be deployed at: ``http://localhost:{port}/playground``

Rest Services will be published as defined in the Resource classes: ``http://localhost:{port}/{resource-path}``

### Build
#### Maven

    mvn package
The artifact will be created in path ``{project-home}/target/ebs-sg-ex.jar``
#### Gradle

    gradle bootJar
The artifact will be created in path ``{project-home}/build/libs/ebs-sg-ex.jar``

#### After build

You can run the artifact as a regular java executable:

    java -jar {project-home}/{artifact-path}/ebs-sg-ex.jar

To override default configuration values:
     
    java -jar build/libs/ebs-sg-ex.jar --spring.datasource.url=jdbc:postgresql://172.17.61.4:5434/mydb --server.port=8083
     

# EBS Service Gateway - Analytical Request  Manager (Dataflows)

Currently dataflows consist of two subprojects of WSO2 micro integrator platform: _ex_ and _exCompositeApplication_, both under ``dataflows`` folder. These projects can be imported in WSO2 Integration Studio as a ESB (Enterprise Service Bus) and Composite projects, respectively.

## Local Development
Consider that Endpoints must be pointing to accessible micro services to work. For simpler cases just a local instance of the services would be enough.

### Importing project in WSO2 Integration Studio
 - Go to Project Explorer (or click on icon  _WSO2 ESB Graphical_ on the upper-right corner)
 - In Project Explorer, right-click on _Import..._
 - select _WSO2 > Existing WSO2 Projects into workspace_ and click _Next_
 - Next to _Select root directory_ text box, click on _Browse_ and select ``dataflows`` folder from the source code project
 - In the projects list box will appear two projects: _ex_ and _exCompositeApplication_. Select both ad click on Finish

The projects must appear now under _Project Explorer_ View.

### Run from Integration Studio

Right click on _exCompositeApplication_ and select ``Export Project Artifacts and Run``. A local instance of the project will be run after logs shows something like this:

    Pass-through HTTP Listener started on 0.0.0.0:8290
    Pass-through HTTPS Listener started on 0.0.0.0:8253
    WSO2 Micro Integrator started in 6 seconds

project artifacts as APIs and Proxies can now be accessed in http://localhost:8290/services. Example: http://localhost:8290/services/exampleProxy

### Run as Docker container
Right click on _exCompositeApplication_ and select ``Generate Docker Image``.

(pending definition)

# EBS Service Gateway - Deploy Micro Service

This method has been tested in Linux (CentOS) environment. Testing under windows is still pending.
## Build Docker image
To build both, services and dataflows artifacts and generate a docker image with them, just run the shell in the root folder of the project:

    ./buildDockerImage.sh

This will generate an image named _ebs-sg-ex:{version-tag}_. Example: _ebs-sg-ex:0.1_

## Deploy container
Run an image based on this generated image. Example:

    docker run -dt -p 8290:8290 --name ebs-sg-ex-0.1 --network ebs-sg-net ebs-sg-ex:0.1

The image created will point to other micro services using standard EBS names, including the Database container.

NOTE: Even though port 8253 is available in the container for HTTPS, it is not recommended to expose it in the host, to enforce use of HTTP for internal communication of micro services. HTTPS comunication will be managed by API Manager.
