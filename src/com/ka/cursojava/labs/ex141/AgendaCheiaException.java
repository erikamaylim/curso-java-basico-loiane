package com.ka.cursojava.labs.ex141;

public class AgendaCheiaException extends Exception {
    @Override
    public String getMessage() {
        return "Agenda já está cheia";
    }
}
