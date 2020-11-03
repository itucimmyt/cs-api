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
-w /usr/src \
maven:3.6.3-ibmjava-8-alpine \
mvn clean -f dataflows/tenant -Dmaven.test.skip=true install

docker run -it --rm \
-v maven-repo:/root/.m2 \
-v "$(pwd)":/usr/src \
-w /usr/src \
maven:3.6.3-ibmjava-8-alpine \
mvn -f dataflows/tenantCompositeApplication -Dmaven.test.skip=true clean package
echo "building image: ebs-sg-tnt:20.11 ..."
docker build -t ebs-sg-tnt:20.11 .
