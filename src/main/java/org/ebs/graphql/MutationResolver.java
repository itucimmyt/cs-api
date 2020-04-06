package org.ebs.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * Mutations go here. 
 * Due to a bug in API Manager, mutations need to be declared as Queries. The difference is merely semantinc.
 */
@Component
@Validated
class MutationResolver implements GraphQLMutationResolver {
}