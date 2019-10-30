package com.example.demovalidator.validator;

import lombok.extern.log4j.Log4j2;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Log4j2
public class FieldConstraintValidator implements ConstraintValidator<FieldCheck, String> {
    private java.util.regex.Pattern pattern;

    @Override
    public void initialize(FieldCheck constraintAnnotation) {
        FieldType fieldType = constraintAnnotation.value();
        String patternExpression = fieldType.getPattern();
        pattern = Pattern.compile(patternExpression);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null) return true;
        Matcher m = pattern.matcher(value);
        return m.matches();
    }

}
