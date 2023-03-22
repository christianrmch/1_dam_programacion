package Practica3EstructurasIterativasII;
import java.util.Scanner;

public class P3EIII5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String asteriscos = "";
        System.out.print("Por favor, introduzca el número de asteriscos que desee imprimir: ");
        int size = scanner.nextInt(); // size = tamaño
        if (size>0){
            for (int i = 0; i < size; i++){
                asteriscos += "*";
            }
            System.out.println(asteriscos);
        }else{
            asteriscos = "*";
            System.out.println(asteriscos);
        }
    }
}
