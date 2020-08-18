package org.ebs.services.converter;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Instant;
import java.util.Date;

import org.ebs.model.RequestModel;
import org.ebs.model.WorkflowCFValueModel;
import org.ebs.model.WorkflowNodeCFModel;
import org.ebs.services.to.WorkflowCFValueTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class WorkflowCFValueModelToTOConverterTest {

    private final WorkflowCFValueModelToTOConverter subject = new WorkflowCFValueModelToTOConverter();

    @Mock private RequestModel mockRequestModel;
    @Mock private WorkflowNodeCFModel mockWorkflowNodeCFModel;

    @Test
    public void givenNotNullSource_whenConvert_thenReturnToObject() {
        Date now = Date.from(Instant.now());
        WorkflowCFValueModel object = initWorkflowCFValueModel();
        object.setDateValue(now);
        WorkflowCFValueTo result = subject.convert(object);
        
        assertThat(result).extracting("codeValue", "dateValue", "flagValue", "id", "numValue", 
                "request", "tenant", "textValue", "workflowNodeCF")
            .containsExactly(99,now,true,1,456,
                null,1,"a textValue", null);
    }

    private WorkflowCFValueModel initWorkflowCFValueModel() {
        final WorkflowCFValueModel i = new WorkflowCFValueModel();
        i.setCodeValue(99);
        i.setFlagValue(true);
        i.setId(1);
        i.setNumValue(456);
        i.setRequest(mockRequestModel);
        i.setTenant(1);
        i.setTextValue("a textValue");
        i.setWorkflowNodeCF(mockWorkflowNodeCFModel);
        return i;
    }
}