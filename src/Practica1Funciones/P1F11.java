package Practica1Funciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class P1F11 {
    /*
    Realiza un programa que escriba la tabla de multiplicar de un número
    introducido por teclado. Para ello implementa una función que reciba como
    parámetro un número entero y muestre por pantalla la tabla de multiplicar de
    dicho número.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qué tabla de multiplicar quieres: ");
        int numero = scanner.nextInt();
        System.out.println(multiplyTable(numero).
                replace("[", "").
                replace("]", "").
                replace(",", "")
        );
    }

    public static String multiplyTable(int numero) {
        List<Object> multiplyTable = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            multiplyTable.add(numero + " * " + i + " = " + (numero*i) + "\n");
        }
        multiplyTable.add(0, "");
        return multiplyTable.toString();
    }
}
