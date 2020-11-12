FROM wso2/micro-integrator:1.1.0
WORKDIR /home/wso2carbon

ENV spring_datasource_url=jdbc:postgresql://{localhost}:{port}/{db}
ENV spring_datasource_username={username}
ENV spring_datasource_password={password}

ENV spring_email_account={email_account}
ENV spring_email_hostname={hostname}
ENV spring_email_port={port}
ENV spring_email_enable_tls={enable_tls}
ENV $spring_email_auth={auth}
ENV spring_email_username={username}
ENV spring_email_password={password}
ENV spring_email_from={from}

COPY entrypoint.sh target/ebs-sg-tnt.jar ./
COPY dataflows/tenantCompositeApplication/target ./wso2mi-1.1.0/repository/deployment/server/carbonapps
COPY dataflows/tenant/dependencies ./wso2mi-1.1.0/lib
COPY dataflows/tenant/deploy ./wso2mi-1.1.0/conf

ENTRYPOINT ["./entrypoint.sh"]
