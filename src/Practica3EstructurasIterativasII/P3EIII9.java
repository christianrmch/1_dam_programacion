package Practica3EstructurasIterativasII;
import java.util.Scanner;

public class P3EIII9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, suma = 0;
        System.out.println("Por favor, introduzca un número entero: ");
        numero = scanner.nextInt();

        //restricción de números mayores que cero porque no se puede calcular el logaritmo de 0 o negativos
        while (!(numero > 0)){
            System.out.println("Por favor, introduzca un número mayor que cero: ");
            numero = scanner.nextInt();
        }

        //Para calcular la longitud del número || log10(n) = (n-1).09...
        int longitud = (int) (Math.log10(numero) + 1);

        //Dada la longitud del número solo hace falta un bucle for.
        for(int i = 0; i < longitud; i++){
                suma += (int) Math.pow(numero%10, 3);
                numero/=10;
        }
        System.out.println(suma);
    }
}
