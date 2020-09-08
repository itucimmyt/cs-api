package org.ebs.services;

import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.ebs.model.RequestModel;
import org.ebs.model.WorkflowCFValueModel;
import org.ebs.model.WorkflowNodeCFModel;
import org.ebs.model.repos.RequestRepository;
import org.ebs.model.repos.WorkflowCFValueRepository;
import org.ebs.model.repos.WorkflowNodeCFRepository;
import org.ebs.services.to.WorkflowCFValueTo;
import org.ebs.services.to.Input.RequestInput;
import org.ebs.services.to.Input.WorkflowCFValueInput;
import org.ebs.services.to.Input.WorkflowNodeCFInput;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.core.convert.ConversionService;

@ExtendWith(MockitoExtension.class)
public class WorkflowCFValueServiceImplTest {

    @Mock WorkflowNodeCFRepository mockWorkflownodecfRepository;
    @Mock ConversionService mockConverter;
    @Mock WorkflowCFValueRepository mockWorkflowcfvalueRepository;
    @Mock RequestRepository mockRequestRepository;
    
    private WorkflowCFValueServiceImpl subject;
    
    @BeforeEach
    public void init() {
        subject = new WorkflowCFValueServiceImpl(mockWorkflownodecfRepository, mockRequestRepository, mockConverter, mockWorkflowcfvalueRepository);
    }

    @Test
    public void givenFullObject_whenCreateWorkflowCFValue_thenCreateWFCFValue() {

        WorkflowCFValueInput objectInput = initWorkflowCFValueInput();
        
        when(mockConverter.convert(any(),eq(WorkflowCFValueModel.class)))
            .thenReturn(new WorkflowCFValueModel());
        when(mockConverter.convert(any(),eq(WorkflowCFValueTo.class)))
            .thenReturn(new WorkflowCFValueTo());
        when(mockRequestRepository.findById(anyInt()))
            .thenReturn(Optional.of(new RequestModel()));
        when(mockWorkflownodecfRepository.findById(anyInt()))
            .thenReturn((Optional.of(new WorkflowNodeCFModel())));
        when(mockWorkflowcfvalueRepository.save(any()))
            .thenReturn(new WorkflowCFValueModel());

        subject.createworkflowcfvalue(objectInput);

        verify(mockConverter, times(1))
            .convert(eq(objectInput), eq(WorkflowCFValueModel.class));
        verify(mockConverter, times(1))
            .convert(any(), eq(WorkflowCFValueTo.class));
        verify(mockRequestRepository, times(1))
            .findById(2);
        verify(mockWorkflownodecfRepository, times(1))
            .findById(3);
        verify(mockWorkflowcfvalueRepository, times(1))
            .save(any());

    }


    @Test
    public void givenMinimalObject_whenCreateWorkflowCFValue_thenCreateWFCFValue() {

        WorkflowCFValueInput objectInput = new WorkflowCFValueInput();
        objectInput.setTenant(123);
        
        when(mockConverter.convert(any(),eq(WorkflowCFValueModel.class)))
            .thenReturn(new WorkflowCFValueModel());
        when(mockConverter.convert(any(),eq(WorkflowCFValueTo.class)))
            .thenReturn(new WorkflowCFValueTo());
        when(mockWorkflowcfvalueRepository.save(any()))
            .thenReturn(new WorkflowCFValueModel());

        subject.createworkflowcfvalue(objectInput);

        verify(mockConverter, times(1))
            .convert(eq(objectInput), eq(WorkflowCFValueModel.class));
        verify(mockConverter, times(1))
            .convert(any(), eq(WorkflowCFValueTo.class));
        verify(mockWorkflowcfvalueRepository, times(1))
            .save(any());

    }

    @Test
    public void givenFullObject_whenModifyWorkflowCFValue_thenModifyWFCFValue() {

        WorkflowCFValueInput objectInput = initWorkflowCFValueInput();
        WorkflowCFValueModel dbObject = new WorkflowCFValueModel();
        
        when(mockConverter.convert(any(),eq(WorkflowCFValueModel.class)))
            .thenReturn(new WorkflowCFValueModel());
        when(mockConverter.convert(any(),eq(WorkflowCFValueTo.class)))
            .thenReturn(new WorkflowCFValueTo());
        when(mockRequestRepository.findById(anyInt()))
            .thenReturn(Optional.of(new RequestModel()));
        when(mockWorkflownodecfRepository.findById(anyInt()))
            .thenReturn((Optional.of(new WorkflowNodeCFModel())));
        when(mockWorkflowcfvalueRepository.findById(anyInt()))
            .thenReturn(Optional.of(dbObject));
        when(mockWorkflowcfvalueRepository.save(any()))
            .thenReturn(new WorkflowCFValueModel());

        subject.modifyworkflowcfvalue(objectInput);

        verify(mockWorkflowcfvalueRepository, times(1))
            .findById(anyInt());
        verify(mockConverter, times(1))
            .convert(eq(objectInput), eq(WorkflowCFValueModel.class));
        verify(mockConverter, times(1))
            .convert(any(), eq(WorkflowCFValueTo.class));
        verify(mockRequestRepository, times(1))
            .findById(2);
        verify(mockWorkflownodecfRepository, times(1))
            .findById(3);
        verify(mockWorkflowcfvalueRepository, times(1))
            .save(eq(dbObject));

    }


    @Test
    public void givenMinimalObject_whenModifyWorkflowCFValue_thenModifyOnlyReferences() {

        WorkflowCFValueModel dbObject = new WorkflowCFValueModel();
        WorkflowCFValueInput objectInput = new WorkflowCFValueInput();
        objectInput.setTenant(123);
        
        when(mockConverter.convert(any(),eq(WorkflowCFValueModel.class)))
            .thenReturn(new WorkflowCFValueModel());
        when(mockConverter.convert(any(),eq(WorkflowCFValueTo.class)))
            .thenReturn(new WorkflowCFValueTo());
        when(mockWorkflowcfvalueRepository.findById(anyInt()))
            .thenReturn(Optional.of(dbObject));
        when(mockWorkflowcfvalueRepository.save(any()))
            .thenReturn(new WorkflowCFValueModel());

        subject.modifyworkflowcfvalue(objectInput);

        verify(mockWorkflowcfvalueRepository, times(1))
            .findById(anyInt());
        verify(mockConverter, times(1))
            .convert(eq(objectInput), eq(WorkflowCFValueModel.class));
        verify(mockConverter, times(1))
            .convert(any(), eq(WorkflowCFValueTo.class));
        verify(mockWorkflowcfvalueRepository, times(1))
            .save(any());

    }

    @Test
    public void givenIdNotExist_whenModifyWorkflowCFValue_thenThowException() {

        when(mockWorkflowcfvalueRepository.findById(anyInt()))
            .thenReturn(Optional.empty());

        assertThrows("WorkflowCFValue not found", RuntimeException.class, () -> subject.modifyworkflowcfvalue(new WorkflowCFValueInput()));
        
    }

    @Test
    public void givenRequestNotExist_whenModifyWorkflowCFValue_thenThowException() {

        when(mockWorkflowcfvalueRepository.findById(anyInt()))
            .thenReturn(Optional.of(new WorkflowCFValueModel()));
        when(mockConverter.convert(any(),eq(WorkflowCFValueModel.class)))
            .thenReturn(new WorkflowCFValueModel());
        when(mockRequestRepository.findById(anyInt()))
            .thenReturn(Optional.empty());

        assertThrows("passed request id must exist",RuntimeException.class, () -> subject.modifyworkflowcfvalue(initWorkflowCFValueInput()));
        
    }

    @Test
    public void givenWFNodeCFNotExist_whenModifyWorkflowCFValue_thenThowException() {
        when(mockWorkflowcfvalueRepository.findById(anyInt()))
            .thenReturn(Optional.of(new WorkflowCFValueModel()));
        when(mockConverter.convert(any(),eq(WorkflowCFValueModel.class)))
            .thenReturn(new WorkflowCFValueModel());
        when(mockRequestRepository.findById(anyInt()))
            .thenReturn(Optional.of(new RequestModel()));
        when(mockWorkflownodecfRepository.findById(anyInt()))
            .thenReturn((Optional.empty()));

        assertThrows("passed workflowNodeCF id must exist",RuntimeException.class, () -> subject.modifyworkflowcfvalue(initWorkflowCFValueInput()));
        
    }

    private WorkflowCFValueInput initWorkflowCFValueInput() {
        WorkflowCFValueInput w = new WorkflowCFValueInput();

        w.setRequest(new RequestInput());
        w.setWorkflownodecf(new WorkflowNodeCFInput());
        w.getRequest().setId(2);
        w.getWorkflownodecf().setId(3);

        return w;
    }

}