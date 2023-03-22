package Practica1EstructurasAlternativas;
import java.util.Scanner;
/*
 Escribe un programa que pide la edad por teclado y nos muestra el mensaje de
“Eres mayor de edad” solo si lo somos.
 */
public class PEAAC1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.println("introduce tu edad: ");
        edad = scanner.nextInt();
        if(edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
    }
}
