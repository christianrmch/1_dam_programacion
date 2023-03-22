package Practica3Matrices;
import java.util.Arrays;
import java.util.Scanner;


/*
    Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas
    de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por
    pantalla.
 */
public class P3M2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] multiplyTable = new int[10][10];
        for(int i = 0; i < multiplyTable.length; i++){
            for(int j = 0; j < multiplyTable[0].length; j++){
               multiplyTable[i][j] = (i + 1) * (j + 1);
            }
            System.out.println(Arrays.toString(multiplyTable[i]));
        }
    }
}
