package Practica1EstructurasAlternativas;
import java.util.Scanner;
/**
 * Realiza el diseño y la posterior implementación en Java del siguiente programa
 * de cálculo de un descuento:
 * a) El valor mínimo para optar al descuento es 100 y el descuento será de un
 * 10%
 * b) Pedir que se introduzca el precio inicial, en euros
 * c) Leer el precio introducido
 * d) Comprobar que el precio introducido sea mayor o igual al valor mínimo
 * para optar al descuento. En caso afirmativo, aplicar el descuento al precio
 * inicial.
 * e) Mostrar el precio final
 * */
public class PEAAC8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int valorMinimo = 100;
        Double precioInicial, precioPorcentajeDescuento, precioFinal;
        System.out.println("Introduzca el precio inicial del producto en euros, por favor: ");
        precioInicial = scanner.nextDouble();
        if (precioInicial >= valorMinimo){
            precioPorcentajeDescuento = precioInicial * 0.1;
            precioFinal = precioInicial - precioPorcentajeDescuento;
            System.out.println("el precio final es: " + precioFinal + "€");
        }else{
            System.out.println("Solo se puede optar al descuento con precios superiores o iguales a 100 euros. :(");
        }
    }
}
