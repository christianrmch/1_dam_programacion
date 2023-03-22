package Practica3EstructurasIterativasII;
import java.util.Scanner;

/*
Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por
pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada número
tantas veces como su valor.
Ejemplo:
*/
public class P3EIII6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroUsuario;
        System.out.println("Por favor, introduzca un número del 0 al 20: ");
        numeroUsuario = scanner.nextInt();
        while (!(numeroUsuario >= 0 && numeroUsuario <= 20)){
            System.out.println("Este número está fuera del rango [0, 20], introduce uno que se encuentre dentro: ");
            numeroUsuario = scanner.nextInt();
        }
        for (int i = 1; i <= numeroUsuario; i++){
            for (int j = 1; j <=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}