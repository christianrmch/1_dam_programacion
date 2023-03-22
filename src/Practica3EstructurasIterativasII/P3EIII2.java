package Practica3EstructurasIterativasII;
import java.util.Scanner;

/*
Realiza un programa en java que pida un número entero positivo y nos diga si es
primo o no.
 */
public class P3EIII2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, validarPrimo=0;
        System.out.println("Por favor, introduce un número entero positivo: ");
        while (!scanner.hasNextInt()){
            System.out.println("Esto no es un número");
            scanner.next();
        }
        numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++){
            if (numero%i==0){
                validarPrimo++;
            }
        }
        if (validarPrimo==2){
            System.out.println("El número introducido, " + numero + ", es primo");
        }else System.out.println("El número introducido no es primo");
    }
}
