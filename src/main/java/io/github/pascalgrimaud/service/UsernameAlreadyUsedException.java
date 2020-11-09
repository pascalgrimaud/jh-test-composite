package io.github.pascalgrimaud.service;

import io.github.pascalgrimaud.GeneratedByJHipster;

@GeneratedByJHipster
public class UsernameAlreadyUsedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UsernameAlreadyUsedException() {
        super("Login name already used!");
    }
}
