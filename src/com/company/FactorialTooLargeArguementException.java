package com.company;

public class FactorialTooLargeArguementException extends Exception{

    public FactorialTooLargeArguementException(long val) {
        super("Le nombre " + val + " est trop grand");
    }
}
