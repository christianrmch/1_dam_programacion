package Practica3EstructurasIterativasII;
import java.util.Scanner;

/*
Realiza un programa que pida dos números enteros A y B, siendo B mayor que A.
Luego visualiza los números desde A hasta B e indicar cuantos hay que sean pares.
 */
public class P3EIII7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primerNumero, segundoNumero, numeroPar = 0;
        System.out.println("Por favor, introduce un número: ");
        while (!scanner.hasNextInt()){
            System.out.println("Esto no es un número");
            scanner.next();
        }
        primerNumero = scanner.nextInt();
        System.out.println("Por favor, introduce un número mayor que el anterior: ");
        while (!scanner.hasNextInt()){
            System.out.println("Esto no es un número");
            scanner.next();
        }
        segundoNumero = scanner.nextInt();
        while (!(segundoNumero > primerNumero)){
            System.out.println("No has introducido un número mayor que el anterior. Por favor, vuelve a intentarlo: ");
            segundoNumero = scanner.nextInt();
        }
        for (int i = primerNumero; i <=segundoNumero; i++){
            System.out.print(i + " ");
            if(i%2==0){
                numeroPar++;
            }
        }
        System.out.println();
        System.out.println("Números pares: " + numeroPar);
    }
}