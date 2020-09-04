package org.ebs.services;

import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.ebs.model.WorkflowModel;
import org.ebs.model.repos.EntityReferenceRepository;
import org.ebs.model.repos.HtmlTagRepository;
import org.ebs.model.repos.TenantRepository;
import org.ebs.model.repos.WorkflowInstanceRepository;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.ebs.model.repos.WorkflowPhaseRepository;
import org.ebs.model.repos.WorkflowRepository;
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.Input.EntityReferenceInput;
import org.ebs.services.to.Input.HtmlTagInput;
import org.ebs.services.to.Input.TenantInput;
import org.ebs.services.to.Input.WorkflowInput;
import org.ebs.services.to.Input.WorkflowNodeInput;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.core.convert.ConversionService;

@ExtendWith(MockitoExtension.class)
public class WorkflowServiceImplTest {

    private WorkflowServiceImpl subject;

    @Mock WorkflowRepository mockWorkflowRepository;
    @Mock WorkflowNodeRepository mockWorkflowNodeRepository;
    @Mock ConversionService mockConverter;
    @Mock WorkflowPhaseRepository mockWorkflowphaseRepository;
    @Mock EntityReferenceRepository mockEntityreferenceRepository;
    @Mock TenantRepository mockTenantRepository;
    @Mock HtmlTagRepository mockHtmltagRepository;
    @Mock WorkflowInstanceRepository mockWorkflowinstanceRepository;

    @BeforeEach
    public void init() {
        subject = new WorkflowServiceImpl(mockWorkflowNodeRepository, mockWorkflowRepository, mockConverter, mockWorkflowphaseRepository, mockEntityreferenceRepository, mockTenantRepository, mockHtmltagRepository, mockWorkflowinstanceRepository);
    }
    @Test
    public void givenNotNullObject_whenCreateWorkflow_thenCreateWorkflow() {
        when(mockConverter.convert(any(), eq(WorkflowModel.class)))
            .thenReturn(new WorkflowModel());
        when(mockConverter.convert(any(), eq(WorkflowTo.class)))
            .thenReturn(new WorkflowTo());

        WorkflowInput objectInput = new WorkflowInput();
        subject.createWorkflow(objectInput);

        verify(mockConverter, times(1))
            .convert(eq(objectInput), eq(WorkflowModel.class));
        verify(mockConverter, times(1))
            .convert(any(), eq(WorkflowTo.class));
        verify(mockWorkflowRepository, times(1))
            .save(any());
    }

    @Test
    public void givenObjectExist_whenModifyWorkflow_thenUpdateWorkflow() {
        when(mockConverter.convert(any(), eq(WorkflowModel.class)))
            .thenReturn(new WorkflowModel());
        when(mockConverter.convert(any(), eq(WorkflowTo.class)))
            .thenReturn(new WorkflowTo());
        when(mockWorkflowRepository.findById(anyInt()))
            .thenReturn(Optional.of(new WorkflowModel()));

        WorkflowInput objectInput = new WorkflowInput();
        subject.modifyWorkflow(objectInput);

        verify(mockConverter, times(1))
            .convert(eq(objectInput), eq(WorkflowModel.class));
        verify(mockConverter, times(1))
            .convert(any(), eq(WorkflowTo.class));
        verify(mockWorkflowRepository, times(1))
            .findById(anyInt());
        verify(mockWorkflowRepository, times(1))
            .save(any());
    }

    @Test
    public void givenObjectNotExist_whenModifyWorkflow_thenThrowException() {
        when(mockWorkflowRepository.findById(anyInt()))
            .thenReturn(Optional.empty());

        assertThrows("find workflow must fail", RuntimeException.class
            ,() -> subject.modifyWorkflow(new WorkflowInput()));
        
        verify(mockWorkflowRepository, times(1))
            .findById(anyInt());
    }

    @Test
    public void givenHtmlTagNotExist_whenInitWorkflowModel_thenThrowException() {
        when(mockHtmltagRepository.findById(anyInt()))
            .thenReturn(Optional.empty());
        
        WorkflowInput input = new WorkflowInput();
        input.sethtmltag(new HtmlTagInput());

        assertThrows("htmltag validation must fail", RuntimeException.class
            ,() -> subject.initWorkflowModel(input, new WorkflowModel()));
    }

    @Test
    public void givenEntityReferenceNotExist_whenInitWorkflowModel_thenThrowException() {
        when(mockEntityreferenceRepository.findById(anyInt()))
            .thenReturn(Optional.empty());
        
        WorkflowInput input = new WorkflowInput();
        input.setentityreference(new EntityReferenceInput());

        assertThrows("entityreference validation must fail", RuntimeException.class
            ,() -> subject.initWorkflowModel(input, new WorkflowModel()));
    }

    @Test
    public void givenTenantNotExist_whenInitWorkflowModel_thenThrowException() {
        when(mockTenantRepository.findById(anyInt()))
            .thenReturn(Optional.empty());
        
        WorkflowInput input = new WorkflowInput();
        input.settenant(new TenantInput());

        assertThrows("tenant validation must fail", RuntimeException.class
            ,() -> subject.initWorkflowModel(input, new WorkflowModel()));
    }

    @Test
    public void givenWorkflowNodeNotExist_whenInitWorkflowModel_thenThrowException() {
        when(mockWorkflowNodeRepository.findById(anyInt()))
            .thenReturn(Optional.empty());
        
        WorkflowInput input = new WorkflowInput();
        input.setworkflownode(new WorkflowNodeInput());

        assertThrows("WorkflowNode validation must fail", RuntimeException.class
            ,() -> subject.initWorkflowModel(input, new WorkflowModel()));
    }

}