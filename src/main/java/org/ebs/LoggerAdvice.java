package org.ebs;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Provides non-intrusive logging capabilities for: Resolvers, Services and Converters. 
 * The log works at TRACE level
 * 
 */
@Aspect @Order(0)
@Component
public class LoggerAdvice {

    private static final Logger LOG = LoggerFactory.getLogger(LoggerAdvice.class);

    @Pointcut("within(org.ebs.error..*)")
    private void anyErrorController() { }

    @Pointcut("@within(org.springframework.web.bind.annotation.RestController)")
    private void anyRestController() { }

    @Pointcut("target(org.springframework.core.convert.converter.Converter)")
    private void anyConverter() { }
    
    @Pointcut("@within(org.springframework.stereotype.Service)")
    private void anyService() { }
    
    @Pointcut("@within(org.springframework.stereotype.Component)")
    private void anyComponent() { }

    @Pointcut("within(org.ebs.graphql..*)")
    private void anyGraphqlResolver() { }

    @Pointcut("within(org.ebs.security..*)")
    private void anySecurityClass() { }

    @Before("anyGraphqlResolver() && anyComponent()")
    void logResolverInputs(JoinPoint joinPoint) {
        traceSignatureAndArgs(joinPoint);
    }

    @Before("anyRestController() && !anyErrorController()")
    void logRestInputs(JoinPoint joinPoint) {
        traceSignatureAndArgs(joinPoint);
    }

    @Before("anyService() && !anySecurityClass()")
    void logServiceInputs(JoinPoint joinPoint) {
        traceSignatureAndArgs(joinPoint);
    }
    
    @AfterReturning(pointcut="anyService() && !anySecurityClass()", returning="returned")
    void logServiceOutputs(JoinPoint joinPoint, Object returned) {
        traceReturningObject(joinPoint, returned);
    }
    
    @Before("anyConverter()")
    void logConverterInputs(JoinPoint joinPoint) {
        traceSignatureAndArgs(joinPoint);
    }
    
    private void traceSignatureAndArgs(JoinPoint joinPoint) {
        LOG.trace("Inbound {} with arguments: {}", joinPoint.toShortString(), joinPoint.getArgs());
    }

    private void traceReturningObject(JoinPoint joinPoint, Object returned) {
        LOG.trace("Outbound {} returning {}",joinPoint.toShortString(), returned);
    }
}