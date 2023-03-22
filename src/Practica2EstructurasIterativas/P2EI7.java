package Practica2EstructurasIterativas;
import java.util.Scanner;

/**
 * Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
 * indicando cuántos son positivos y cuantos negativos.
 */

public class P2EI7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int numerosNegativos = 0;
        int numerosPositivos;
        for(int i =0; i <=9; i++){
            System.out.println("Por favor, introduce un número: ");
            while(!scanner.hasNextInt()){
                System.out.println("No ha introducido un número!");
                scanner.next();
            }
            numero = scanner.nextInt();
            if(numero < 0){
                numerosNegativos++;
            }
        }
        numerosPositivos = 10 - numerosNegativos;
        System.out.println("Ha introducido " + numerosNegativos + " numeros negativos.");
        System.out.println("Ha introducido " + numerosPositivos + " numeros positivos.");
    }
}
