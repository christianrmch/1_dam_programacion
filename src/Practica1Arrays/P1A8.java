package Practica1Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Crea un programa que cree un array con 100 números reales aleatorios entre 0.0
 * y 1.0, utilizando Math.random(), y luego le pida al usuario un valor real R. Por
 * último, mostrará cuántos valores del array son igual o superiores a R.
 */

public class P1A8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arrayOfDoubles = new double[100];
        int equalValues = 0, superiorValues = 0;
        double random, realNumber;

        System.out.println("introduzca un valor real R de un decimal: ");
        realNumber = scanner.nextDouble();
        while(!(realNumber>=0.0 && realNumber<=1.0)){
            System.out.println("introduzca un valor real R de un decimal: ");
            realNumber = scanner.nextDouble();
        }
        for(int i = 0; i <arrayOfDoubles.length; i++){
            random =Math.floor(Math.random() * (10)) / 10;
            if(random == realNumber){
                equalValues++;
            }else if( random > realNumber){
                superiorValues++;
            }
            arrayOfDoubles[i] = random;
        }
        System.out.println(Arrays.toString(arrayOfDoubles));
        System.out.println("numeros igaules a R: " + equalValues);
        System.out.println("numeros superiores a R: " + superiorValues);
    }
}
