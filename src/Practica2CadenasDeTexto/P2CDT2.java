package Practica2CadenasDeTexto;

import java.util.Scanner;

/*
Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 */
public class P2CDT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto1, texto2;
        boolean sonIguales;
        System.out.println("introduzca una cadena de texto:");
        texto1 = scanner.nextLine();
        System.out.println("introduzca otra cadena de texto:");
        texto2 = scanner.nextLine();
        if(texto1.equalsIgnoreCase(texto2)){
            sonIguales = true;
        } else sonIguales = false;
        System.out.println("son iguales: " + sonIguales);
    }
}