package Practica1Funciones;

import java.util.Scanner;

public class P1F2 {
    /*
    Escribe un programa que pida la edad por teclado y muestre por pantalla si eres
    mayor de edad o no. Implementa y utiliza la función:
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce tu edad: ");
        int edad = scanner.nextInt();
        boolean validarEdad = esMayorEdad(edad);
        System.out.println(validarEdad);
    }

    public static boolean esMayorEdad(int a) {
        //Por definición el boolean es verdadero.
        return a >= 18;
    }
}
