package com.kevenreyes.screenmatch.exceptions;

public class ErrorIntDuring extends RuntimeException {

    private String message;

    public ErrorIntDuring(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
