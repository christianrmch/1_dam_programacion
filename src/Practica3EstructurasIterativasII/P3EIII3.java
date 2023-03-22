package Practica3EstructurasIterativasII;

import java.util.Scanner;

/*
Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el
último dado. La introducción de números finaliza con la introducción de un 0. Al final
se mostrará:
El total de números introducidos, excluido el 0.
El total de números fallados.

dime un número inicial: 20
 */
public class P3EIII3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, numeroComparado, contadorNumeros = 0, numerosFallidos = 0;
        System.out.println("Dime un número inicial: ");
        while (!scanner.hasNextInt()){
            System.out.println("Esto no es un número");
            scanner.next();
        }
        numero = scanner.nextInt();
        System.out.println("Dime un número: ");
        while (!scanner.hasNextInt()){
            System.out.println("Esto no es un número");
            scanner.next();
        }
        numeroComparado = scanner.nextInt();
        do {
            if (numeroComparado < numero){
                    System.out.println("Fallo es menor.");
                    numero = numeroComparado;
                    contadorNumeros++;
                    numerosFallidos++;
                }else{
                    numero = numeroComparado;
                    contadorNumeros++;
                }
            System.out.println("Dime un número: ");
            while (!scanner.hasNextInt()){
                System.out.println("Esto no es un número");
                scanner.next();
            }
            numeroComparado = scanner.nextInt();
        }while (numeroComparado!=0);
        System.out.println("total de números introducidos: " + contadorNumeros);
        System.out.println("Números fallados: " + numerosFallidos);
    }
}
