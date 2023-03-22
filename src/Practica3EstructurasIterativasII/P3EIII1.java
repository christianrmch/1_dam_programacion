package Practica3EstructurasIterativasII;

import java.util.Scanner;

public class P3EIII1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, cantidadDeMultiplos = 0;
        System.out.print ("dime un número: ");
        while (!scanner.hasNextInt()){
            System.out.println("Eso no es un número!");
            scanner.next();
        }
        numero = scanner.nextInt();
        cantidadDeMultiplos = numero/3;
        System.out.println("Cantidad de múltiplos de 3: " + cantidadDeMultiplos);
    }
}
