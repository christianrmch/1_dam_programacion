package Practica3Matrices;
import java.util.Arrays;
import java.util.Scanner;


public class P3M3 {

    /*
    Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por
    teclado) e introduzca en ella NxM valores (también introducidos por teclado). Luego
    deberá recorrer la matriz y al final mostrar por pantalla cuántos valores son mayores
    que cero, cuántos son menores que cero y cuántos son igual a cero.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz;
        int mayorQueCero = 0, menorQueCero = 0, igualACero = 0;
        System.out.println("Introduce el número de filas: ");
        int filas = scanner.nextInt();
        System.out.println("Introduce el número de columnas ");
        int columnas = scanner.nextInt();
        matriz = new int[filas][columnas];

        for(int i = 0; i < matriz.length; ++i){
            for (int j = 0; j < matriz[0].length; ++j){
                System.out.println("Introduce un número: ");
                while(!scanner.hasNextInt()){
                    System.out.println("Eso no es un número, prueba de nuevo: ");
                    scanner.next();
                }
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(matriz)
                .replace("], ", "\n")
                .replace("[", "")
                .replace("[[", "")
                .replace("]]", ""));

        for(int i = 0; i < matriz.length; ++i){
            for (int j = 0; j < matriz[0].length; ++j){
                if (matriz[i][j] < 0){
                    mayorQueCero++;
                } else if (matriz[i][j] > 0) {
                    menorQueCero++;
                } else igualACero++;
            }
        }
        System.out.println("Greater than zero numbers on the given matriz: " + mayorQueCero);
        System.out.println("Equal to zero numbers on the given matriz: " + igualACero);
        System.out.println("Lower than zero numbers on the given matriz: " + menorQueCero);
    }
}
