package Practica1EstructurasAlternativas;
import java.util.Scanner;

/*
Escribe un programa que pide la edad por teclado y nos muestra el mensaje de
“eres mayor de edad” o el mensaje de “eres menor de edad”.
 */
public class PEAAC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.println("introduce tu edad: ");
        edad = scanner.nextInt();
        if(edad >= 18) {
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}
