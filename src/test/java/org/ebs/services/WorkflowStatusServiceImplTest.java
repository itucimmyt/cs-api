package org.ebs.services;

import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.ebs.model.WorkflowStatusModel;
import org.ebs.model.repos.WorkflowInstanceRepository;
import org.ebs.model.repos.WorkflowStatusRepository;
import org.ebs.model.repos.WorkflowStatusTypeRepository;
import org.ebs.services.to.WorkflowStatusTo;
import org.ebs.services.to.Input.WorkflowInstanceInput;
import org.ebs.services.to.Input.WorkflowStatusInput;
import org.ebs.services.to.Input.WorkflowStatusTypeInput;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.core.convert.ConversionService;

@ExtendWith(MockitoExtension.class)
public class WorkflowStatusServiceImplTest {
    private WorkflowStatusServiceImpl subject;

    @Mock WorkflowInstanceRepository mockWorkflowinstanceRepository;
    @Mock WorkflowStatusTypeRepository mockWorkflowstatustypeRepository;
    @Mock ConversionService mockConverter;
    @Mock WorkflowStatusRepository mockWorkflowstatusRepository;

    @BeforeEach
    public void init() {
        subject = new WorkflowStatusServiceImpl(mockWorkflowinstanceRepository, mockWorkflowstatustypeRepository, mockConverter, mockWorkflowstatusRepository);
    }

    @Test
    public void givenNotNullObject_whenCreateWorkflowStatus_thenCreateWorkflowStatus() {
        when(mockConverter.convert(any(), eq(WorkflowStatusModel.class)))
            .thenReturn(new WorkflowStatusModel());
        when(mockConverter.convert(any(), eq(WorkflowStatusTo.class)))
            .thenReturn(new WorkflowStatusTo());

        WorkflowStatusInput objectInput = new WorkflowStatusInput();
        subject.createWorkflowStatus(objectInput);

        verify(mockConverter).convert(eq(objectInput), eq(WorkflowStatusModel.class));
        verify(mockConverter).convert(any(), eq(WorkflowStatusTo.class));
        verify(mockWorkflowstatusRepository).save(any());

    }

    @Test
    public void givenWorkflowInstanceNotExist_whenInitWorkflowStatusModel_thenThrowException() {
        when(mockWorkflowinstanceRepository.findById(anyInt()))
            .thenReturn(Optional.empty());
        
        WorkflowStatusInput input = new WorkflowStatusInput();
        input.setWorkflowinstance(new WorkflowInstanceInput());;

        assertThrows("workflowinstance validation must fail", RuntimeException.class
            ,() -> subject.initWorkflowStatus(input, new WorkflowStatusModel()));
    }

    @Test
    public void givenWorkflowStatusTypeNotExist_whenInitWorkflowStatusModel_thenThrowException() {
        when(mockWorkflowstatustypeRepository.findById(anyInt()))
            .thenReturn(Optional.empty());
        
        WorkflowStatusInput input = new WorkflowStatusInput();
        input.setWorkflowstatustype(new WorkflowStatusTypeInput());;

        assertThrows("workflowStatustype validation must fail", RuntimeException.class
            ,() -> subject.initWorkflowStatus(input, new WorkflowStatusModel()));
    }

    @Test
    public void givenObjectExist_whenModifyWorkflowStatus_thenUpdateWorkflowStatus() {
        when(mockConverter.convert(any(), eq(WorkflowStatusModel.class)))
            .thenReturn(new WorkflowStatusModel());
        when(mockConverter.convert(any(), eq(WorkflowStatusTo.class)))
            .thenReturn(new WorkflowStatusTo());
        when(mockWorkflowstatusRepository.findById(anyInt()))
            .thenReturn(Optional.of(new WorkflowStatusModel()));

        WorkflowStatusInput objectInput = new WorkflowStatusInput();
        subject.modifyWorkflowStatus(objectInput);
    
        verify(mockConverter)
            .convert(eq(objectInput), eq(WorkflowStatusModel.class));
        verify(mockConverter)
            .convert(any(), eq(WorkflowStatusTo.class));
        verify(mockWorkflowstatusRepository)
            .findById(anyInt());
        verify(mockWorkflowstatusRepository).save(any());
    }

    @Test
    public void givenObjectNotExist_whenModifyWorkflowStatus_thenThrowException() {
        when(mockWorkflowstatusRepository.findById(anyInt()))
            .thenReturn(Optional.empty());

        assertThrows("find workflowstatus must fail", RuntimeException.class
            ,() -> subject.modifyWorkflowStatus(new WorkflowStatusInput()));
        
        verify(mockWorkflowstatusRepository).findById(anyInt());

    }
}
