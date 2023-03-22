package Practica1EstructurasAlternativas;
import java.util.Scanner;

public class PEAAC6 {
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
        else{
            System.out.println("Los dos números, " + primerNumero + " y " + segundoNumero + ", son iguales.");
        }
    }
}
