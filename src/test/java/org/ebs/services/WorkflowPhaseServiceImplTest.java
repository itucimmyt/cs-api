package org.ebs.services;

import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.ebs.model.WorkflowPhaseModel;
import org.ebs.model.WorkflowStageModel;
import org.ebs.model.repos.ActionRepository;
import org.ebs.model.repos.HtmlTagRepository;
import org.ebs.model.repos.WorkflowEventRepository;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.ebs.model.repos.WorkflowPhaseRepository;
import org.ebs.model.repos.WorkflowRepository;
import org.ebs.model.repos.WorkflowStageRepository;
import org.ebs.services.to.WorkflowPhaseTo;
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.Input.HtmlTagInput;
import org.ebs.services.to.Input.WorkflowInput;
import org.ebs.services.to.Input.WorkflowPhaseInput;
import org.ebs.services.to.Input.WorkflowStageInput;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.core.convert.ConversionService;

@ExtendWith(MockitoExtension.class)
public class WorkflowPhaseServiceImplTest {
    private WorkflowPhaseServiceImpl subject;

    @Mock WorkflowStageRepository mockWorkflowstageRepository;
    @Mock WorkflowPhaseRepository mockWorkflowphaseRepository;
    @Mock HtmlTagRepository mockHtmltagRepository;
    @Mock WorkflowRepository mockWorkflowRepository;
    @Mock ConversionService mockConverter;
    

    @BeforeEach
    public void init() {
        subject = new WorkflowPhaseServiceImpl(mockWorkflowphaseRepository, mockConverter
        , mockWorkflowRepository, mockHtmltagRepository, mockWorkflowstageRepository);
    }

    @Test
    public void givenWorkflowNotExist_whenInitWorkflowPhaseModel_thenThrowException() {
        when(mockWorkflowRepository.findById(anyInt()))
            .thenReturn(Optional.empty());
        
        WorkflowPhaseInput input = new WorkflowPhaseInput();
        input.setWorkflow(new WorkflowInput());;

        assertThrows("workflow validation must fail", RuntimeException.class
            ,() -> subject.initWorkflowPhaseModel(input, new WorkflowPhaseModel()));
    }

    @Test
    public void givenHtmlTagNotExist_whenInitWorkflowPhaseModel_thenThrowException() {
        when(mockHtmltagRepository.findById(anyInt()))
            .thenReturn(Optional.empty());
        
        WorkflowPhaseInput input = new WorkflowPhaseInput();
        input.setHtmltag(new HtmlTagInput());;

        assertThrows("htmltag validation must fail", RuntimeException.class
            ,() -> subject.initWorkflowPhaseModel(input, new WorkflowPhaseModel()));
    }

    public void givenNotNullObject_whencreateWorkflowPhase_thenCreateWorkflowPhase() {
        when(mockConverter.convert(any(), eq(WorkflowPhaseModel.class)))
            .thenReturn(new WorkflowPhaseModel());
        when(mockConverter.convert(any(), eq(WorkflowPhaseTo.class)))
            .thenReturn(new WorkflowPhaseTo());

        WorkflowPhaseInput objectInput = new WorkflowPhaseInput();
        subject.createworkflowphase(objectInput);

        verify(mockConverter).convert(eq(objectInput), eq(WorkflowPhaseModel.class));
        verify(mockConverter).convert(any(), eq(WorkflowPhaseTo.class));
        verify(mockWorkflowphaseRepository).save(any());

    }

    @Test
    public void givenObjectExist_whenModifyWorkflowPhase_thenUpdateWorkflowPhase() {
        when(mockConverter.convert(any(), eq(WorkflowPhaseModel.class)))
            .thenReturn(new WorkflowPhaseModel());
        when(mockConverter.convert(any(), eq(WorkflowPhaseTo.class)))
            .thenReturn(new WorkflowPhaseTo());
        when(mockWorkflowphaseRepository.findById(anyInt()))
            .thenReturn(Optional.of(new WorkflowPhaseModel()));

        WorkflowPhaseInput objectInput = new WorkflowPhaseInput();
        subject.modifyworkflowphase(objectInput);
    
        verify(mockConverter)
            .convert(eq(objectInput), eq(WorkflowPhaseModel.class));
        verify(mockConverter)
            .convert(any(), eq(WorkflowPhaseTo.class));
        verify(mockWorkflowphaseRepository)
            .findById(anyInt());
        verify(mockWorkflowphaseRepository).save(any());
    }

    @Test
    public void givenObjectNotExist_whenModifyWorkflowPhage_thenThrowException() {
        when(mockWorkflowphaseRepository.findById(anyInt()))
            .thenReturn(Optional.empty());

        assertThrows("find workflowphase must fail", RuntimeException.class
            ,() -> subject.modifyworkflowphase(new WorkflowPhaseInput()));
        
        verify(mockWorkflowphaseRepository).findById(anyInt());

    }
}
