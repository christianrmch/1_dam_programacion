package Examen_POO;

import java.util.Scanner;

public class Examen_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa primera, segunda;

        //Usamos el constructor que recibe 4 parámetros
        primera = new Empresa("ACME S.L.", "H12345678G", 123, 234731.54);

        //Usamos el constructor que recibe 3 parámetros
        segunda = new Empresa("EMCA S.A", "H98765432C", 321);

        //Tercera empresa instanciada
        Empresa tercera = new Empresa("E", "C", -1);

        System.out.println("Nombre de la empresa: ");
        segunda.setNombre(scanner.nextLine());

        System.out.println("CIF de la empresa: ");
        segunda.setCif(scanner.nextLine());

        System.out.println("Núm. trabajadores de la empresa: ");
        segunda.setNumTrabajadores(scanner.nextInt());

        System.out.println("Capital de la empresa: ");
        segunda.setCapital(scanner.nextDouble());

        System.out.println(
                "-------------------------------------------\n" +
                "------------- EMPRESAS --------------------\n" +
                primera.getNombre() + " " + primera.getCif() + " Núm trab: " + primera.getNumTrabajadores() +" Capital "+ primera.getCapital() + "\n" +
                segunda.getNombre() + " " + segunda.getCif() + " Núm trab: " + segunda.getNumTrabajadores() +" Capital "+ segunda.getCapital()
                );
    }
}
