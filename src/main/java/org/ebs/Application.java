package org.ebs;

import java.net.URI;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.ebs.util.DateCoercing;
import org.ebs.util.DateTimeCoercing;
import org.ebs.util.UUIDCoercing;
import org.ebs.util.brapi.B4RapiTokenGenerator;
import org.ebs.util.brapi.BrapiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import graphql.schema.GraphQLScalarType;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public static ThreadLocal<String> REQUEST_TOKEN = new ThreadLocal<>();
	public static Map<String,String> TOKEN_MAP = new ConcurrentHashMap<>();

	@Value("${ebs.sg.tenant.endpoint}")
	private String tenantEndpoint;

	@Value("${ebs.sg.b4rapi.endpoint}")
	private String b4rapiEndpoint;

	@Bean
	public GraphQLScalarType dateScalar() {
		return GraphQLScalarType.newScalar()
			.name("Date")
			.description("Date Scalar, custom implementation")
			.coercing(new DateCoercing())
			.build();
	}

	@Bean
	public GraphQLScalarType datetimeScalar() {
		return GraphQLScalarType.newScalar()
			.name("Datetime")
			.description("Datetime Scalar, custom implementation")
			.coercing(new DateTimeCoercing())
			.build();
	}

	@Bean
	public GraphQLScalarType uuidScalar() {
		return GraphQLScalarType.newScalar()
			.name("Uuid")
			.description("Uuid Scalar, custom implementation")
			.coercing(new UUIDCoercing())
			.build();
	}

	@Bean
	@Autowired
	BrapiClient b4rApiClient(B4RapiTokenGenerator b4rTokenGenerator) {
		return new BrapiClient(URI.create(b4rapiEndpoint), b4rTokenGenerator);
	}
}
