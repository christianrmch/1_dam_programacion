package Practica2EstructurasIterativas;
import java.util.Scanner;

/*
. Realiza un programa que dada una cantidad de euros que el usuario introduce por
teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para
alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que
indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el
programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete
de 5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el
mínimo número de billetes posible).
 */

public class P2EI14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca la cantidad que desee retirar. Debe introducir un múltiplo de 5 y mayor que 0: ");
        int dineroDelCliente = scanner.nextInt();
        while(!(dineroDelCliente % 5 == 0) || dineroDelCliente < 0){
            System.out.println("Debe introducir una cantidad que sea múltiplo de 5 y mayor que 0: ");
            dineroDelCliente = scanner.nextInt();
        }
        int billetesDe500 = dineroDelCliente / 500;
        dineroDelCliente %= 500;
        int billetesDe200 = dineroDelCliente / 200;
        dineroDelCliente %= 200;
        int billetesDe100 = dineroDelCliente / 100;
        dineroDelCliente %= 100;
        int billetesDe50 = dineroDelCliente / 50;
        dineroDelCliente %= 50;
        int billetesDe20 = dineroDelCliente / 20;
        dineroDelCliente %= 20;
        int billetesDe10 = dineroDelCliente / 10;
        dineroDelCliente %= 10;
        int billetesDe5 = dineroDelCliente / 5;
        System.out.println("la cantidad minima de billetes para la cantidad introducida es: " + billetesDe500 + " billetes de 500");
        System.out.println("la cantidad minima de billetes para la cantidad introducida es: " + billetesDe200 + " billetes de 200");
        System.out.println("la cantidad minima de billetes para la cantidad introducida es: " + billetesDe100 + " billetes de 100");
        System.out.println("la cantidad minima de billetes para la cantidad introducida es: " + billetesDe50 + " billetes de 50");
        System.out.println("la cantidad minima de billetes para la cantidad introducida es: " + billetesDe20 + " billetes de 20");
        System.out.println("la cantidad minima de billetes para la cantidad introducida es: " + billetesDe10 + " billetes de 10");
        System.out.println("la cantidad minima de billetes para la cantidad introducida es: " + billetesDe5 + " billetes de 5");
    }
}


//Intenté sacarlo con arrays pero no sale :(.


/*
        Scanner scanner = new Scanner(System.in);
        int[] billetes = {500, 200, 100, 50, 20, 10, 5};
        int resultado = 0, tipoBillete = 0;
        System.out.println("por favor, introduzca la cantidad de dinero que quiera (Deben ser multiplo de 5): ");
        int dineroDelCliente = scanner.nextInt();
        while(!(dineroDelCliente%5==0)){
            System.out.println("Debe introducir una cantidad que sea múltiplo de 5: ");
            dineroDelCliente = scanner.nextInt();
        }
        while(!(dineroDelCliente==0)){
            for (int i = 0; i < billetes.length; i++){
                resultado += dineroDelCliente / billetes[i];
                dineroDelCliente %= billetes[i];
                if (dineroDelCliente==0){
                    tipoBillete = billetes[i];
                    break;
                }
            }
        }
        System.out.println("la cantidad minima de billetes para la cantidad introducida es: " + resultado + " billetes de " + tipoBillete);
 */