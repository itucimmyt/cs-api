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

import org.ebs.model.WorkflowNodeCFModel;
import org.ebs.model.repos.EntityReferenceRepository;
import org.ebs.model.repos.HtmlTagRepository;
import org.ebs.model.repos.WorkflowCFTypeRepository;
import org.ebs.model.repos.WorkflowCFValueRepository;
import org.ebs.model.repos.WorkflowNodeCFRepository;
import org.ebs.model.repos.WorkflowNodeRepository;
import org.ebs.services.to.WorkflowNodeCFTo;
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
            assertThat(result.isPresent()).isTrue();

    }

    @Test
    public void givenDeletedWFNode_whenFindWorkflowNodeCF_thenReturnEmpty() {
        WorkflowNodeCFModel object = new WorkflowNodeCFModel();
        object.setDeleted(true);

        when(mockWorkflownodecfRepository.findById(anyInt()))
            .thenReturn(Optional.of(object));

        Optional<WorkflowNodeCFTo>result = subject.findWorkflowNodeCF(1);
        assertThat(result.isPresent()).isFalse();

    }

    @Test
    public void givenInvalidId_whenFindWorkflowNodeCF_thenReturnEmpty() {
        Optional<WorkflowNodeCFTo> result = subject.findWorkflowNodeCF(0);
        assertThat(result.isPresent()).isFalse();

    }

    @Test
    public void givenNoArguments_whenFindWorkflowNodeCFs_thenReturnConnection() {
        List<WorkflowNodeCFModel> content = Arrays.asList(new WorkflowNodeCFModel(), new WorkflowNodeCFModel());
        Pageable pageable = PageRequest.of(0, 50);

        Connection<WorkflowNodeCFModel> connection = new Connection<>(content, pageable, 2);

        when(mockWorkflownodecfRepository.findByCriteria(any(), any(), any(), any()))
            .thenReturn(connection);
        when(mockConverter.convert(any(), any()))
            .thenReturn(new WorkflowNodeCFTo());

        Page<WorkflowNodeCFTo> result = subject.findWorkflowNodeCFs(null, null, null, false);

        assertThat(result).isNotNull();
        assertThat(result.getTotalElements()).isEqualTo(2);

        verify(mockWorkflownodecfRepository, times(1))
            .findByCriteria(any(), any(), any(), any());
        verify(mockConverter, times(2))
            .convert(any(), any());

    }

}