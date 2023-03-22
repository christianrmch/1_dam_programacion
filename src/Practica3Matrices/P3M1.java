package Practica3Matrices;
import java.util.Arrays;
import java.util.Scanner;

/*
 Crea un programa que cree una matriz de tamaño 5x5 que almacene los números
del 1 al 25 y luego muestre la matriz por pantalla.
 */
public class P3M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int k = 1;
        for(int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                matriz[i][j] = k;
                k++;
            }
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}
