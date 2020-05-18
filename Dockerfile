FROM wso2/micro-integrator:1.1.0
WORKDIR /home/wso2carbon

ENV spring.datasource.url=jdbc:postgresql://{hostname}:{port}/{databasename}
ENV spring.datasource.username=username
ENV spring.datasource.password=password

<<<<<<< HEAD
#COPY dataflows/integratorCompositeApplication/target ./wso2mi-1.1.0/repository/deployment/server/carbonapps
=======
COPY ./target ./wso2mi-1.1.0/repository/deployment/server/carbonapps
>>>>>>> 46d32622084be55adac0d21bf66d892b0fa75670
COPY entrypoint.sh target/ebs-sg-tnt.jar ./

ENTRYPOINT ["./entrypoint.sh"]


#docker run -dit --name ebs-sg-tnt  --network ebs-sg-net -p 8080:8080  -e spring.datasource.url=jdbc:postgresql://ebs-database:5432/tenant -e spring.datasource.username=postgres -e spring.datasource.password=0*k2K7oP*tSM 
