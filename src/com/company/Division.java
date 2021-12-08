package com.company;

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


}
