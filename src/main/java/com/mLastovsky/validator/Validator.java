package com.mLastovsky.validator;

public interface Validator<T> {

    ValidationResult isValid(T object);
}
