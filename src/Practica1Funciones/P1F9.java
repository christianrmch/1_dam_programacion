package Practica1Funciones;

import java.util.Scanner;

public class P1F9 {
    /*
    Realiza un programa que pida introducir tres valores enteros y nos diga cuál de
    ellos es el más elevado. Impleméntalo creando únicamente una función a la que
    le pasemos dos valores (no tres) y nos devuelva el máximo de los dos valores.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca un número entero: ");
        int primero = scanner.nextInt();
        System.out.println("introduzca un número entero: ");
        int segundo = scanner.nextInt();
        System.out.println("introduzca un número entero: ");
        int tercero = scanner.nextInt();
        System.out.println("El número más elevado es: " + numeroMasGrande(primero, segundo, tercero));
    }

    public static int numeroMasGrande(int a, int b, int c) {
        if(a > b && b > c) return a;
        else if (b > a && a > c) return b;
        else return c;
    }
}
