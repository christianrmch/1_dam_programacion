package Practica1Arrays;
import java.util.Arrays;
import java.util.Scanner;

/*
    Crea un programa que pida diez números reales por teclado, los almacene en un
    array, y luego muestre todos sus valores.
 */

public class P1A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[10];
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Por favor, introduzca un número por pantalla: ");
            numero[i] = scanner.nextInt();
        }
        System.out.println("numeros del  array: " + Arrays.toString(numero));
    }
}
