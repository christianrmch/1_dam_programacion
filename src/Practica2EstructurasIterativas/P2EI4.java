package Practica2EstructurasIterativas;

import java.util.Scanner;

/***
 * Realiza un programa que muestre los números desde el 1 hasta un número N que se
 * introducirá por teclado.
 */

public class P2EI4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero entero por pantalla: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}
