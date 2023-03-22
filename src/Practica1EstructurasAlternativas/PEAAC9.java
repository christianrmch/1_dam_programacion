package Practica1EstructurasAlternativas;
import java.util.Scanner;
/**
 * . Modifica el programa anterior para que, en lugar de hacer el descuento del 10 %
 * a los productos de 100 € o más, aplique una penalización de 2 € si el precio es
 * menor de 30 €*/
public class PEAAC9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int valorMinimo = 30;
        Double precioInicial, precioPenalizacion, precioFinal;
        System.out.println("Introduzca el precio inicial del producto en euros, por favor: ");
        precioInicial = scanner.nextDouble();
        if (precioInicial < valorMinimo){
            precioPenalizacion = (double) 2;
            precioFinal = precioInicial + precioPenalizacion;
            System.out.println("el precio final es: " + precioFinal + "€");
        }else{
            System.out.println("Felicidades, no se le ha aplicado la penalización de 2€! :)");
        }
    }
}
