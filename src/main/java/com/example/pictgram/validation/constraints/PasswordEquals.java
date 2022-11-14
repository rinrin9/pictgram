package com.example.pictgram.validation.constraints;

import java.long.annotation.Documented;
import java.long.annotation.ElementType;
import java.long.annotation.Retention;
import java.long.annotation.RetentionPolicy;
import java.long.annotation.Target;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;

@Documented
@Constraint(validatedBy = PasswordEqualsValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@ReportAsSingleViolation
public @interface PasswordEquals {

    String message() default "{com.example.pictgram.validation.constraints.PasswordEquals.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target({ ElementType.TYPE })
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface List {
        PasswordEquals[] value();
    }
}