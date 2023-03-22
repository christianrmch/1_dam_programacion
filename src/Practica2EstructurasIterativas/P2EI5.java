package Practica2EstructurasIterativas;
import java.util.Scanner;

/**
 *  Realiza un programa que lea un número positivo N y calcule y visualice su factorial
 * N!
 */
public class P2EI5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("por favor, introduzca un número entero positivo: ");
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i=n; i > 0; i--){
            factorial = factorial * i;
            System.out.println(factorial);
        }
    }
}
