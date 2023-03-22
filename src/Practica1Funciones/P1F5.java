package Practica1Funciones;

import java.util.Scanner;

public class P1F5 {
    /*
    Escribe un programa que pida un valor entero en millas y muestre su equivalente
    en kilómetros. Recuerda que una milla son 1,60934 kilómetros. Implementa y
    utiliza la función:
     */
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("introduce las millas: ");
        double millas = scanner.nextDouble();
        double kilometros = millas_a_kilometros(millas);
        System.out.println("Los kilometros equivalentes son: " + kilometros + " km");
    }

    public static double millas_a_kilometros(double a) {
        return a * 1.60934;
    }
}
