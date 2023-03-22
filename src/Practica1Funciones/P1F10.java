package Practica1Funciones;
import java.util.Scanner;


public class P1F10 {
    /*
    . Realiza un programa que lea una fecha introduciendo el día, mes y año por
    separado y nos diga si la fecha es correcta o no. Supondremos que todos los
    meses tienen 30 días. Se debe crear una función donde le pasemos los datos y
    devuelva si es correcta o no.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca el día: ");
        int dia = scanner.nextInt();
        System.out.println("introduzca el mes: ");
        int mes = scanner.nextInt();
        System.out.println("introduzca el año: ");
        int year = scanner.nextInt();
        System.out.println("la fecha del año " + year + " es " + dateValidator(dia, mes));
    }

    public static String dateValidator(int day, int month) {
        if ((day > 0 && day <= 30) && (month > 0 && month <= 12)) {
            return "correcta";
        }
        else return "incorrecta";
    }
}
