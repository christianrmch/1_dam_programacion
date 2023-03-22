package Practica1Funciones;
import java.util.Scanner;

public class P1F4 {
    /*
    Escribe un programa que pida un número entero por teclado y muestre por
    pantalla si es positivo, negativo o cero. Implementa y utiliza la función:
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número por pantalla: ");
        int entero = scanner.nextInt();
        System.out.println(dimeSigno(entero));
    }
    public static int dimeSigno(int a) {
        if (a > 0) return 1;
        else if(a < 0) return -1;
        else return 0;
        }
}
