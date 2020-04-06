package org.ebs.graphql.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = ExampleParentInputValidator.class)
@Target( { ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidExampleParentInput {
    String message() default "Invalid ExampleParent object";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}