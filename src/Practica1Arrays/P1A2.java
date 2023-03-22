package Practica1Arrays;
import java.util.Scanner;

/*
    Crea un programa que pida diez números reales por teclado, los almacene en un
    array, y luego muestre la suma de todos los valores.
 */
public class P1A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("introduce un numero: ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }
        System.out.println("el valor de la suma de todos los elementos del array es: " + suma);
    }
}
