FROM wso2/micro-integrator:1.1.0
WORKDIR /home/wso2carbon

ENV spring_datasource_url=jdbc:postgresql://172.18.112.1:5432/cimmyt-ebs
ENV spring_datasource_username=postgres
ENV spring_datasource_password=12345

COPY entrypoint.sh target/ebs-sg-tnt.jar ./
COPY dataflows/tenantCompositeApplication/target ./wso2mi-1.1.0/repository/deployment/server/carbonapps

ENTRYPOINT ["./entrypoint.sh"]
