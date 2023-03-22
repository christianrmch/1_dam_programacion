package Practica1Arrays;
import java.util.Scanner;

/*
Crea un programa que pida veinte números enteros por teclado, los almacene
en un array y luego muestre por separado la suma de todos los valores positivos
y negativos.
 */
public class P1A4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.println("introduzca un número: ");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > 0){
                sumaPositivos += numeros[i];
            }
            if (numeros[i] < 0){
                sumaNegativos += numeros[i];
            }
        }
        System.out.println("suma de numeros positivos: " + sumaPositivos);
        System.out.println("suma de numeros negativos: " + sumaNegativos);
    }
}
