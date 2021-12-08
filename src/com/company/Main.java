package com.company;

public class Main {

    public static void exercice1(){
        Division d = new Division();
        d.division1(10,0);

        // Erreur ici
        /*Exception in thread "main" java.lang.ArithmeticException: / by zero
        at com.company.Division.division1(Division.java:7)
        at com.company.Main.exercice1(Main.java:7)
        at com.company.Main.main(Main.java:14)*/
    }




    public static void main(String[] args) {
        exercice1();

    }
}
