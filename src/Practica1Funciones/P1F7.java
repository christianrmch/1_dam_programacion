package Practica1Funciones;
import java.util.Scanner;


public class P1F7 {
    /*
    Escribe un programa que pida el ancho y alto de un rectángulo y muestre por
    pantalla su área y su perímetro. Implementa y utiliza las funciones:
    double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
    double areaRectangulo(double ancho, double alto) // Devuelve el área
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el ancho del rectángulo");
        double ancho = scanner.nextDouble();
        System.out.println("introduce el alto del rectángulo");
        double alto = scanner.nextDouble();
        System.out.println("el perímetro del rectángulo es: " + perimetroRectangulo(ancho, alto) + " u");
        System.out.println("el área del rectángulo es: " + areaRectangulo(ancho, alto) + " u^2");
    }

    public static double areaRectangulo(double ancho, double alto){
        return  ancho * alto;
    }

    public static double perimetroRectangulo(double ancho, double alto) {
        return 2*ancho + 2*alto;
    }
}
