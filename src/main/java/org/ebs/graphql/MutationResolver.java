package org.ebs.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
class MutationResolver implements GraphQLMutationResolver {
}