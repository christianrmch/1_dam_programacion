package Tarea_8_3_Herencia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        //Crea 5 instancias de la clase Producto
        Producto primero = new Producto("coche", 232);
        Producto segundo = new Producto("moto", 24);
        Producto tercero = new Producto("coche", 232);
        Producto cuarto = new Producto("avion", 56);
        Producto quinto = new Producto("tanque", 121);
        //Crea un ArrayList
        List<Producto> productos = new ArrayList<>();
        //Añade las 5 instancias de Producto al ArrayList
        productos.add(primero);
        productos.add(segundo);
        productos.add(tercero);
        productos.add(cuarto);
        productos.add(quinto);
        //Visualiza el contenido de ArrayList utilizando Iterator.
        visualizarArrayList(productos);
        System.out.println();
        //Elimina un elemento del ArrayList mediante el índice.
        productos.remove(2);
        //Elimina otro elemento del ArrayList pasándole como parámetro el producto a eliminar.
        productos.remove(segundo);
        //Inserta un nuevo objeto producto en medio de la lista.
        Producto sexto = new Producto("bicicleta", 234);
        productos.add(2, sexto);
        //Visualiza de nuevo el contenido de ArrayList utilizando Iterator.
        visualizarArrayList(productos);
        System.out.println();
        //Elimina todos los valores del ArrayList.
        productos.clear();
        System.out.println(productos);
    }

    private static void visualizarArrayList(List<Producto> productos) {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
