package org.ebs.graphql;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.ebs.graphql.validation.ValidExampleParentInput;
import org.ebs.services.ExampleService;
import org.ebs.services.to.ExampleParentInput;
import org.ebs.services.to.ExampleParentTO;
import org.ebs.util.Connection;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * Queries go here.
 * Due to a bug in API Manager, mutations (e.g. createExample) are created here. The difference is merely semantinc.
 */
@Component
@Validated
class QueryResolver implements GraphQLQueryResolver {

    private static final Logger log = LoggerFactory.getLogger(QueryResolver.class);

    private ExampleService exampleService;

    @Autowired
    public QueryResolver(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    public ExampleParentTO findExample(@Min(value = 1) int id) {
        log.debug("calling resolver findExampleParentTO({})", id);
        return exampleService.findExample(id)
            .orElse(null);
    }

    public Connection<ExampleParentTO> findExampleList(List<FilterInput> filters, SortInput sort, PageInput page) {
        log.debug("calling resolver findRequestList");
        return exampleService.findExamples(filters, sort, page);
    }

    public ExampleParentTO createExample(@Valid @ValidExampleParentInput ExampleParentInput input) {
        log.debug("calling resolver createExample");
        return exampleService.createExampleParent(input);
    }
}