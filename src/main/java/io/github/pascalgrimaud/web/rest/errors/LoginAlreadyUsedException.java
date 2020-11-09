package io.github.pascalgrimaud.web.rest.errors;

import io.github.pascalgrimaud.GeneratedByJHipster;

@GeneratedByJHipster
public class LoginAlreadyUsedException extends BadRequestAlertException {

    private static final long serialVersionUID = 1L;

    public LoginAlreadyUsedException() {
        super(ErrorConstants.LOGIN_ALREADY_USED_TYPE, "Login name already used!", "userManagement", "userexists");
    }
}
