package Practica1EstructurasAlternativas;
import java.util.Scanner;
/**
 * 4. Escribe un programa que lee 2 números y muestra el mayor.
 */
public class PEAAC4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primerNumero, segundoNumero;
        System.out.println("introduce un número por pantalla: ");
        primerNumero = scanner.nextDouble();
        System.out.println("introduce otro número por pantalla: ");
        segundoNumero = scanner.nextDouble();
        if (primerNumero > segundoNumero){
            System.out.println("el numero mayor es: ");
            System.out.println(primerNumero);
        }
        else if(segundoNumero > primerNumero){
            System.out.println("el numero mayor es: ");
            System.out.println(segundoNumero);
        }
        /*La opción de primerNumero == segundoNumero se encuentra en el ejercicio 6*/
        else{
            System.out.println("ERROR");
        }
    }
}
