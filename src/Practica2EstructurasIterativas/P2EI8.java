package Practica2EstructurasIterativas;
import java.util.Scanner;

/**
 * Realiza un programa que lea una secuencia de números no nulos hasta que se
 * introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos
 * positivos y cuantos negativos.
 * */
public class P2EI8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int numerosNegativos = 0, numerosPositivos = 0;
        System.out.println("Por favor, introduzca un número: ");

        while (!scanner.hasNextInt()){
            System.out.println("Esto no es un número!");
            scanner.next();
        }
        numero = scanner.nextInt();
        if (numero > 0) numerosPositivos++;
        if (numero < 0) numerosNegativos++;

        while(numero!=0){
           System.out.println("Por favor, introduzca un número: ");
           while(!scanner.hasNextInt()){
               System.out.println("Esto no es un número!");
               scanner.next();
           }
           numero = scanner.nextInt();
           if (numero < 0){
               numerosNegativos++;
           }
           if (numero > 0){
               numerosPositivos++;
           }
            numero = numero;
        }

        switch(numero){
            case 0:{
                if(numerosNegativos>0){
                    System.out.println("Entre los numeros introducidos hay algún número negativo.");
                    System.out.println("Hay " + numerosPositivos + " numeros positivos.");
                    System.out.println("Hay " + numerosNegativos + " numeros negativos.");
                } else {
                    System.out.println("Entre los numeros introducidos no hay ningún número negativo.");
                    System.out.println("Hay " + numerosPositivos + " numeros positivos.");
                    System.out.println("Hay " + numerosNegativos + " numeros negativos.");
                }
            }
            break;
        }
    }
}
