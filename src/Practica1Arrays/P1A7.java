package Practica1Arrays;
import java.util.Arrays;
import java.util.Scanner;

/*
Crea un programa que pida dos valores enteros P y Q, luego cree un array que
contenga todos los valores desde P hasta Q, y lo muestre por pantalla.
 */
public class P1A7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p, q, arraySize; int[] array;

        System.out.println("introduzca un número p:");
        p = scanner.nextInt();
        System.out.println("introduzca un número q:");
        q = scanner.nextInt();

        //El tamaño de la lista y si es negativo lo invertimos porque los array no pueden tener valores negativos.
        arraySize = p-q;
        if(arraySize < 0){
            arraySize = -arraySize;
        }
        array = new int[arraySize+1];

        //Bucle para agregar los valores al array
        for(int i = 0; i < array.length; i++){
            array[i] = p;
            if (p > q) {
                p--;
            }
            if (p < q){
                p++;
            }
        }

        System.out.println("La lista ordenada desde p hasta q es: " + Arrays.toString(array));
    }
}
