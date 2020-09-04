package org.ebs.services.converter;

import static org.assertj.core.api.Assertions.assertThat;

import org.ebs.model.WorkflowModel;
import org.ebs.services.to.WorkflowTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class WorkflowConverterTest {

    private final WorkflowConverter subject = new WorkflowConverter();

    @Test
    public void givenNotNullSource_whenConvert_thenReturnToObject() {
        WorkflowModel object = initWorkflowModel();
        WorkflowTo result = subject.convert(object);
        
        assertThat(result).extracting("id", "definition", "description", "help", "icon", "name", "sortno", "title")
            .containsExactly(123, "a definition", "a description", "a help", "an icon", "a name", 12, "a title");
    }

    private WorkflowModel initWorkflowModel() {
        final WorkflowModel w = new WorkflowModel();
        w.setId(123);
        w.setdefinition("a definition");
        w.setdescription("a description");
        w.sethelp("a help");
        w.seticon("an icon");
        w.setname("a name");
        w.setsortno(12);
        w.settitle("a title");
        return w;
    }
}