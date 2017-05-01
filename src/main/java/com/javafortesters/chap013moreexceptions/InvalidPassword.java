package com.javafortesters.chap013moreexceptions;

public class InvalidPassword extends Exception {
    public InvalidPassword(String message) {
        super(message);
    }
}