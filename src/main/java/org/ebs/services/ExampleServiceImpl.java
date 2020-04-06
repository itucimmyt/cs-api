package org.ebs.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.ebs.model.ExampleParent;
import org.ebs.model.repos.ExampleChildRepository;
import org.ebs.model.repos.ExampleParentRepository;
import org.ebs.services.to.ExampleChildTO;
import org.ebs.services.to.ExampleParentInput;
import org.ebs.services.to.ExampleParentTO;
import org.ebs.util.Connection;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.brapi.BrPagedResponse;
import org.ebs.util.brapi.BrResponse;
import org.ebs.util.brapi.BrapiResponseBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implementations of Service interfaces must use @Service and @Transactional(readOnly = true).
 * If some method requires write access to the persistence layer, it can override this annotation
 * This layer is in charge of:
 * - Control business logic
 * - Invoke repositories to interact with the persistence layer
 * - Cache data for quick access to common used data 
 * Transform Model entities into Transfer Objects (TO) which can be exposed to Graphql and Rest APIs
 */
@Service
@Transactional(readOnly = true)
class ExampleServiceimpl implements ExampleService {

    private static final Logger log = LoggerFactory.getLogger(ExampleServiceimpl.class);

    private ExampleParentRepository exampleParentRepository;
    private ExampleChildRepository exampleChildRepository;
    private ConversionService converter;

    @Autowired
    public ExampleServiceimpl(ExampleParentRepository exampleParentRepository,
            ExampleChildRepository exampleChildRepository, ConversionService converter) {
        this.exampleParentRepository = exampleParentRepository;
        this.exampleChildRepository = exampleChildRepository;
        this.converter = converter;
    }

    /**
     * Example of simple caching
     */
    @Override
    @Cacheable(cacheNames = "ExampleParentTO", unless = "#result == null")
    public Optional<ExampleParentTO> findExample(long exampleParentId) {
        log.debug("calling findExample({})", exampleParentId);
        return exampleParentRepository.findById(exampleParentId)
            .filter(r -> !r.getDeleted().booleanValue())
            .map(r -> converter.convert(r, ExampleParentTO.class));
    }

    @Override
    public Connection<ExampleParentTO> findExamples(List<FilterInput> filters, SortInput sort, PageInput page) {
        log.debug("calling findExamples");
        return exampleParentRepository.findByCriteria(ExampleParent.class, filters, sort, page)
                .map(r -> converter.convert(r, ExampleParentTO.class));
    }

    @Override
    @Cacheable(cacheNames = "ListExampleChildTO", unless = "#result == null")
    public Set<ExampleChildTO> findChildren(long exampleParentId) {
        log.debug("calling findChildren({})", exampleParentId);

        return exampleChildRepository.findByParentId(exampleParentId).stream()
                .map(e -> converter.convert(e, ExampleChildTO.class))
                .collect(Collectors.toSet());
    }

    @Override
    @Transactional(readOnly = false)
    public ExampleParentTO createExampleParent(ExampleParentInput exampleParentInput) {
        log.debug("calling createExampleParent");
        ExampleParent parent = converter.convert(exampleParentInput, ExampleParent.class);
        parent = exampleParentRepository.save(parent);

        return converter.convert(parent, ExampleParentTO.class);
    }

    @Override
    public BrResponse<ExampleParentTO> findBrExample(long exampleDbId) {
        ExampleParentTO exampleParentTO = findExample(exampleDbId).orElse(null);
        exampleParentTO.setChildren(findChildren(exampleDbId));

        log.debug("calling findBrExample({})", exampleDbId);
        return BrapiResponseBuilder.forData(exampleParentTO)
            .withStatusSuccess()
            .build();
    }

    @Override
    public BrPagedResponse<ExampleParentTO> findBrExamples(Pageable pageRequest) {
        Page<ExampleParentTO> exampleParents = exampleParentRepository.findAll(pageRequest)
            .map(e -> converter.convert(e, ExampleParentTO.class));
        
        exampleParents.forEach(e -> e.setChildren(findChildren(e.getId())));

        return BrapiResponseBuilder.forData(exampleParents)
            .withStatusSuccess()
            .build();
    }


}
