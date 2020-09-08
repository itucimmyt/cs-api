package org.ebs.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.ebs.model.EntityReferenceModel;
import org.ebs.model.HtmlTagModel;
import org.ebs.model.ModuleModel;
import org.ebs.model.ProcessModel;
import org.ebs.model.WorkflowModel;
import org.ebs.model.WorkflowNodeModel;
import org.ebs.model.repos.ActionRepository;
import org.ebs.model.repos.EntityReferenceRepository;
import org.ebs.model.repos.HtmlTagRepository;
import org.ebs.model.repos.ModuleRepository;
import org.ebs.model.repos.ProcessRepository;
import org.ebs.model.repos.WorkflowEventRepository;
import org.ebs.model.repos.WorkflowNodeCFRepository;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.ebs.model.repos.WorkflowRepository;
import org.ebs.model.repos.WorkflowStageRepository;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.Input.EntityReferenceInput;
import org.ebs.services.to.Input.HtmlTagInput;
import org.ebs.services.to.Input.ModuleInput;
import org.ebs.services.to.Input.ProcessInput;
import org.ebs.services.to.Input.WorkflowInput;
import org.ebs.services.to.Input.WorkflowNodeInput;
import org.ebs.util.Connection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@ExtendWith(MockitoExtension.class)
public class WorkflowNodeServiceImplTest {

    @Mock EntityReferenceRepository mockEntityreferenceRepository;
    @Mock WorkflowEventRepository mockWorkfloweventRepository;
    @Mock HtmlTagRepository mockHtmltagRepository;
    @Mock ModuleRepository mockModuleRepository;
    @Mock WorkflowNodeCFRepository mockWorkflownodecfRepository;
    @Mock ProcessRepository mockProcessRepository;
    @Mock WorkflowNodeRepository mockWorkflownodeRepository;
    @Mock ConversionService mockConverter;
    @Mock WorkflowStageRepository mockWorkflowstageRepository;
    @Mock WorkflowRepository mockWorkflowRepository;
    @Mock ActionRepository mockActionRepository;

    private WorkflowNodeServiceImpl subject;
    
    @BeforeEach
    public void init() {
        subject = new WorkflowNodeServiceImpl( mockWorkflownodeRepository, mockWorkfloweventRepository, mockConverter,
            mockWorkflowstageRepository, mockWorkflowRepository,
            mockEntityreferenceRepository, mockHtmltagRepository,
            mockProcessRepository, mockModuleRepository, mockWorkflownodecfRepository, mockActionRepository);
    }
    @Test
    public void givenNotDeletedWFNode_whenFindWorkflowNode_thenReturnTo() {
        WorkflowNodeModel object = new WorkflowNodeModel();
        object.setDeleted(false);

        when(mockWorkflownodeRepository.findById(anyInt()))
            .thenReturn(Optional.of(object));
        when(mockConverter.convert(any(), any()))
            .thenReturn(new WorkflowNodeTo());
        
        Optional<WorkflowNodeTo> result = subject.findworkflownode(1);
            assertThat(result.isPresent()).isTrue();
        
    }

    @Test
    public void givenDeletedWFNode_whenFindWorkflowNode_thenReturnEmpty() {
        WorkflowNodeModel object = new WorkflowNodeModel();
        object.setDeleted(true);

        when(mockWorkflownodeRepository.findById(anyInt()))
            .thenReturn(Optional.of(object));
        
        Optional<WorkflowNodeTo>result = subject.findworkflownode(1);
        assertThat(result.isPresent()).isFalse();

    }

    @Test
    public void givenInvalidId_whenFindWorkflowNodeCF_thenReturnEmpty() {
        Optional<WorkflowNodeTo> result = subject.findworkflownode(0);
        assertThat(result.isPresent()).isFalse();

    }

    @Test
    public void givenNoArguments_whenFindWorkflowNodes_thenReturnConnection() {
        List<WorkflowNodeModel> content = Arrays.asList(new WorkflowNodeModel(), new WorkflowNodeModel());
        Pageable pageable = PageRequest.of(0, 50);

        Connection<WorkflowNodeModel> connection = new Connection<>(content, pageable, 2);

        when(mockWorkflownodeRepository.findByCriteria(any(), any(), any(), any()))
            .thenReturn(connection);
        when(mockConverter.convert(any(), any()))
            .thenReturn(new WorkflowNodeTo());
            
        Page<WorkflowNodeTo> result = subject.findworkflownodes(null, null, null);

        assertThat(result).isNotNull();
        assertThat(result.getTotalElements()).isEqualTo(2);

        verify(mockWorkflownodeRepository, times(1))
            .findByCriteria(any(), any(), any(), any());
        verify(mockConverter, times(2)) 
            .convert(any(), any());
        
    }

    @Test
    public void givenFullObject_whenCreateWorkflowNode_thenCreateWFNode() {
        when(mockConverter.convert(any(), eq(WorkflowNodeModel.class)))
            .thenReturn(new WorkflowNodeModel());
        when(mockConverter.convert(any(), eq(WorkflowNodeTo.class)))
            .thenReturn(new WorkflowNodeTo());
        when(mockWorkflowRepository.findById(anyInt()))
            .thenReturn(Optional.of(new WorkflowModel()));
        when(mockEntityreferenceRepository.findById(anyInt()))
            .thenReturn(Optional.of(new EntityReferenceModel()));
        when(mockHtmltagRepository.findById(anyInt()))
            .thenReturn(Optional.of(new HtmlTagModel()));
        when(mockModuleRepository.findById(anyInt()))
            .thenReturn(Optional.of(new ModuleModel()));
        when(mockProcessRepository.findById(anyInt()))
            .thenReturn(Optional.of(new ProcessModel()));
        when(mockWorkflownodeRepository.save(any()))
            .thenReturn(new WorkflowNodeModel());

        WorkflowNodeInput objectInput = initWorkflowNodeInput();
        subject.createworkflownode(objectInput);

        verify(mockConverter, times(1))
            .convert(eq(objectInput), eq(WorkflowNodeModel.class));
        verify(mockConverter, times(1))
            .convert(any(), eq(WorkflowNodeTo.class));
        verify(mockWorkflowRepository, times(1))
            .findById(7);
        verify(mockEntityreferenceRepository, times(1))
            .findById(3);
        verify(mockHtmltagRepository, times(1))
            .findById(4);
        verify(mockModuleRepository, times(1))
            .findById(5);
        verify(mockProcessRepository, times(1))
            .findById(6);
        verify(mockWorkflownodeRepository, times(1))
            .save(any());

    }

    @Test
    public void givenMinimalObject_whenCreateWorkflowNode_thenCreateWFNode() {
        when(mockConverter.convert(any(), eq(WorkflowNodeModel.class)))
            .thenReturn(new WorkflowNodeModel());
        when(mockConverter.convert(any(), eq(WorkflowNodeTo.class)))
            .thenReturn(new WorkflowNodeTo());
        when(mockWorkflownodeRepository.save(any()))
            .thenReturn(new WorkflowNodeModel());

        WorkflowNodeInput objectInput = new WorkflowNodeInput();
        objectInput.setId(1);
        objectInput.setTenant(2);
        
        subject.createworkflownode(objectInput);

        verify(mockConverter, times(1))
            .convert(eq(objectInput), eq(WorkflowNodeModel.class));
        verify(mockConverter, times(1))
            .convert(any(), eq(WorkflowNodeTo.class));
        verify(mockWorkflownodeRepository, times(1))
            .save(any());

    }

    private WorkflowNodeInput initWorkflowNodeInput() {
        WorkflowNodeInput w = new WorkflowNodeInput();
        w.setEntityreference(new EntityReferenceInput());
        w.setHtmltag(new HtmlTagInput());
        w.setModule(new ModuleInput());
        w.setProcess(new ProcessInput());
        w.setWorkflow(new WorkflowInput());

        w.getEntityreference().setId(3);
        w.getHtmltag().setId(4);
        w.getModule().setId(5);
        w.getProcess().setId(6);
        w.getWorkflow().setId(7);

        return w;
    }

    @Test
    public void givenIdNotExist_whenModifyWorkflowNode_thenThowException() {

        when(mockWorkflownodeRepository.findById(anyInt()))
            .thenReturn(Optional.empty());

        assertThrows("workflownode validation must fail", RuntimeException.class, () -> subject.modifyworkflownode(new WorkflowNodeInput()));
        
    }

    @Test
    public void givenWorkflowNotExist_whenInitWorkflowNodeModel_thenThrowException() {
        when(mockWorkflowRepository.findById(anyInt()))
            .thenReturn(Optional.empty());
        
        WorkflowNodeInput input = new WorkflowNodeInput();
        input.setWorkflow(new WorkflowInput());

        assertThrows("workflow validation must fail", RuntimeException.class, () -> subject.initWorkflowNodeModel(input, new WorkflowNodeModel()));
    }

    @Test
    public void givenEntityReferenceNotExist_whenInitWorkflowNodeModel_thenThrowException() {
        when(mockEntityreferenceRepository.findById(anyInt()))
            .thenReturn(Optional.empty());

        WorkflowNodeInput input = new WorkflowNodeInput();
        input.setEntityreference(new EntityReferenceInput());

        assertThrows("entityreference validation must fail", RuntimeException.class, () -> subject.initWorkflowNodeModel(input, new WorkflowNodeModel()));
    }

    @Test
    public void givenHtmlTagNotExist_whenInitWorkflowNodeModel_thenThrowException() {
        when(mockHtmltagRepository.findById(anyInt()))
            .thenReturn(Optional.empty());

        WorkflowNodeInput input = new WorkflowNodeInput();
        input.setHtmltag(new HtmlTagInput());

        assertThrows("htmltag validation must fail", RuntimeException.class, () -> subject.initWorkflowNodeModel(input, new WorkflowNodeModel()));
    }

    @Test
    public void givenModuleNotExist_whenInitWorkflowNodeModel_thenThrowException() {
        when(mockModuleRepository.findById(anyInt()))
            .thenReturn(Optional.empty());

        WorkflowNodeInput input = new WorkflowNodeInput();
        input.setModule(new ModuleInput());

        assertThrows("module validation must fail", RuntimeException.class, () -> subject.initWorkflowNodeModel(input, new WorkflowNodeModel()));
    }

    @Test
    public void givenProcessNotExist_whenInitWorkflowNodeModel_thenThrowException() {
        when(mockProcessRepository.findById(anyInt()))
            .thenReturn(Optional.empty());

        WorkflowNodeInput input = new WorkflowNodeInput();
        input.setProcess(new ProcessInput());

        assertThrows("process validation must fail", RuntimeException.class, () -> subject.initWorkflowNodeModel(input, new WorkflowNodeModel()));
    }
}