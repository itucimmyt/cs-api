package org.ebs.services;

import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.ebs.model.WorkflowStageModel;
import org.ebs.model.repos.ActionRepository;
import org.ebs.model.repos.HtmlTagRepository;
import org.ebs.model.repos.WorkflowEventRepository;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.ebs.model.repos.WorkflowPhaseRepository;
import org.ebs.model.repos.WorkflowStageRepository;
import org.ebs.services.to.WorkflowStageTo;
import org.ebs.services.to.Input.HtmlTagInput;
import org.ebs.services.to.Input.WorkflowPhaseInput;
import org.ebs.services.to.Input.WorkflowStageInput;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.core.convert.ConversionService;

@ExtendWith(MockitoExtension.class)
public class WorkflowStageServiceImplTest {
    private WorkflowStageServiceImpl subject;

    @Mock ActionRepository mockActionRepository;
    @Mock WorkflowStageRepository mockWorkflowstageRepository;
    @Mock WorkflowPhaseRepository mockWorkflowphaseRepository;
    @Mock WorkflowEventRepository mockWorkfloweventRepository;
    @Mock HtmlTagRepository mockHtmltagRepository;
    @Mock WorkflowNodeRepository mockWorkflownodeRepository;
    @Mock ConversionService mockConverter;

    @BeforeEach
    public void init() {
        subject = new WorkflowStageServiceImpl(mockActionRepository, mockWorkflowstageRepository, mockConverter, mockWorkflowphaseRepository, mockWorkfloweventRepository, mockHtmltagRepository, mockWorkflownodeRepository);
    }

    @Test
    public void givenWorkflowPhaseNotExist_whenInitWorkflowStageModel_thenThrowException() {
        when(mockWorkflowphaseRepository.findById(anyInt()))
            .thenReturn(Optional.empty());
        
        WorkflowStageInput input = new WorkflowStageInput();
        input.setworkflowphase(new WorkflowPhaseInput());;

        assertThrows("workflowphase validation must fail", RuntimeException.class
            ,() -> subject.initWorkflowStage(input, new WorkflowStageModel()));
    }

    @Test
    public void givenHtmlTagNotExist_whenInitWorkflowStageModel_thenThrowException() {
        when(mockHtmltagRepository.findById(anyInt()))
            .thenReturn(Optional.empty());
        
        WorkflowStageInput input = new WorkflowStageInput();
        input.sethtmltag(new HtmlTagInput());;

        assertThrows("htmltag validation must fail", RuntimeException.class
            ,() -> subject.initWorkflowStage(input, new WorkflowStageModel()));
    }

    @Test
    public void givenObjectExist_whenModifyWorkflowStage_thenUpdateWorkflowStage() {
        when(mockConverter.convert(any(), eq(WorkflowStageModel.class)))
            .thenReturn(new WorkflowStageModel());
        when(mockConverter.convert(any(), eq(WorkflowStageTo.class)))
            .thenReturn(new WorkflowStageTo());
        when(mockWorkflowstageRepository.findById(anyInt()))
            .thenReturn(Optional.of(new WorkflowStageModel()));

        WorkflowStageInput objectInput = new WorkflowStageInput();
        subject.modifyWorkflowStage(objectInput);
    
        verify(mockConverter)
            .convert(eq(objectInput), eq(WorkflowStageModel.class));
        verify(mockConverter)
            .convert(any(), eq(WorkflowStageTo.class));
        verify(mockWorkflowstageRepository)
            .findById(anyInt());
        verify(mockWorkflowstageRepository).save(any());
    }

    @Test
    public void givenObjectNotExist_whenModifyWorkflowStage_thenThrowException() {
        when(mockWorkflowstageRepository.findById(anyInt()))
            .thenReturn(Optional.empty());

        assertThrows("find workflowstage must fail", RuntimeException.class
            ,() -> subject.modifyWorkflowStage(new WorkflowStageInput()));
        
        verify(mockWorkflowstageRepository).findById(anyInt());

    }
}
