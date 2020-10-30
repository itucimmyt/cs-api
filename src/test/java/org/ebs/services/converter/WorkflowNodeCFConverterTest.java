package org.ebs.services.converter;

import static org.assertj.core.api.Assertions.assertThat;

import org.ebs.model.WorkflowNodeCFModel;
import org.ebs.services.to.WorkflowNodeCFTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class WorkflowNodeCFConverterTest {

    private final WorkflowNodeCFConverter subject = new WorkflowNodeCFConverter();

    @Test
    public void givenNotNullSource_whenConvert_thenReturnToObject() {
        WorkflowNodeCFModel object = initWorkflowNodeCFModel();
        WorkflowNodeCFTo result = subject.convert(object);
        
        assertThat(result).extracting("description", "help", "id", "name", "required", "tenant")
            .containsExactly("a description", "a help", 123, "a name",true, 1);
    }

    private WorkflowNodeCFModel initWorkflowNodeCFModel() {
        final WorkflowNodeCFModel i = new WorkflowNodeCFModel();
        i.setDescription("a description");
        i.setHelp("a help");
        i.setId(123);
        i.setName("a name");
        i.setDeleted(false);
        i.setRequired(true);
        i.setTenant(1);
        return i;
    }
}