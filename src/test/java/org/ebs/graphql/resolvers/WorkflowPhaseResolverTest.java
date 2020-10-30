package org.ebs.graphql.resolvers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.ebs.services.WorkflowPhaseService;
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.WorkflowPhaseTo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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
        when(mockWorkflowphaseService.findHtmlTag(anyInt()))
            .thenReturn(Optional.of(new HtmlTagTo()));

        WorkflowPhaseTo object = new WorkflowPhaseTo();
        HtmlTagTo result = subject.getHtmltag(object);

        assertThat(result).isNotNull();
    }

    @Test
    public void givenHtmlTagNotExist_whenGetHtmltag_thenReturnNull() {
        when(mockWorkflowphaseService.findHtmlTag(anyInt()))
            .thenReturn(Optional.empty());

        WorkflowPhaseTo object = new WorkflowPhaseTo();
        HtmlTagTo result = subject.getHtmltag(object);

        assertThat(result).isNull();
    }
}
