package com.exception;

public class NameInputError extends RuntimeException {
    public NameInputError(String message) {
        super(message);
    }
}
