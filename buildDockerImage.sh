echo "Compiling artifacts..."
docker volume create --name maven-repo

docker run -it --rm \
-v maven-repo:/root/.m2 \
-v "$(pwd)":/usr/src \
-w /usr/src \
maven:3.6.3-ibmjava-8-alpine \
mvn clean install

docker run -it --rm \
-v maven-repo:/root/.m2 \
-v "$(pwd)":/usr/src \
-w /usr/src/dataflows/integrator \
maven:3.6.3-ibmjava-8-alpine \
mvn -Dmaven.test.skip=true clean install

docker run -it --rm \
-v maven-repo:/root/.m2 \
-v "$(pwd)":/usr/src \
-w /usr/src/dataflows/integratorCompositeApplication \
maven:3.6.3-ibmjava-8-alpine \
mvn -Dmaven.test.skip=true clean package

echo "building image: ebs-sg-tnt:0.1 ..."
docker build -t ebs-sg-tnt:0.1 .
