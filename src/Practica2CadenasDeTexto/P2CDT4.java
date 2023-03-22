package Practica2CadenasDeTexto;

import java.util.Scanner;

public class P2CDT4 {

    /*
    Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay
    (cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe
    diferenciar entre mayúsculas y minúsculas. Por ejemplo, dada la frase “Mi mama me
    mima” dirá que hay:
    Nº de A's: 3
    Nº de E's: 1
    Nº de I's: 2
    Nº de O's: 0
    Nº de U's: 0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce una oración: ");
        int vocalA = 0, vocalE = 0, vocalI = 0, vocalO = 0, vocalU = 0;
        String oracion = scanner.nextLine();
        oracion = oracion.toLowerCase();
        for (int i= 0; i < oracion.length(); i++) {
            if (oracion.charAt(i) == 'a'){
                vocalA++;
            } if (oracion.charAt(i) == 'e'){
                vocalE++;
            } if (oracion.charAt(i) == 'i'){
                vocalI++;
            } if (oracion.charAt(i) == 'o'){
                vocalO++;
            } if (oracion.charAt(i) == 'u'){
                vocalU++;
            }
        }
        System.out.println("Nº de A: " + vocalA);
        System.out.println("Nº de E: " + vocalE);
        System.out.println("Nº de I: " + vocalI);
        System.out.println("Nº de O: " + vocalO);
        System.out.println("Nº de U: " + vocalU);
    }
}