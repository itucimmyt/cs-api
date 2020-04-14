echo "Compiling artifacts..."
docker volume create --name maven-repo

docker run -it --rm \
-v maven-repo:/root/.m2 \
-v "$(pwd)":/usr/src \
-w /usr/src \
maven:3.6.3-ibmjava-8-alpine \
mvn clean install && \
mvn clean -f dataflows/integrator -Dmaven.test.skip=true install && \
mvn -f dataflows/integratorCompositeApplication -Dmaven.test.skip=true clean package

echo "building image: ebs-sg-{domain}:{version-tag} ..."
docker build -t {domain}:{version-tag} .
