package org.ebs.services;

import org.ebs.model.ProjectModel;
import org.ebs.model.repos.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service @Transactional(readOnly = true)
public class SampleCodeServiceImpl implements SampleCodeService{

	private final ProjectRepository projectRepository;
	@Override
	public String getLastStudyCodeByProyect(int idServiceProvider) {
		ProjectModel model = projectRepository.findById(idServiceProvider).get();
		model.getproject_code();
		return model.getproject_code()+"W-"+"20";
	}

	@Override
	public String getLasSampleCodeByProject(int idServiceProvider) {
		// TODO Auto-generated method stub
		ProjectModel model = projectRepository.findById(idServiceProvider).get();
		return "SHLW-20-001";
	}

	
	@Autowired
	public SampleCodeServiceImpl (ProjectRepository _projectRepository) {
		this.projectRepository = _projectRepository;
	}
	
}
