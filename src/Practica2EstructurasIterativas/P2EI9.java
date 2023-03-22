package Practica2EstructurasIterativas;
import java.util.Scanner;

/**
 * Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros
 * números naturales.
 * */
public class P2EI9 {
    public static void main(String[] args) {
        int suma = 1, producto = 1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 2; i <=10; i++){
            suma += i;
            producto *= i;
        }
        System.out.println("la suma de los 10 primeros números naturales es: " + suma);
        System.out.println("el producto de los 10 primeros números naturales es: " + producto);
    }
}
