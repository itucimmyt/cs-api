package org.ebs;


import org.ebs.util.DateCoercing;
import org.ebs.util.DateTimeCoercing;
import org.ebs.util.UUIDCoercing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import graphql.schema.GraphQLScalarType;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

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
}
