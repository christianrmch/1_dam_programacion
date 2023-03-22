package Control_de_excepciones_P1;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*
        Implementa un programa que pida al usuario un valor entero A utilizando un nextInt() (de
        Scanner) y luego muestre por pantalla el mensaje “Valor introducido: …”. Se deberá tratar
        la excepción InputMismatchException que lanza nextInt() cuando no se introduce un
        entero válido. En tal caso se mostrará el mensaje “Valor introducido incorrecto”.
         */
        ejercicio1(scanner);
        ejercicio2(scanner);
    }

    private static void ejercicio2(Scanner scanner) {
        try{
            System.out.println("introduce un número entero: ");
            int x = scanner.nextInt();
            System.out.println("introduce otro número entero ");
            int y = scanner.nextInt();
            int division = x/y;
            System.out.println(division);
        } catch(InputMismatchException ime){
            System.out.println("Input Mismatch Excepcion: ");
        } catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception: ");
        }
    }

    private static void ejercicio1(Scanner scanner) {
            try{
                System.out.println("Introduce un número entero: ");
                int x = scanner.nextInt();
                System.out.println("valor introducido: " + x);
            }catch(InputMismatchException ime){
                ime.printStackTrace();
                System.out.println("valor introducido incorrecto");
            }
    }
}
