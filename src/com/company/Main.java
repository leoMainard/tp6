package com.company;

import javax.imageio.IIOException;
import java.io.IOException;

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

    public static void exercice2(){
        Division d2 = new Division();
        System.out.println(d2.division2(10,0));
    }

    public static void exercice3(){
        Division d3 = new Division();
        try{
            System.out.println(d3.division3(10,0));
        }catch(IOException e){
            System.out.println("Division par zéro.");
        }
    }




    public static void main(String[] args) {
       // exercice1();
        // exercice2();
        exercice3();

    }
}
