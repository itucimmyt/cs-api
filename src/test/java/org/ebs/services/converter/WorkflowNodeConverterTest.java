package org.ebs.services.converter;

import static org.assertj.core.api.Assertions.assertThat;

import org.ebs.model.WorkflowNodeModel;
import org.ebs.services.to.WorkflowNodeTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class WorkflowNodeConverterTest {

    private final WorkflowNodeConverter subject = new WorkflowNodeConverter();

    @Test
    public void givenNotNullSource_whenConvert_thenReturnToObject() {
        WorkflowNodeModel object = initWorkflowNodeModel();
        WorkflowNodeTo result = subject.convert(object);
        
        assertThat(result).extracting("description", "help", "id", "name", "requireApproval", "sequence", "tenant")
            .containsExactly("a description", "a help", 123, "a name", true, 2, 1);
    }

    private WorkflowNodeModel initWorkflowNodeModel() {
        final WorkflowNodeModel i = new WorkflowNodeModel();
        i.setDescription("a description");
        i.setHelp("a help");
        i.setId(123);
        i.setName("a name");
        i.setRequireApproval(true);
        i.setSequence(2);
        i.setTenant(1);
        return i;
    }
}