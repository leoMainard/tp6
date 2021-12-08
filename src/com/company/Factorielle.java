package com.company;

import java.io.IOException;

public class Factorielle {



    public long calcul(String val) throws IOException {
        if (val == null){
            throw new IOException("Le paramètre est nul.");
        }
        long vallong = 0;
        try {
            vallong = Long.parseLong(val);
        }catch (NumberFormatException ex){
            throw new IOException("Le paramètre n'est pas un nombre.");
        }
        if(vallong < 0){

        }

        int factorielle = 1;
        for (int i = 1; i <= vallong; i++){
            factorielle *= i;
        }
        return factorielle;

    }
}
