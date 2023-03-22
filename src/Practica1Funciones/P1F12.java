package Practica1Funciones;
import java.util.Scanner;


public class P1F12 {
    /*
    Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El
    programa debe tener una función que reciba como parámetro una cantidad en
    kilómetros y nos la devuelva en millas
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce los kilometros: ");
        int km = scanner.nextInt();
        System.out.println("El valor en millas de los km introducidos son: " + kmToMiles(km) + " mi");
    }

    private static double kmToMiles(int km) {
        return km * 0.621371;
    }
}
