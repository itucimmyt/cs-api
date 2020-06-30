package org.ebs.rest;

import javax.validation.constraints.Min;

import org.ebs.services.ProjectService;
import org.ebs.services.SampleCodeService;
import org.ebs.services.to.ProjectTo;
import org.ebs.util.brapi.BrResponse;
import org.ebs.util.brapi.BrapiResponseBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("sampleCode")
public class SampleCodeResourceImpl implements SampleCodeResource {

	private final SampleCodeService sampleCodeService;
	
	private final ProjectService projectServicer;
	
	@Override
	@GetMapping("last_study/{serviceProviderID}")
	public BrResponse<ProjectTo> getLastStudyCodeByServiceProviderAndProject(@Min(1) @PathVariable int serviceProviderID) {
		
		
		return BrapiResponseBuilder.forData(
				projectServicer.findProject(serviceProviderID).get())
				.withStatusSuccess().
				build();
	}

	

	public SampleCodeResourceImpl(SampleCodeService _sampleCodeService,   ProjectService _projectServicer) {
		this.sampleCodeService = _sampleCodeService;
		this.projectServicer = _projectServicer;
		
	}

	@Override
	@GetMapping("last_sample/{serviceProviderID}")
	public  BrResponse<ProjectTo> getLastSampleCodeByServiceProviderAndProject(@Min(1) @PathVariable int serviceProviderID) {
		ProjectTo to =projectServicer.findProject(serviceProviderID).get();
		to.setproject_code(to.getproject_code()+"-"+"001");
		return BrapiResponseBuilder.forData(to)
				.withStatusSuccess().
				build();
	}
}
