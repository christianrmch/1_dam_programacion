package Practica1Funciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1F8 {
    /*
    Escribe un programa que pida un valor N entero y luego muestre: el sumatorio
    de 1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N. Implementa
    y utiliza las funciones:
    int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
    int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
    double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un número: ");
        int numero = scanner.nextInt();
        System.out.println("el sumatorio desde 1 hasta 'n' es: " + suma1aN(numero));
        System.out.println("el producto desde 1 hasta 'n' es: " +  producto1aN(numero));
        System.out.println("el valor intermedio de 1 a 'n' es: " +  intermedio1aN(numero));
    }

    public static int intermedio1aN(int numero) {
        List<Integer> enteros1aN = new ArrayList<>();
        for (int i = 0; i < numero; i++){
            enteros1aN.add(i, i+1);
        }
        return enteros1aN.get((enteros1aN.size()/2)-1);
    }

    public static double producto1aN(int numero) {
        double resultado = 1;
        for (int i = 0; i < numero; i++){
            resultado *= (i+1);
        }
        return resultado;
    }

    public static int suma1aN(int numero) {
        int resultado = 0;
        for(int i = 0; i <= numero; i++) resultado+= i;
        return resultado;
    }
}
