package org.ebs.util.brapi;

import org.ebs.util.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = { "org.ebs.rest" })
public class BrCustomErrorAdvice {

    @ExceptionHandler(NumberFormatException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public BrResponse<?> dispatchBadRequest(Exception exception) {
        return BrapiResponseBuilder.forError("Parameter should be an integer");
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public BrResponse<?> dispatchNotFound(Exception exception) {
        return BrapiResponseBuilder.forError(exception.getMessage());
    }
}