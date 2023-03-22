package Practica3EstructurasIterativasII;
import java.util.Scanner;

public class P3EIII8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Por favor, introduzca el tamaño de la pirámide: ");
        size = scanner.nextInt();
        while (!(size>0)){
            System.out.println("La pirámide no puede tener un tamaño negativo! Intentalo de nuevo: ");
            size = scanner.nextInt();
        }
        //NUMERO DE FILAS
        for (int i = 1; i < size+1; i++){
            //CANTIDAD DE ESPACIOS
            for(int j = 0; j < size-i; j++){
                System.out.print(" ");
            }
            //NUMERO DE ASTERICOS
            for (int k = 0; k < (i*2)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
