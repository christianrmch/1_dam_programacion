package tareaCincoPOO;

import java.util.Scanner;

public class LibroMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libro primero = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", "0060114185");
        System.out.println("""
                Opciones:
                                
                1: Ver información del libro
                2: Modificar título
                3: Modificar autor
                4: Modificar ISBN
                -1: Salir del programa.
                """);
        int opcion = scanner.nextInt();
        do {
            scanner.nextLine();
            switch (opcion) {
                case 1 ->{
                    System.out.println("El título del libro es: " + primero.getTitulo());
                    System.out.println("El autor del libro es: " +primero.getAutor());
                    System.out.println("El ISBN del libro es: " +primero.getISBN() + "\n");
                }

                case 2 -> {
                    System.out.println("Introduce el nuevo título: ");
                    primero.setTitulo(scanner.nextLine());
                }
                case 3 -> {
                    System.out.println("Introduce el nuevo autor:  ");
                    primero.setAutor(scanner.nextLine());
                }
                case 4 -> {
                    System.out.println("Introduce el nuevo ISBN: ");
                    primero.setISBN(scanner.nextLine());
                }
            }
            System.out.println("Introduce otra opcion: ");
            opcion = scanner.nextInt();
        } while (opcion != -1);
    }
}