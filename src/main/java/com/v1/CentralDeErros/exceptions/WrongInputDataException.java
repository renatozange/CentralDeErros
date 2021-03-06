package com.v1.CentralDeErros.exceptions;

import lombok.Getter;

@Getter
public class WrongInputDataException extends RuntimeException {

    private final String message;

    public WrongInputDataException(String message) {
        this.message = message;
    }
}
