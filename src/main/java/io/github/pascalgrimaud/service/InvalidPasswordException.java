package io.github.pascalgrimaud.service;

import io.github.pascalgrimaud.GeneratedByJHipster;

@GeneratedByJHipster
public class InvalidPasswordException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidPasswordException() {
        super("Incorrect password");
    }
}
