package tareaCincoPOO;
import java.util.*;
public class Principal {

    //  Intenté hacerlo el static final con un ArrayList<Libros> para que la lista fuera variable
    //  pero daba muchos errores asi que puse un numero al azar.
    static final Libro[] biblioteca = new Libro[20];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu();
        int opcionDelUsuario = scanner.nextInt();
        do {
            switch (opcionDelUsuario) {
                case 1 -> anyadirLibro(biblioteca, scanner);
                case 2 -> visualizarBiblioteca(biblioteca);
                case 3 -> cambiarTitulo(biblioteca, scanner);
                case 4 -> cambiarAutor(biblioteca, scanner);
                case 5 -> cambiarISBN(biblioteca, scanner);
                //Una funcion más para ver cuanto espacio queda en la biblioteca
                case 6 -> verEspacioDisponible(biblioteca, scanner);
                //Otra para ver menú
                case 7 -> menu();
            }
            System.out.println("Introduce otra opción: ");
            opcionDelUsuario = scanner.nextInt();
        } while (opcionDelUsuario != -1);
    }

    private static void verEspacioDisponible(Libro[] biblioteca, Scanner scanner) {
        int contador = 0;
        for (Libro libro: biblioteca){
            if(libro == null){
                contador++;
            }
        }
        System.out.println(contador);
    }

    private static void menu() {
        System.out.println("""
                Menú:
                           
                1: Añadir libro a la biblioteca.
                2: Visualizar biblioteca.
                3: Cambiar título.
                4: Cambiar autor.
                5: Cambiar ISBN.
                6: Ver espacio disponible.
                7: Ver menú.
                -1: Salir del programa.
                 """);
    }

    private static void cambiarISBN(Libro[] biblioteca, Scanner scanner) {
        System.out.println("Introduce el libro del que quieras cambiar el ISBN: ");
        int libro = scanner.nextInt();
        System.out.println("Introduce el nuevo ISBN: ");
        scanner.nextLine();
        biblioteca[libro -1].setISBN(scanner.nextLine());
    }

    private static void cambiarAutor(Libro[] biblioteca, Scanner scanner) {
        System.out.println("Introduce el libro del que quieras cambiar el autor: ");
        int libro = scanner.nextInt();
        System.out.println("Introduce el nuevo autor: ");
        scanner.nextLine();
        biblioteca[libro -1].setAutor(scanner.nextLine());
    }

    private static void cambiarTitulo(Libro[] biblioteca, Scanner scanner) {
        System.out.println("Introduce el libro del que quieras cambiar el título: ");
        int libro = scanner.nextInt();
        System.out.println("Introduce el nuevo titulo del libro: ");
        scanner.nextLine();
        biblioteca[libro-1].setTitulo(scanner.nextLine());
    }


    private static void visualizarBiblioteca(Libro[] biblioteca) {
        if (hayLibros(biblioteca)) {
            for (int i = 0; i < biblioteca.length - 1; i++) {
                if (biblioteca[i] != null) {
                    System.out.println(biblioteca[i].toString());
                }
            }
        } else System.out.println("No hay libros que mostrar");
    }

    private static boolean hayLibros(Libro[] biblioteca) {
        int aux = 0;
        for (Libro libro: biblioteca) {
            if (libro != null) {
                aux = 1;
                break;
            }
        }
        return aux != 0;
    }


    private static void anyadirLibro(Libro[] biblioteca, Scanner scanner) {
        if(espacioDisponible(biblioteca)){
            System.out.println("¿Cuántos libros quieres añadir? ");
            int cantidad = scanner.nextInt();
            if (cantidad > 0 && cantidad <= 20) {
                scanner.nextLine();
                for (int i = 0; i < cantidad; i++){
                    for (int j = 0; j < biblioteca.length; j++){
                        if(biblioteca[j]==null) {
                            crearLibro(j, i, biblioteca, scanner);
                            break;
                        }
                    }
                }
            }
        } else System.out.println("No hay espacio en la biblioteca");
    }

    private static boolean espacioDisponible(Libro[] biblioteca) {
        int result = 0;
        for (Libro libro: biblioteca) {
            if(libro == null){
                result = 1;
                break;
            }
        }
        return result != 0;
    }


    private static void crearLibro(int j, int i, Libro[] biblioteca, Scanner scanner) {
        biblioteca[j] = new Libro();
        System.out.println("Introduce el titulo " + (i+1) + ": ");
        biblioteca[j].setTitulo(scanner.nextLine());
        System.out.println("Introduce el autor " + (i+1) + ": ");
        biblioteca[j].setAutor(scanner.nextLine());
        System.out.println("Introduce el isbn " + (i+1) + ": ");
        biblioteca[j].setISBN(scanner.nextLine());
    }
}