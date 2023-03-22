package Practica2CadenasDeTexto;
import java.util.Arrays;
import java.util.Scanner;

/*
Crea un programa que pida una cadena de texto por teclado y luego muestre cada
palabra de la cadena en una línea distinta.
 */

public class P2CDT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroEspacios = 0;
        String[] split;
        System.out.println("Introduce una cadena de texto: ");
        String cadenaTexto = scanner.nextLine();
        split = cadenaTexto.split(" ");

        for(int i = 0; i < split.length; i++){
            System.out.println(split[i]);
        }
    }
}
