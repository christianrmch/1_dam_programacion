package Practica1EstructurasAlternativas;
import jdk.dynalink.linker.support.CompositeTypeBasedGuardingDynamicLinker;

import java.util.Scanner;
/**
 Escribe un programa que lee dos números y los visualiza en orden ascendente.
 */
public class PEAAC5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primerNumero, segundoNumero;
        System.out.println("Introduce un primer número, por favor: ");
        primerNumero = scanner.nextDouble();
        System.out.println("Introduce un segundo número, por favor: ");
        segundoNumero = scanner.nextDouble();
        if (primerNumero > segundoNumero){
            System.out.println(primerNumero + " > " + segundoNumero);
        }
        else if(segundoNumero > primerNumero){
            System.out.println(segundoNumero + " > " + primerNumero);
        }else{
            System.out.println(primerNumero + " = " + segundoNumero);
        }
    }
}
