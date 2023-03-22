package Practica1Arrays;
import java.util.Arrays;
import java.util.Scanner;

/*
Crea un programa que pida dos valores enteros N y M, luego cree un array de
tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla.
 */
public class P1A6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        System.out.println("Por favor, introduzca un número: ");
        n = scanner.nextInt();
        System.out.println("Por favor, introduzca un número: ");
        m = scanner.nextInt();
        int[] numeros = new int[n];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = m;
        }
        System.out.println(Arrays.toString(numeros));
    }
}
