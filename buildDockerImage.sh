echo "Compiling artifacts..."
docker volume create --name maven-repo

docker run -it --rm \
-v maven-repo:/root/.m2 \
-v "$(pwd)":/usr/src \
-w /usr/src \
maven:3.6.3-ibmjava-8-alpine \
mvn clean install && \
mvn clean -f dataflows/integrator clean install && \
mvn -f dataflows/integratorCompositeApplication clean package

echo "building image: ebs-sg-ex:0.1 ..."
docker build -t ebs-sg-ex:0.1 .
