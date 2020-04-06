package org.ebs.graphql;

import java.util.Set;

import com.coxautodev.graphql.tools.GraphQLResolver;

import org.ebs.services.ExampleService;
import org.ebs.services.to.ExampleChildTO;
import org.ebs.services.to.ExampleParentTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Example of resolver for a Type
 */
@Component
class ExampleParentResolver implements GraphQLResolver<ExampleParentTO> {

    private ExampleService exampleService;

    @Autowired
    public ExampleParentResolver(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    public Set<ExampleChildTO> getChildren(ExampleParentTO e) {
        return exampleService.findChildren(e.getId());
    }

}