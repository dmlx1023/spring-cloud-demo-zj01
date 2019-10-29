package com.example.demovalidator.validator;

import lombok.extern.log4j.Log4j2;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Map;
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
        String defaultMessage = constraintAnnotation.message();
        if (StringUtils.isEmpty(defaultMessage)) {
            try {
                InvocationHandler ih = Proxy.getInvocationHandler(constraintAnnotation);
                Field memberValuesField = ih.getClass().getDeclaredField("memberValues");
                memberValuesField.setAccessible(true);
                Map memberValues = (Map) memberValuesField.get(ih);
                memberValues.put("message", fieldType.getMessage());
            } catch (Exception e) {
                log.error(e);
            }
        }
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null) {
            return true;
        }
        Matcher m = pattern.matcher(value);
        return m.matches();
    }

}
