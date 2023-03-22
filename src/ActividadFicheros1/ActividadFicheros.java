package ActividadFicheros1;

import java.io.File;
import java.util.Scanner;

public class ActividadFicheros {
    /*
    Implementa un programa que cree, dentro de ‘Archivos’, tres nuevas carpetas: ‘Nóminas’,
    'Declaraciones de Renta' y ‘Clientes’. Mueve las carpetas ‘Enero’ y ‘Febrero’ dentro
    de ‘Nómminas’. Luego crea dentro de ‘Clientes’ una carpeta por cada cliente
    (en mayúsculas) de los introducidos previamente por pantalla, con un fichero con sus datos personales
    en cada carpeta.
    NOTA: Deberéis tener creada la carpeta 'Archivos' en el propio proyecto, así como 'Enero' y 'Febrero' dentro de
    'Archivos'. El resto lo creará el programa que implementéis.
    Clientes:
    Cliente 1
    Nombre: Jose Rodriguez Soria
    Edad: 43
    Ciudad: Alicante
    Cliente 2
    Nombre: Natalia Quiroga Pérez
    Edad: 32
    Ciudad: Benidorm
    Cliente 3
    Nombre: Nuria Sapiña Faez
    Edad: 63
    Ciudad: Madrid
    Cliente 4
    Nombre: Marcos Gavilán
    Edad: 28
    Ciudad: San Juan
     */
    static Scanner scanner;
    static File[] directorios;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        directorios = new File[1];
        crearDirectorios();
        moverDirectorios();
}

    private static void moverDirectorios() {
        if(!comprobarEspacioArray(directorios)){
          ampliarEspacioArray(directorios);
        }
    }

    private static void ampliarEspacioArray(File[] array) {
        File[] copiedArray = new File[array.length];
    }

    private static boolean comprobarEspacioArray(File[] array) {
        int resultado = 0;
        for (File file : array) {
            if (file != null) resultado++;
        }
        return resultado < array.length;
    }

    private static void crearDirectorios() {
        for (int i = 0; i < 3; i++) {
            System.out.print("introduce el nombre del directorio: ");
            File directorio = new File("./src/ActividadFicheros1/Archivos/" + scanner.nextLine());
            directorio.mkdir();
        }
    }
}
