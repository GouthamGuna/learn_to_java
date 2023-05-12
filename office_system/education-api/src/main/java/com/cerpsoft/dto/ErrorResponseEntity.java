package com.cerpsoft.dto;

import org.springframework.http.HttpStatus;

public class ErrorResponseEntity {

    private String error;


    public ErrorResponseEntity(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}
