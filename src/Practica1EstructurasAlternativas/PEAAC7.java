package Practica1EstructurasAlternativas;
import java.util.Scanner;

/**
 Escribe un programa que lea tres números distintos y nos diga cuál es el mayor.
 */
public class PEAAC7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primerNumero, segundoNumero, tercerNumero;
        System.out.println("introduce un número por pantalla: ");
        primerNumero = scanner.nextDouble();
        System.out.println("introduce otro DIFERENTE al anterior: ");
        segundoNumero = scanner.nextDouble();
        System.out.println("introduce otro DIFERENTE a los anteriores: ");
        tercerNumero = scanner.nextDouble();

        if(primerNumero != segundoNumero && segundoNumero != tercerNumero && tercerNumero != primerNumero) {
            if(primerNumero > segundoNumero && segundoNumero > tercerNumero) {
                System.out.println(primerNumero + "es el número mayor.");
            }
            else if(primerNumero > tercerNumero && tercerNumero > segundoNumero) {
                System.out.println(primerNumero + "es el número mayor.");
            }
            else if(segundoNumero > primerNumero && primerNumero > tercerNumero) {
                System.out.println(segundoNumero + "es el número mayor.");
            }
            else if(segundoNumero > tercerNumero && tercerNumero > primerNumero) {
                System.out.println(segundoNumero + "es el número mayor.");
            }
            else if(tercerNumero > primerNumero && primerNumero > segundoNumero) {
                System.out.println(tercerNumero + "es el número mayor.");
            }
            else if(tercerNumero > segundoNumero && segundoNumero > primerNumero){
                System.out.println(tercerNumero + "es el número mayor");
            }
        }
        else{
            System.out.println("ERROR, los numeros introducidos deben ser diferentes. :(");
        }
    }
}