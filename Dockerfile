FROM wso2/micro-integrator:1.1.0
WORKDIR /home/wso2carbon

ENV spring_datasource_url=jdbc:postgresql://{localhost}:{port}/{db}
ENV spring_datasource_username={username}
ENV spring_datasource_password={password}

COPY entrypoint.sh target/ebs-sg-tnt.jar ./
COPY dataflows/tenantCompositeApplication/target ./wso2mi-1.1.0/repository/deployment/server/carbonapps

ENTRYPOINT ["./entrypoint.sh"]
