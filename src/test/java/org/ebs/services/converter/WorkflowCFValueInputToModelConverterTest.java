package org.ebs.services.converter;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Instant;
import java.util.Date;

import org.ebs.model.WorkflowCFValueModel;
import org.ebs.services.to.WorkflowCFValueTo;
import org.ebs.services.to.Input.RequestInput;
import org.ebs.services.to.Input.WorkflowCFValueInput;
import org.ebs.services.to.Input.WorkflowNodeCFInput;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class WorkflowCFValueInputToModelConverterTest {

    private final WorkflowCFValueInputToModelConverter subject = new WorkflowCFValueInputToModelConverter();

    @Mock private RequestInput mockRequestInput;
    @Mock private WorkflowNodeCFInput mockWorkflowNodeCF;

    @Test
    public void givenNotNullSource_whenConvert_thenReturnModelObject() {
        Date now = Date.from(Instant.now());
        WorkflowCFValueInput object = initWorkflowCFValueInput();
        object.setDateValue(now);
        WorkflowCFValueModel result = subject.convert(object);
        
        assertThat(result).extracting("codeValue", "dateValue", "flagValue", "id", "numValue", 
                "request", "tenant", "textValue", "workflowNodeCF")
            .containsExactly(99,now,true,1,456,
                null,1,"a textValue", null);
    }

    private WorkflowCFValueInput initWorkflowCFValueInput() {
        final WorkflowCFValueInput i = new WorkflowCFValueInput();
        i.setCodeValue(99);
        i.setFlagValue(true);
        i.setId(1);
        i.setNumValue(456);
        i.setRequest(mockRequestInput);
        i.setTenant(1);
        i.setTextValue("a textValue");
        i.setWorkflowNodeCF(mockWorkflowNodeCF);
        return i;
    }
}