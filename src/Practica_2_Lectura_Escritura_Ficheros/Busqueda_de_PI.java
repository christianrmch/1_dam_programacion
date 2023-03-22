package Practica_2_Lectura_Escritura_Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Implementa un programa que pida al usuario un número de cualquier longitud, como por
 * ejemplo “1234”, y le diga al usuario si dicho número aparece en el primer millón de decimales
 * del nº pi (están en el archivo ‘pi-million.txt’). No está permitido utilizar ninguna librería ni clase
 * ni método que realice la búsqueda. Debes implementar el algoritmo de búsqueda tú.
 */
public class Busqueda_de_PI{
    static Scanner scanner;
    static BufferedReader br;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        br = null;
        Long n;
        boolean matchNum = true;
        do {
            System.out.println("introduce un nunero: ");
            n = scanner.nextLong();
            if(n==-1){
                // TODO("SALE DEL PROGRAMA")
            }
            String s = String.valueOf(n);
            try{
                br = new BufferedReader(new FileReader("./Documentos/Documentos/pi-millon.txt"));
                String line = br.readLine();
                for (int i = 0; i <line.length()-s.length(); i++) {
                    matchNum = true;
                    for (int j = 0; j < s.length(); j++) {
                        if (s.charAt(j) != line.charAt(i+j)){
                            matchNum = false;
                            break;
                        }
                    }
                    if(matchNum){
                        System.out.println("Sí");
                        break;
                    }
                }
                if(!matchNum){
                    System.out.println("No");
                }
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
            e.printStackTrace();
            }
        }
    }
}
