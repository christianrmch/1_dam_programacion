package Practica1Funciones;
import java.util.Scanner;

public class P1F6{
    /*
    Escribe un programa que pida cinco precios y muestre por pantalla el precio de
    venta de cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un precio");
        double precioA = scanner.nextDouble();
        System.out.println("introduce un precio");
        double precioB = scanner.nextDouble();
        System.out.println("introduce un precio");
        double precioC = scanner.nextDouble();
        System.out.println("introduce un precio");
        double precioD = scanner.nextDouble();
        System.out.println("introduce un precio");
        double precioE = scanner.nextDouble();

        System.out.println("Primer precio IVA incluido " + precioConIVA(precioA) + " €");
        System.out.println("Primer precio IVA incluido " + precioConIVA(precioB) + " €");
        System.out.println("Primer precio IVA incluido " + precioConIVA(precioC) + " €");
        System.out.println("Primer precio IVA incluido " + precioConIVA(precioD) + " €");
        System.out.println("Primer precio IVA incluido " + precioConIVA(precioE) + " €");
    }
    private static double precioConIVA(double precio) {
        precio = precio + (precio*0.21);
        return precio;
    }
}