package Practica2CadenasDeTexto;

import java.util.Scanner;
/*
Realiza un programa que lea una frase por teclado e indique si la frase es un
palíndromo o no (ignorando espacios y sin diferenciar entre mayúsculas y
minúsculas). Supondremos que el usuario solo introducirá letras y espacios (ni
comas, ni puntos, ni acentos, etc.). Un palíndromo es un texto que se lee igual de
izquierda a derecha que de derecha a izquierda.
Por ejemplo:
Amigo no gima
Dabale arroz a la zorra el abad
Amo la pacífica paloma
A man a plan a canal Panama

 */
public class P2CDT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce text: ");
        String palindom = scanner.nextLine();

        // Quitamos todos los caracteres que no hacen falta y pueden dar fallos
        palindom = palindom.replace(" ", "")
                .replace(".", "")
                .replace(",", "")
                .replace("!", "")
                .replace("?", "")
                .replace("-", "");

        // por defecto true
        boolean result = true;

        // recorremos i < palindrom.length() / 2; para optimizar el bucle
        for (int i = 0; i < palindom.length() / 2; ++i) {
            char endChar = palindom.charAt(palindom.length() - i - 1);
            //Si encuentra algun carácter que no sea igual al correspondiente salimos del bucle.
            if (palindom.charAt(i) != endChar) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
