package Practica1EstructurasAlternativas;
import java.util.Scanner;

/**
 * . Escribe un programa que lea una calificación numérica entre 0 y 10 y la
 * transforma en calificación alfabética, escribiendo el resultado.
 * • de 0 a <3 Muy Deficiente.
 * • de 3 a <5 Insuficiente.
 * */
public class PEAAC10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int calificacionNumerica;
        System.out.println("introduce una calificación numérica entre el 0 y el 10 :");
        calificacionNumerica = scanner.nextInt();
        switch (calificacionNumerica) {
            case 0, 1, 2: {
                System.out.println("Muy Deficiente");
                break;
            }
            case 3, 4: {
                System.out.println("Insuficiente");
                break;
            }
            case 5: {
                System.out.println("Bien");
                break;
            }
            case 6, 7, 8: {
                System.out.println("Notable");
                break;
            }
            case 9, 10: {
                System.out.println("Sobresaliente");
                break;
            }
            default:{
                System.out.println("ERROR, la nota debe estar entre el 0 y el 10. ");
            }
        }
    }
}
