package Practica1Funciones;
import java.util.Scanner;


public class P1F3 {
    /*
    Escribe un programa que pida dos números enteros por teclado y muestre por
    pantalla cuál es el mínimo. Implementa y utiliza la función:
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un número por pantalla: ");
        int a = scanner.nextInt();
        System.out.println("introduce un número por pantalla: ");
        int b = scanner.nextInt();
        int minimo = minimo(a, b);
        System.out.println("el número mínimo es: " + minimo);
    }
    public static int minimo(int a, int b) {
        if(a < b) return a;
        else return b;
    }
}
