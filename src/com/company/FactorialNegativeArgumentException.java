package com.company;

public class FactorialNegativeArgumentException extends Exception{
    long val;

    public FactorialNegativeArgumentException(long val) {
        super("Le nombre " + val + " est négatif");
    }


}
