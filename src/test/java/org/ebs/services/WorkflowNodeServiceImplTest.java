package org.ebs.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
        subject = new WorkflowNodeServiceImpl( mockEntityreferenceRepository, mockWorkfloweventRepository, mockHtmltagRepository, mockModuleRepository, mockWorkflownodecfRepository, mockProcessRepository, mockWorkflownodeRepository, mockConverter, mockWorkflowstageRepository, mockWorkflowRepository, mockActionRepository);
    }
    @Test
    public void givenNotDeletedWFNode_whenFindWorkflowNode_thenReturnTo() {
        WorkflowNodeModel object = new WorkflowNodeModel();
        object.setDeleted(false);

        when(mockWorkflownodeRepository.findById(anyInt()))
            .thenReturn(Optional.of(object));
        when(mockConverter.convert(any(), any()))
            .thenReturn(new WorkflowNodeTo());
        
        Optional<WorkflowNodeTo> result = subject.findWorkflowNode(1);
            assertThat(result.isEmpty()).isFalse();
        
    }

    @Test
    public void givenDeletedWFNode_whenFindWorkflowNode_thenReturnEmpty() {
        WorkflowNodeModel object = new WorkflowNodeModel();
        object.setDeleted(true);

        when(mockWorkflownodeRepository.findById(anyInt()))
            .thenReturn(Optional.of(object));
        
        Optional<WorkflowNodeTo>result = subject.findWorkflowNode(1);
        assertThat(result.isEmpty()).isTrue();

    }

    @Test
    public void givenInvalidId_whenFindWorkflowNodeCF_thenReturnEmpty() {
        Optional<WorkflowNodeTo> result = subject.findWorkflowNode(0);
        assertThat(result.isEmpty()).isTrue();

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
            
        Page<WorkflowNodeTo> result = subject.findWorkflowNodes(null, null, null);

        assertThat(result).isNotNull();
        assertThat(result.getTotalElements()).isEqualTo(2);

        verify(mockWorkflownodeRepository, times(1))
            .findByCriteria(any(), any(), any(), any());
        verify(mockConverter, times(2)) 
            .convert(any(), any());
        
    }

}