package Tarea_8_2_Herencia;
import java.text.*;
import java.util.*;

public class Inventario {
    private static Animal[] animales = new Animal[1];
    public static void main(String[] args) throws ParseException {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        menu();
        int opcionUsuario = validadorIntConRango(scanner, 0, 7);
        while (opcionUsuario!=0){
            scanner.nextLine();
            switch(opcionUsuario){
                case 1 -> mostrarDatosAnimal(Inventario.animales);
                case 2 -> {
                    System.out.println("Introduce el nombre del animal:");
                    System.out.flush();
                    mostrarDatosAnimalConcreto(scanner.nextLine());
                }
                case 3 -> mostrarDatosTodosAnimales();
                case 4 -> menuCrearAnimal(scanner, formato);
                case 5 -> menuEliminarAnimal(scanner);
                case 6 -> vaciarInventario();
                case 7 -> menu();
            }
            System.out.println("Introduce otra opción: ");
            opcionUsuario = validadorIntConRango(scanner, -1, 7);
        }
    }

    private static int validadorInt(Scanner scanner) {
        while (!scanner.hasNextInt()){
            System.err.println("Esto no es un número, vuelve a intentarlo: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
    private static double validadorDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()){
            System.err.println("Esto no es un número, vuelve a intentarlo: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void vaciarInventario() {
        Arrays.fill(animales, null);
    }

    private static void menuEliminarAnimal(Scanner scanner) {
        if(contadoranimales(animales)==0){
            System.err.println("No hay animales para eliminar");
        } else{
            System.out.println("¿Qué animal quieres eliminar?");
            tipoAnimal();
            int tipo = validadorIntConRango(scanner, 1, 3);
            switch (tipo) {
                case 1 -> mostrarGatos(scanner);
                case 2 -> mostrarPerros(scanner);
                case 3 -> mostrarLoros(scanner);
            }
        }
    }

    private static int validadorIntConRango(Scanner scanner, int min, int max) {
      int numero = validadorInt(scanner);
            while(!(numero >= min && numero <= max)){
                System.err.println("El rango debe ser ente ["+min +", "+max+"]");
                numero= validadorInt(scanner);
            }
        return numero;
    }

    private static void mostrarLoros(Scanner scanner) {
        int loros = 0;
        for (Animal animal : animales) {
            if (animal instanceof Loro) {
                loros++;
                System.out.println((loros) + ": " + animal);
            }
        }
        if (loros == 0) {
            System.err.println("No hay loros en el inventario");
        } else {
            System.out.println("¿Cuál quieres eliminar?");
            eliminarAnimal(scanner.nextInt(), posicionesLoros(loros, Inventario.animales));
        }
    }

    private static void mostrarPerros(Scanner scanner) {
        int perros = 0;
        for (Animal animal : animales) {
            if (animal instanceof Perro) {
                perros++;
                System.out.println((perros) + ": " + animal);
            }
        }
        if (perros==0){
            System.err.println("No hay perros en el inventario");
        } else {
            System.out.println("¿Cuál quieres eliminar?");
            eliminarAnimal(scanner.nextInt(), posicionesPerros(perros, Inventario.animales));
        }
    }

    private static void mostrarGatos(Scanner scanner) {
        int gatos = 0;
        for (Animal animal : animales) {
            if (animal instanceof Gato) {
                gatos++;
                System.out.println((gatos) + ": " + animal);
            }
        }
        if(gatos == 0){
            System.err.println("No hay gatos en el inventario");
        } else {
            System.out.println("¿Cuál quieres eliminar?");
            eliminarAnimal(validadorInt(scanner), posicionesGatos(gatos, Inventario.animales));
        }
    }

    private static int[] posicionesGatos(int tamanyo, Animal[] animales) {
        int[] posiciones = new int[tamanyo];
        Arrays.fill(posiciones, -1);
        for(int i = 0; i < animales.length; i++){
            if(animales[i] instanceof Gato){
                for (int j = 0; j < posiciones.length; j++) {
                    if (posiciones[j] == -1) {
                        posiciones[j] = i;
                        break;
                    }
                }
            }
        }
        return posiciones;
    }
    private static int[] posicionesPerros(int tamanyo, Animal[] animales) {
        int[] posiciones = new int[tamanyo];
        Arrays.fill(posiciones, -1);
        for(int i = 0; i < animales.length; i++){
            if(animales[i] instanceof Perro){
                for (int j = 0; j < posiciones.length; j++) {
                    if (posiciones[j] == -1) {
                        posiciones[j] = i;
                        break;
                    }
                }
            }
        }
        return posiciones;
    }

    private static int[] posicionesLoros(int tamanyo, Animal[] animales) {
        int[] posiciones = new int[tamanyo];
        Arrays.fill(posiciones, -1);
        for(int i = 0; i < animales.length; i++){
            if(animales[i] instanceof Loro){
                for (int j = 0; j < posiciones.length; j++) {
                    if (posiciones[j] == -1) {
                        posiciones[j] = i;
                        break;}
                }
            }
        }
        return posiciones;
    }

    private static void eliminarAnimal(int tamanyo, int[] posicionesAnimales) {
            animales[posicionesAnimales[tamanyo-1]] = null;
    }
    private static Date crearFecha(Scanner scanner, DateFormat formato) throws ParseException {
        System.out.println("introduce una fecha con el siguiente formato: dd/MM/yyyy");
        return formato.parse(scanner.nextLine());
    }

    private static void menuCrearAnimal(Scanner scanner, DateFormat dateFormat) throws ParseException {
        System.out.println("¿Qué tipo de animal quieres crear?");
        tipoAnimal();
        int tipo = validadorIntConRango(scanner, 1, 3);
        switch (tipo) {
            case 1 -> anyadirAnimal(crearGato(scanner, dateFormat));
            case 2 -> anyadirAnimal(crearPerro(scanner, dateFormat));
            case 3 -> anyadirAnimal(crearLoro(scanner, dateFormat));
        }
    }

    private static void anyadirAnimal(Animal animal){
        if (contadoranimales(animales) == animales.length) {
            aumentarTamanyoArray();
            anyadirAnimal(animal);
        } else {
            for (int i = 0; i < animales.length; i++){
                if (animales[i] == null) {
                    animales[i] = animal;
                    break;
                }
            }
        }
    }

    private static void aumentarTamanyoArray(){
        Animal[] copiaArrayanimales = new Animal[animales.length];
        for (int i = 0; i < animales.length; i++) {
            copiaArrayanimales[i] =  animales[i];
        }

        animales = new Animal[copiaArrayanimales.length + 1];
        for (int i = 0; i < copiaArrayanimales.length; i++) {
            animales[i] = copiaArrayanimales[i];
        }
    }

    private static int contadoranimales(Animal[] animales) {
        int numeroanimales = 0;
        for (Animal animal : animales) {
            if (animal != null) {
                numeroanimales++;
            }
        }
        return numeroanimales;
    }

    private static Perro crearPerro(Scanner scanner, DateFormat dateFormat) throws ParseException {
        System.out.println("Introduce su nombre");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        System.out.println("Introduce su fecha de nacimiento");
        Date fecha = crearFecha(scanner, dateFormat);
        Animal.Estado estado = seleccionarEstado(scanner);
        System.out.println("Introduce su raza:");
        scanner.nextLine();
        String raza = scanner.nextLine();
        System.out.println("Introduce su color:");
        String color = scanner.nextLine();
        return new Perro(nombre, fecha, estado, raza, color);
    }

    private static Loro crearLoro(Scanner scanner, DateFormat dateFormat) throws ParseException {
        System.out.println("Introduce su nombre");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        System.out.println("Introduce su fecha de nacimiento");
        Date fecha = crearFecha(scanner, dateFormat);
        Animal.Estado estado = seleccionarEstado(scanner);
        System.out.println("Introduce su longitud del pico");
        scanner.nextLine();
        double longitud = validadorDouble(scanner);
        System.out.println("Introduce su origen");
        scanner.nextLine();
        String origen = scanner.nextLine();
        return new Loro(nombre, fecha, estado, longitud, origen);
    }

    private static Gato crearGato(Scanner scanner, DateFormat dateFormat) throws ParseException {
        System.out.println("Introduce su nombre");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        System.out.println("Introduce su fecha de nacimiento");
        Date fecha = crearFecha(scanner, dateFormat);
        Animal.Estado estado = seleccionarEstado(scanner);
        Gato.Pelo tipoPelo = seleccionarTipoPelo(scanner);
        System.out.println("Introduce su color");
        scanner.nextLine();
        String color = scanner.nextLine();
        return new Gato(nombre, fecha, estado, tipoPelo, color);
    }
    private static Animal.Estado seleccionarEstado(Scanner scanner) {
        tipoEstado();
        switch (validadorIntConRango(scanner, 1, 2)){
            case 1 -> {
                return Animal.Estado.SANO;
            }
            case 2 -> {
                return Animal.Estado.ENFERMO;
            }
        }
        return null;
    }

    private static Gato.Pelo seleccionarTipoPelo(Scanner scanner) {
        tipoPelo();
        switch(validadorIntConRango(scanner, 1, 5)){
            case 1 -> {
                return Gato.Pelo.LARGO;
            }
            case 2 -> {
                return Gato.Pelo.CORTO;
            }
            case 3 -> {
                return Gato.Pelo.SEMILARGO;
            }
            case 4 -> {
                return Gato.Pelo.RIZADO;
            }
            case 5 -> {
                return Gato.Pelo.SIN_PELO;
            }
        }
        return null;
    }

    private static void tipoEstado() {
        System.out.println("""
                Elige su estado:
                1: SANO
                2: ENFERMO""");
    }

    private static void tipoPelo() {
        System.out.println("""
                    Elige su tipo de pelo:
                    1 -> LARGO
                    2 -> CORTO
                    3 -> SEMILARGO
                    4 -> RIZADO
                    5 -> SIN_PELO""");
    }

    private static void tipoAnimal() {
        System.out.println("""
             1: Gato
             2: Perro
             3: Loro""");
    }

    private static void mostrarDatosTodosAnimales() {
        if (contadoranimales(animales)==0){
            System.err.println("No hay animales para mostrar");
        } else {
            for (Animal animal : animales) {
                if (animal != null) {
                    System.out.println(animal);
                }
            }
        }
    }

    private static void mostrarDatosAnimalConcreto(String nombre) {
        int contadorNoNulos = 0;
        for (Animal animal : animales) {
            if (animal != null && nombre.equalsIgnoreCase(animal.getNombre())) {
                System.out.println(animal);
                contadorNoNulos++;
            }
        }
        if (contadorNoNulos == 0){
            System.err.println("No hay ningún animal con ese nombre");
        }
    }

    private static void mostrarDatosAnimal(Animal[] animales) {
        int nulos = 0;
        for (Animal animal : animales) {
            if (animal instanceof Gato) {
                System.out.println("Gato{" + "nombre='" + animal.getNombre() + "'}");
            } else if (animal instanceof Loro) {
                System.out.println("Loro{" + "nombre='" + animal.getNombre() + "'}");
            } else if (animal instanceof Perro) {
                System.out.println("Perro{" + "nombre='" + animal.getNombre() + "'}");
            } else if (animal == null) {
                nulos++;
            }
        }
        if(nulos == animales.length){
            System.err.println("No hay animales que mostrar");
        }
    }
    private static void menu() {
        System.out.println("""
                1: Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal).
                2: Mostrar todos los datos de un animal concreto.
                3: Mostrar todos los datos de todos los animales.
                4: Insertar animales en el inventario.
                5: Eliminar animales del inventario.
                6: Vaciar el inventario.
                7: Mostrar menú.
                0: Salir del programa.""");
    }
}