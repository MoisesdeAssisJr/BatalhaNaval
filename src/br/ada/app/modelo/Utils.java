package br.ada.app.modelo;

import java.util.Scanner;

public class Utils {
    static Scanner scan = new Scanner(System.in);

    public static int getNumeroInt(String frase) {


        System.out.println(frase);
        int numero = scan.nextInt();
        return numero;
    }

}
