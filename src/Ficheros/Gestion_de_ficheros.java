package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Gestion_de_ficheros {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        menu();
        System.out.print("Introduce una opción: ");
        int usuario = scanner.nextInt();
        while (usuario != -1) {
            scanner.nextLine();
            switch (usuario) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                //case 4 -> ejercicio4();
                //case 5 -> ejercicio5();
            }
            menu();
            System.out.println("Introduce otra opción: ");
            usuario = scanner.nextInt();
        }
    }

    private static void menu() {
        System.out.print("""
                1: Ejercicio 1
                2: Ejercicio 2
                3: Ejercicio 3
                4: Ejercicio 4
                5: Ejercicio 5
                """);
    }

    private static void ejercicio5() {}

    private static void ejercicio4() {}

    private static void ejercicio3() {
        System.out.print("Introduce la ruta del directorio al que quieres cambiar el nombre: ");
        String ruta = scanner.nextLine();
        try {
            while (!ruta.isBlank()){
                compruebaArchivo3(new File(ruta));
                System.out.print("\nIntroduce otra ruta: ");
                ruta = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el path: " + e.getMessage());
        }
    }

    private static void compruebaArchivo3(File file) throws FileNotFoundException {
        if (!file.exists()){
            throw new FileNotFoundException(file.getPath());
        } else {
            System.out.print("Introduce el nuevo nombre: ");
            cambiarNombreArchivo(file, scanner.nextLine());
        }
    }

    private static void cambiarNombreArchivo(File file, String nombre) {
        File renombrado = new File(file.getParent().concat("/"+nombre));
        if (file.renameTo(renombrado)){
            System.out.println(renombrado);
        } else System.out.println("problema");
    }

    private static void ejercicio2() {
        System.out.print("Introduce una ruta: ");
        String ruta = scanner.nextLine();
        try {
            while (!ruta.isBlank()) {
                compruebaArchivo2(new File(ruta));
                System.out.print("\nIntroduce otra ruta: ");
                ruta = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado la ruta: " + e.getMessage());
        }
    }

    private static void compruebaArchivo2(File file) throws FileNotFoundException {
        if (!file.exists()){
            throw new FileNotFoundException(file.getPath());
        } else {
            mostrarInfoRuta2(file, scanner.nextBoolean());
        }
    }

    private static void mostrarInfoRuta2(File ruta, boolean info) {
        scanner.nextLine();
        if(!info){
            mostrarInfoRuta1(ruta);
        } else {
            if (ruta.isFile()) System.out.println("\nnombre del archvio [A]: " + ruta.getName() + "\npeso en bytes: " + ruta.length());
            else if (ruta.isDirectory()) {
                System.out.println("\nnombre del directorio [*] : " + ruta.getAbsolutePath() + "\npeso en bytes: " + ruta.length());
                File[] archivos = ruta.listFiles();
                if (archivos != null){
                    Arrays.sort(archivos);
                    for (File file : archivos) if (file.isDirectory()) System.out.println("nombre del directorio: [*] " + file.getName() + "\npeso en bytes: " + ruta.length());
                    for (File file : archivos) if (file.isFile()) System.out.println("nombre del archivo: [A] " + file.getName() + "\npeso en bytes: " + ruta.length());
                }
            }
        }
    }

    private static void ejercicio1() {
        System.out.print("Introduce una ruta: ");
        String ruta = scanner.nextLine();
        try {
            while (!ruta.isBlank()) {
                compruebaArchivo1(new File(ruta));
                System.out.print("\nIntroduce otra ruta: ");
                ruta = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el path: " + e.getMessage());
        }
    }

    private static void compruebaArchivo1(File archivo) throws FileNotFoundException {
        if (!archivo.exists()) {
            throw new FileNotFoundException(archivo.getPath());
        } else {
            mostrarInfoRuta1(archivo);
        }
    }

    private static void mostrarInfoRuta1(File ruta) {
        if (ruta.isFile()) System.out.println("\nnombre del archvio [A]: " + ruta.getName());
        else if (ruta.isDirectory()) {
            System.out.println("\nnombre del directorio [*] : " + ruta.getAbsolutePath());
            File[] archivos = ruta.listFiles();
            if (archivos != null){
                for (File file : archivos) if (file.isDirectory()) System.out.println("nombre del directorio: [*] " + file.getName());
                for (File file : archivos) if (file.isFile()) System.out.println("nombre del archivo: [A] " + file.getName());
            }
        }
    }
}