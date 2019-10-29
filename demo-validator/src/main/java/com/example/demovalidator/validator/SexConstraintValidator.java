package com.example.demovalidator.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SexConstraintValidator implements ConstraintValidator<Sex, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return value != null && (value.equals("男") || value.equals("女"));
    }
}
