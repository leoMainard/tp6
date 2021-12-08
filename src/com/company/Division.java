package com.company;

import java.io.IOException;

public class Division {


    public double division1(int a, int b){
        float resultat = a/b;
        return resultat;
    }

    public double division2(int a, int b){
        float resultat = 0;
        try{
            resultat = a/b;
        }catch(ArithmeticException e){
            System.out.println("Division par zéro impossible.");
        }
        return resultat;
    }

    public double division3(int a, int b) throws IOException {

        try{
            return a/b;
        }catch(ArithmeticException e){
            throw new IOException();
        }
    }


}
