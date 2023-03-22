package Practica2EstructurasIterativas;
import java.util.Scanner;

/**
 Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si
 ha leído algún número negativo o no.
 */
public class P2EI6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean numerosNegativos = false;

        for(int i = 0; i <=9; i++){
            System.out.println("Por favor, introduce un número!");
            while (!scanner.hasNextInt()) {
                System.out.println("Eso no es un número!");
                scanner.next(); // IMPORTANTE!
            }
            numero = scanner.nextInt();
            if(numero < 0){
                numerosNegativos = true;
            }
        }
        if(numerosNegativos){
            System.out.println("En los números introducidos hay números negativos.");
        }else System.out.println("En los números introducidos no hay números negativos.");
    }
}
