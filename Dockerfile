FROM wso2/micro-integrator:1.1.0
WORKDIR /home/wso2carbon

ENV spring.datasource.url=jdbc:postgresql://{hostname}:{port}/{databasename}
ENV spring.datasource.username=username
ENV spring.datasource.password=password

COPY dataflows/integratorCompositeApplication/target ./wso2mi-1.1.0/repository/deployment/server/carbonapps
COPY entrypoint.sh target/ebs-sg-tnt.jar ./

ENTRYPOINT ["./entrypoint.sh"]
