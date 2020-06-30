package org.ebs.rules;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.ebs.services.to.ProjectTo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect @Order(1)
@Component
public class SampleServiceRules {
	private static final Logger LOG = LoggerFactory.getLogger(SampleServiceRules.class);

	@Pointcut("execution( * org.ebs.services.ProjectServiceImpl.findProject(..))")
    private void findProjectByID() {
    }
	
	@Around("findProjectByID()")
    Object find_Project_Code_To_Study_Sample_Code_By_ID_Service_Provider
    					(ProceedingJoinPoint joinPoint) {
        try {
        	SimpleDateFormat s=new SimpleDateFormat("yy");
            String format = s.format(new Date());
            Optional<ProjectTo> optional =(Optional<ProjectTo>)joinPoint.proceed(joinPoint.getArgs());
        	String completeCode = "W"+"-"+format;
        	optional.get().setproject_code(optional.get().getproject_code()+completeCode);
        	
            LOG.info("Code For new Study for SHL"+ optional.get().getproject_code());
            return optional;
           
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
