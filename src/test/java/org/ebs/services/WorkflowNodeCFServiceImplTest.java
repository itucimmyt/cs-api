package org.ebs.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.ebs.model.WorkflowNodeCFModel;
import org.ebs.model.repos.EntityReferenceRepository;
import org.ebs.model.repos.HtmlTagRepository;
import org.ebs.model.repos.WorkflowCFTypeRepository;
import org.ebs.model.repos.WorkflowCFValueRepository;
import org.ebs.model.repos.WorkflowNodeCFRepository;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.ebs.services.to.WorkflowNodeCFTo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.core.convert.ConversionService;

@ExtendWith(MockitoExtension.class)
public class WorkflowNodeCFServiceImplTest {

    @Mock WorkflowNodeRepository mockWorkflownodeRepository;
    @Mock WorkflowNodeCFRepository mockWorkflownodecfRepository;
    @Mock ConversionService mockConverter;
    @Mock WorkflowCFValueRepository mockWorkflowcfvalueRepository;
    @Mock WorkflowCFTypeRepository mockWorkflowcftypeRepository;
    @Mock HtmlTagRepository mockHtmltagRepository;
    @Mock EntityReferenceRepository mockEntityreferenceRepository;
    
    private WorkflowNodeCFServiceImpl subject;
    
    @BeforeEach
    public void init() {
        subject = new WorkflowNodeCFServiceImpl(mockWorkflownodeRepository, mockWorkflownodecfRepository, mockConverter, mockWorkflowcfvalueRepository, mockWorkflowcftypeRepository, mockHtmltagRepository, mockEntityreferenceRepository);
    }
    @Test
    public void givenNotDeletedWFNode_whenFindWorkflowNodeCF_thenReturnTo() {
        WorkflowNodeCFModel object = new WorkflowNodeCFModel();
        object.setDeleted(false);

        when(mockWorkflownodecfRepository.findById(anyInt()))
            .thenReturn(Optional.of(object));
        when(mockConverter.convert(any(), any()))
            .thenReturn(new WorkflowNodeCFTo());
        
        Optional<WorkflowNodeCFTo> result = subject.findWorkflowNodeCF(1);
            assertThat(result.isEmpty()).isFalse();
        
    }

    @Test
    public void givenDeletedWFNode_whenFindWorkflowNodeCF_thenReturnEmpty() {
        WorkflowNodeCFModel object = new WorkflowNodeCFModel();
        object.setDeleted(true);

        when(mockWorkflownodecfRepository.findById(anyInt()))
            .thenReturn(Optional.of(object));
        
        Optional<WorkflowNodeCFTo>result = subject.findWorkflowNodeCF(1);
        assertThat(result.isEmpty()).isTrue();

    }

    @Test
    public void givenInvalidId_whenFindWorkflowNodeCF_thenReturnEmpty() {
        Optional<WorkflowNodeCFTo> result = subject.findWorkflowNodeCF(0);
        assertThat(result.isEmpty()).isTrue();

    }

}