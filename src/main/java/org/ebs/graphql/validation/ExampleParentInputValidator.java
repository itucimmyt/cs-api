package org.ebs.graphql.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.ebs.services.to.ExampleParentInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ExampleParentInputValidator implements ConstraintValidator<ValidExampleParentInput,ExampleParentInput> {

    private static final Logger log = LoggerFactory.getLogger(ExampleParentInputValidator.class);
    private static final String TOO_MANY_CHILDREN  = "Parent cannot have more than 3 children";
    private static final String BAD_STOCK_NAME  = "Stock code and Name cannot be the same";

    @Override
    public boolean isValid(ExampleParentInput value, ConstraintValidatorContext context) {
        return checkNoMoreThan3Children(value, context) &
            checkStockCodeDifferentFromName(value, context);
    }

    private boolean checkNoMoreThan3Children(ExampleParentInput value,
            ConstraintValidatorContext context) {

        boolean valid = value.getChildren().length <= 3;
        if(!valid) {
            context.buildConstraintViolationWithTemplate(TOO_MANY_CHILDREN)
                .addConstraintViolation();
            log.debug(TOO_MANY_CHILDREN);
        }
        return valid;
    }

    private boolean checkStockCodeDifferentFromName(ExampleParentInput value,
            ConstraintValidatorContext context) {

        boolean valid = !value.getName().equals(value.getStockCode());
        if(!valid) {
            context.buildConstraintViolationWithTemplate(BAD_STOCK_NAME)
                .addConstraintViolation();
            log.debug(BAD_STOCK_NAME);
        }
        return valid;
    }

}