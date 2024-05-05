package com.sudynoor.springdemo.mvc.validationdemo.validation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME) // this annotation used for how long will the marked annotation be stored or used
public @interface CourseCode {
    // define default course code

    public String value() default "SUDYNOOR";

    // define default error message
    public  String message() default "must start with SUDYNOOR";

    // define default groups
    public Class<?>[] groups() default {};

    // define default payloads
    public Class<? extends Payload>[] payload() default {};
    // payloads provide custom details about validation failure




}
