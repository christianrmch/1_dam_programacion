package Practica1Arrays;
import java.util.Arrays;
import java.util.Scanner;

/*
    Crea un programa que pida diez números reales por teclado, los almacene en un
    array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por
    pantalla.
 */
public class P1A3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximo = 0;
        int minimo;
        int[] numerosArray = new int[10];
        for (int i = 0; i < numerosArray.length; i++) {
            System.out.println("introudce un número: ");
            numerosArray[i] = scanner.nextInt();
        }
        minimo = numerosArray[0];
        for(int j = 0; j < numerosArray.length; j++){
            if(numerosArray[j] > maximo){
                maximo = numerosArray[j];
            }
            if(numerosArray[j] < minimo){
                minimo = numerosArray[j];
            }
        }
        System.out.println("maximo: " + maximo);
        System.out.println("minimo: " + minimo);
    }
}