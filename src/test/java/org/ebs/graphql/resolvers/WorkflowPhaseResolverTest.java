package org.ebs.graphql.resolvers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.ebs.model.HtmlTagModel;
import org.ebs.model.RequestModel;
import org.ebs.model.WorkflowCFValueModel;
import org.ebs.model.WorkflowNodeCFModel;
import org.ebs.model.repos.RequestRepository;
import org.ebs.model.repos.WorkflowCFValueRepository;
import org.ebs.model.repos.WorkflowNodeCFRepository;
import org.ebs.services.WorkflowPhaseService;
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.WorkflowCFValueTo;
import org.ebs.services.to.WorkflowPhaseTo;
import org.ebs.services.to.Input.RequestInput;
import org.ebs.services.to.Input.WorkflowCFValueInput;
import org.ebs.services.to.Input.WorkflowNodeCFInput;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.core.convert.ConversionService;

@ExtendWith(MockitoExtension.class)
public class WorkflowPhaseResolverTest {

    @Mock WorkflowPhaseService mockWorkflowphaseService;

    WorkflowPhaseResolver subject;

    @BeforeEach
    public void init() {
        subject = new WorkflowPhaseResolver(mockWorkflowphaseService);
    }

    @Test
    public void givenHtmlTagExist_whenGetHtmltag_thenReturnHtmlTag() {
        when(mockWorkflowphaseService.findhtmltag(anyInt()))
            .thenReturn(Optional.of(new HtmlTagTo()));

        WorkflowPhaseTo object = new WorkflowPhaseTo();
        HtmlTagTo result = subject.getHtmltag(object);

        assertThat(result).isNotNull();
    }

    @Test
    public void givenHtmlTagNotExist_whenGetHtmltag_thenReturnNull() {
        when(mockWorkflowphaseService.findhtmltag(anyInt()))
            .thenReturn(Optional.empty());

        WorkflowPhaseTo object = new WorkflowPhaseTo();
        HtmlTagTo result = subject.getHtmltag(object);

        assertThat(result).isNull();
    }
}
