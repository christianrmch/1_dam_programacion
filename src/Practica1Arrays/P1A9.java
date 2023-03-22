package Practica1Arrays;
import java.util.Arrays;
import java.util.Scanner;
/*
Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego
pedirá un valor N y mostrará en qué posiciones del array aparece N.
 */
public class P1A9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] enteros = new int[100];
        int random;
        for(int i = 0; i < enteros.length; i++){
            random = (int) (Math.random() * (11 - 1)) + 1;
            enteros[i] = random;
        }
        System.out.println(Arrays.toString(enteros) + "\n");
        System.out.println("numero: ");
        int n = scanner.nextInt();
        while (n < 1 || n > 10){
            n = scanner.nextInt();
        }
        System.out.println();
        for (int i = 0; i < enteros.length; i++){
            if (enteros[i]!=n){
                enteros[i] = 0;
            }else if(enteros[i]==n){
                System.out.println("el numero " + n + " se encuentra en la posicion: " + i);
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(enteros));
    }
}
