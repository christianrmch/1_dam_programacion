package Practica1Funciones;
import java.util.Scanner;

public class P1F1 {
    /*
    Escribe un programa que pida dos números reales por teclado y muestre por
    pantalla el resultado de multiplicarlos. Implementa y utiliza la función:
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca un número: ");
        double first = scanner.nextDouble();
        System.out.println("introduzca un número: ");
        double scnd = scanner.nextDouble();
        double mulpiplicacion = multiplica(first, scnd);
        System.out.println(mulpiplicacion);
    }

    public static double multiplica(double a, double b) {
        return a * b;
    }
}
