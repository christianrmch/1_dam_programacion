package Practica3Matrices;
import java.util.Arrays;
import java.util.Scanner;

/*
Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
“Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por
teclado y luego el programa mostrará la nota mínima, máxima y media de cada
alumno.
 */

public class P3M4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Creamos el array de alumnos y añadimos los nombres con un bucle for
        String[] alumnos = new String[4];
        for (int i = 0; i < alumnos.length; ++i) {
            alumnos[i] = "alumno " + (i+1);
        }

        //Definimos los arrays que vamos a utilizar más adelante
        int[][] notas = new int[4][5];
        int[][] notasMinimas = new int[4][1];
        int[][] notasMaximas = new int[4][1];
        double[][] notasMedias = new double[4][1];

        /*
        Introducimos las notas de los alumnos con dos bucles for
        El primero es para entrar en cada fila
        y el segundo para seleccionar y añadir las notas a cada columna
         */
        for (int i = 0; i < notas.length; ++i){
            for(int j = 0; j < notas[0].length; ++j){
                System.out.println("Introduce la nota de la asignatura " + (j+1) + " para el " + alumnos[i] + ": ");
                //Validamos que se introduzca un número dentro del rango [0, 10]
                notas[i][j] = scanner.nextInt();
                while (!(notas[i][j] >= 0 && notas[i][j] <= 10)){
                    System.out.println("Este número está fuera del rango [0, 10], introduce uno que se encuentre dentro: ");
                    notas[i][j] = scanner.nextInt();
                }
            }
        }

        /*
        Recorremos las notas de cada alumno con dos bucles for
        y comparamos cada nota con la anterior
        si es mayor se guarda en notasMaximas y, si es menor, en notasMinimas
        al final del primer bucle se divide las notas entre el número de notas para calcular la media
         */
        for(int i=0; i < notas.length; ++i){
            notasMinimas[i][0] = notas[i][0];
            notasMaximas[i][0] = notas[i][0];
            for(int j=0; j < notas[0].length; ++j){
                notasMedias[i][0] += notas[i][j];
                if (notas[i][j] > notasMaximas[i][0]){
                    notasMaximas[i][0] = notas[i][j];
                }else if (notas[i][j] < notasMinimas[i][0]){
                    notasMinimas[i][0] = notas[i][j];
                }
            }
            notasMedias[i][0] /= notas.length + 1;
        }

        for (int i = 0; i < notasMaximas.length; ++i){
            for(int k = 0; k < notasMaximas[0].length; ++k){
                System.out.println("la nota mínima del " + alumnos[i] + " es " + notasMinimas[i][k]);
                System.out.println("la nota máxima del " + alumnos[i] + " es " + notasMaximas[i][k]);
                System.out.println("la nota media del " + alumnos[i] + " es " + notasMedias[i][k]);
            }
        }
    }
}