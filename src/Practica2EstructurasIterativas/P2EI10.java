package Practica2EstructurasIterativas;
import java.util.Scanner;

/**
 * Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10)
 * que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
 * */
public class P2EI10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota, numeroDeDieces = 0;
        System.out.println("Por favor, introduzca una nota del 0 al 10: ");
        nota = scanner.nextInt();
        while(nota!=-1){
            while(!(nota >= 0 && nota <= 10)){
                System.out.println("la nota tiene que ser entre 0 y 10!");
                nota = scanner.nextInt();
            }
            if(nota==10) numeroDeDieces++;
            System.out.println("Por favor, introduzca una nota del 0 al 10: ");
            nota = scanner.nextInt();
        }
        if(numeroDeDieces > 0) System.out.println("Ha habido " + numeroDeDieces + " numero de notas con valor 10.");
        else System.out.println("No ha habido notas con valor 10 :(");
    }
}
