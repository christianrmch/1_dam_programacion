package Practica1Arrays;
import java.util.Scanner;
/*
Crea un programa que pida veinte números reales por teclado, los almacene en
un array y luego lo recorra para calcular y mostrar la media: (suma de valores) /
nº de valores.
 */
public class P1A5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int sumaValores = 0;
        int media;
        for(int i = 0; i < numeros.length; i++){
            System.out.println("introduzca un número: ");
            numeros[i] = scanner.nextInt();
        }
        for(int i = 0; i < numeros.length; i++){
            sumaValores += numeros[i];
        }
        media = sumaValores / numeros.length;
        System.out.println(media);
    }
}
