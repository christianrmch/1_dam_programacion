package Practica3Matrices;
import java.util.Arrays;
import java.util.Scanner;

public class P3M5 {

    /*
    Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
    empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por
    teclado la información de N personas distintas (valor también introducido por
    teclado). Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su
    sueldo. Esta información debe guardarse en una única matriz. Luego se mostrará por
    pantalla el sueldo medio de cada género.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de personas: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Eso no es un número, prueba de nuevo: ");
            scanner.next();
        }
        int personas = scanner.nextInt();
        int[][] matrizSalario = new int[personas][3];
        int[][] mediaSegunSexo = new int[2][1];

        for (int i = 0; i < matrizSalario.length; ++i) {
            for (int j = 0; j < matrizSalario[0].length; ++j) {
                matrizSalario[i][j] = i + 1;
                //Paramos en la segunda columna de cada fila (persona) y preguntamos el sexo.
                if (j == 1) {
                    System.out.println("Introduce tu sexo: 0 para hombre y 1 para mujer.");
                    //comprobamos que no introduce otros caracteres que no sean números
                    while (!scanner.hasNextInt()) {
                        System.out.println("Eso no es un número, prueba de nuevo: ");
                        scanner.next();
                    }
                    matrizSalario[i][j] = scanner.nextInt();
                    //comprobamos que esté dentro del rango
                    while (!(matrizSalario[i][j] >= 0 && matrizSalario[i][j] <= 1)) {
                        System.out.println("Este número está fuera del rango [0, 1], introduce uno que se encuentre dentro: ");
                        matrizSalario[i][j] = scanner.nextInt();
                    }
                }

                //Paramos en la tercera columan de cada fila (persona) y preguntamos el sueldo.
                else if (j == 2) {
                    System.out.println("Introduce tu salario");
                    //comprobamos que no introduce otros caracteres que no sean números
                    while (!scanner.hasNextInt()) {
                        System.out.println("Eso no es un número, prueba de nuevo: ");
                        scanner.next();
                    }
                    matrizSalario[i][j] = scanner.nextInt();
                    //comprobamos que sea algo coherente, que gane algo.
                    while (!(matrizSalario[i][j] >= 0)) {
                        System.out.println("No se pueden ingresar números negativos, prueba de nuevo: ");
                        matrizSalario[i][j] = scanner.nextInt();
                    }
                }
            }
        }

        //solo recorremos en busca del valor del sexo y sumamos el sueldo que tiene a mediaSegunSexo.
        int contadorxx = 0, contadorxy = 0;
        for (int i = 0; i < matrizSalario.length; i++){
            mediaSegunSexo[0][0] = 0;
            mediaSegunSexo[1][0] = 0;
            if (matrizSalario[i][1] == 0) {
                contadorxy++;
                mediaSegunSexo[0][0] += matrizSalario[i][2];
            }else{
                contadorxx++;
                mediaSegunSexo[1][0] += matrizSalario[i][2];
            }
        }

        //hacemos la media.
        mediaSegunSexo[0][0] /= contadorxy;
        mediaSegunSexo[1][0] /= contadorxx;

        System.out.println("la media del sueldo para el sexo 0 es: " + Arrays.toString(mediaSegunSexo[0]));
        System.out.println("la media del sueldo para el sexo 1 es: " + Arrays.toString(mediaSegunSexo[1]));
    }
}
