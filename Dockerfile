FROM wso2/micro-integrator:1.1.0
WORKDIR /home/wso2carbon

ENV spring.datasource.url=jdbc:postgresql://{hostname}:{port}/{databasename}
ENV spring.datasource.username=username
ENV spring.datasource.password=password

COPY entrypoint.sh target/ebs-sg-tnt.jar ./

ENTRYPOINT ["./entrypoint.sh"]
