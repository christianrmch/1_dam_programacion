package Practica1Funciones;
import java.util.Scanner;

public class P1F13 {
    /*
    Realiza un programa que calcule el porcentaje de descuento que nos han hecho
    al comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad con el
    descuento aplicado. Se debe crear una función a la que le pasemos ambos
    valores y nos devuelva el descuento.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el precio del artículo sin descuento: ");
        double precioSinDescuento = scanner.nextDouble();
        System.out.println("introduce el precio del artículo con descuento: ");
        double precioConDescuento = scanner.nextDouble();
        System.out.println("El porcentaje de descuento aplicado sobre el artículo es de: " + porcentajeDescuento(precioSinDescuento, precioConDescuento) + " %");
    }
    public static double porcentajeDescuento(double precioSinDescuento, double precioConDescuento) {
        double descuento = precioConDescuento * 1 / precioSinDescuento;
        return (1 - descuento) * 100;
    }
}
