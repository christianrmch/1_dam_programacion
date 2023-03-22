package LecturaYEscrituraFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EJ1_maximo_y_minimo {
    public static void main(String[] args){
        try {
            muestraContenido("..\\..\\..\\Documentos\\Documentos\\Libros\\numeros.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void muestraContenido(String archivo) throws IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
        }
        b.close();
    }
}
