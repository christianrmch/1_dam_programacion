package Practica2EstructurasIterativas;
import java.util.Scanner;

/*
 Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del
operador de potencia (^), siendo A y B valores introducidos por teclado, y luego
muestre el resultado por pantalla.
 */
public class P2EI12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, exponente, potencia = 1;
        System.out.println("Por favor, introduzca la base: ");
        base = scanner.nextInt();
        System.out.println("Por favor, introduzca el exponente: ");
        exponente = scanner.nextInt();
        for( int i = 0; i < exponente; i++){
            potencia *= base;
        }
        System.out.println("El resultado de la potencia con base " + base + " y exponente " + exponente + " es: " + potencia);
    }
}
