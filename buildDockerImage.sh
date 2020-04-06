echo "Compiling artifacts..."
docker volume create --name maven-repo

docker run -it --rm \
-v maven-repo:/root/.m2 \
-v "$(pwd)":/usr/src \
-w /usr/src \
maven:3.6.3-jdk-11-slim mvn clean package

echo "building image: ebs-sg-{domain}:{version-tag} ..."
docker build -t {domain}:{version-tag} .
