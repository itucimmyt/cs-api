## Validation Layer

### Validator Template

public class TemplateValidator implements ConstraintValidator<ValidTemplate, Element> { // replace with appropriate @Valid interface and Transfer Object class

    @Override
    public boolean isValid(Element value, ConstraintValidatorContext context) {
        // call and chain your rules here
        return notNull(value, context);
    }

    // example of rule
    static final boolean notNull(Element value, ConstraintValidatorContext context) {
        boolean valid = value != null;

        if( !valid )
            context.buildConstraintViolationWithTemplate("Element must not be null")
                .addConstraintViolation();

        return valid;
    }
}


### @Valid Template

@Documented
@Constraint(validatedBy = TemplateValidator.class) // put your validator class here
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidTemplate {
    String message() default "generic error message";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default{};
}
