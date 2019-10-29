package com.example.demovalidator.validator;

public enum FieldType {
    MONEY("金额格式不正确", "^\\d{2}$"),
    NONCHECK("不检查格式","*");

    private String message;
    private String pattern;

    FieldType(String message, String pattern) {
        this.message = message;
        this.pattern = pattern;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
