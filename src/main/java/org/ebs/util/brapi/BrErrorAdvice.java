package org.ebs.util.brapi;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Handler for intercepting and processing (checked) exceptions thrown (and not
 * managed) by BrAPI rest controllers. Specific subclasses of {@link Exception} can
 * be grouped in different methods inside this class. For example all Business
 * Logic Exceptions can be returned with code 505, and all Validation Exceptions
 * with code 400 <br/>
 * 
 * @author jarojas
 *
 */
@RestControllerAdvice(basePackages={"org.ebs.rest"})
public class BrErrorAdvice {

	/**
	 * Method to catch all exceptions extending {@link Exception}. Responds with code 400.
	 * Further specializations may come along with new features.
	 * @param request originating the exception
	 * @param handler controlling given request
	 * @param exception to be processed
	 * @return a {@link BrapiResponse response} with http status code 400 (Bad Request)
	 */
    @ExceptionHandler
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	public BrResponse<?> dispatchServerError(HttpServletRequest request, Object handler, ConstraintViolationException exception) {
		return BrapiResponseBuilder.forError(exception.getMessage());
    }

	/**
	 * Method to catch all exceptions extending {@link Exception}. Responds with code 500.
	 * Further specializations may come along with new features.
	 * @param request originating the exception
	 * @param handler controlling given request
	 * @param exception to be processed
	 * @return a {@link BrapiResponse response} with http status code 500 (Internal Server Error)
	 */
    @ExceptionHandler(Exception.class)
	@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
	public BrResponse<?> dispatchServerError(HttpServletRequest request, Object handler, Exception exception) {
		return BrapiResponseBuilder.forError(exception.getMessage());
    }
    
}
