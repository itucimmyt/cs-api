FROM wso2/micro-integrator:1.1.0
WORKDIR /home/wso2carbon

ENV spring_datasource_url=jdbc:postgresql://{localhost}:{port}/{db}
ENV spring_datasource_username={username}
ENV spring_datasource_password={password}

ENV integrator_email_hostname={hostname}
ENV integrator_email_port={port}
ENV integrator_email_enable_tls={enable_tls}
ENV integrator_email_auth={auth}
ENV integrator_email_username={username}
ENV integrator_email_password={password}
ENV integrator_email_from={from}

COPY entrypoint.sh target/ebs-sg-tnt.jar ./
COPY dataflows/tenantCompositeApplication/target ./wso2mi-1.1.0/repository/deployment/server/carbonapps
COPY dataflows/tenant/dependencies ./wso2mi-1.1.0/lib
COPY dataflows/tenant/deploy ./wso2mi-1.1.0/conf

ENTRYPOINT ["./entrypoint.sh"]
