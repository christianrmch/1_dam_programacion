package Tarea1EjerciciosPOO;
import java.util.Scanner;


public class Ejercicio72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Objeto persona usando constructores vacios
        Persona sujetoUno = new Persona();
        Persona sujetoDos = new Persona();

        //Objeto perosa usando constructores con parámetros
        Persona sujetoTres = new Persona( "23424T", "Christian", "Mamani Choque", 22);

        System.out.println("Introduce el nombre de la primera persona: ");
        sujetoUno.setNombre(scanner.next());
        System.out.println("Introduce los apellidos de la primera persona: ");
        sujetoUno.setApellido(scanner.next(), scanner.next());
        System.out.println("Introduce la edad de la primera persona: ");
        sujetoUno.setEdad(scanner.nextInt());
        System.out.println("Introduce el dni de la primera persona: ");
        sujetoUno.setDni(scanner.nextInt(), scanner.next().charAt(0));

        System.out.println("Introduce el nombre de la segunda persona: ");
        sujetoDos.setNombre(scanner.next());
        System.out.println("Introduce los apellidos de la segunda persona: ");
        sujetoDos.setApellido(scanner.next(), scanner.next());
        System.out.println("Introduce la edad de la segunda persona: ");
        sujetoDos.setEdad(scanner.nextInt());
        System.out.println("Introduce el dni de la segunda persona: ");
        sujetoDos.setDni(scanner.nextInt(), scanner.next().charAt(0));

        System.out.println(
                sujetoUno.getNombre() + " " +
                sujetoUno.getApellidos() +
                " con DNI: " +
                sujetoUno.getDni() +
                " tiene " + sujetoUno.getEdad() +
                " años " +
                sujetoUno.esMayorDeEdad(sujetoUno.getEdad()) +
                " es mayor de edad"
        );
        System.out.println(sujetoDos.getNombre() + " " +
                sujetoDos.getApellidos() +
                " con DNI: " +
                sujetoDos.getDni() +
                " tiene " +
                sujetoDos.getEdad() +
                " años " +
                sujetoDos.esMayorDeEdad(sujetoDos.getEdad()) +
                " es mayor de edad"
        );
    }
}
