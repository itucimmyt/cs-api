package org.ebs.services.converter;

import static org.assertj.core.api.Assertions.assertThat;

import org.ebs.model.WorkflowModel;
import org.ebs.services.to.Input.WorkflowInput;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class WorkflowInputConverterTest {

    private final WorkflowInputConverter subject = new WorkflowInputConverter();

    @Test
    public void givenNotNullSource_whenConvert_thenReturnToObject() {
        WorkflowInput object = initWorkflowInput();
        WorkflowModel result = subject.convert(object);
        
        assertThat(result).extracting("id", "definition", "description", "help", "icon", "name", "sortno", "title")
            .containsExactly(123, "a definition", "a description", "a help", "an icon", "a name", 12, "a title");
    }

    private WorkflowInput initWorkflowInput() {
        final WorkflowInput w = new WorkflowInput();
        w.setId(123);
        w.setDefinition("a definition");
        w.setDescription("a description");
        w.setHelp("a help");
        w.setIcon("an icon");
        w.setName("a name");
        w.setSortno(12);
        w.setTitle("a title");
        return w;
    }
}