package EjemplosExcepciones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dni, nombreCompleto, fNacimiento, telefono, ciudad;

        System.out.println("Por favor, introduce tu DNI");
        dni = sc.nextLine();

        System.out.println("Por favor, introduce tu Nombre completo (Nombre, 1r Apellido y 2o Apellido)");
        nombreCompleto = sc.nextLine();

        System.out.println("Por favor, introduce tu fecha de nacimiento en este formato dd/mm/aaaa");
        fNacimiento = sc.nextLine();

        System.out.println("Por favor, introduce tu teléfono");
        telefono = sc.nextLine();

        System.out.println("Por favor, introduce tu ciudad");
        ciudad = sc.nextLine();

        try {
            Persona p = new Persona(dni, nombreCompleto, fNacimiento, telefono, ciudad);
            System.out.println(p);
        } catch (InvalidDniException | InvalidEdadException | InvalidFechaException | InvalidNombreException e) {
            e.printStackTrace();
        }
    }
}
