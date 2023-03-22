package PracticaRepasoUD7A;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Examen_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int kMAX = 5;
        Pieza[] piezas = new Pieza[kMAX];

        Pieza pieza0 = new Pieza("pieza 0", new Dimension(ThreadLocalRandom.current().nextInt(0, 11), ThreadLocalRandom.current().nextInt(0, 11), ThreadLocalRandom.current().nextInt(0, 11)));
        Pieza pieza1 = new Pieza("pieza 1", new Dimension(ThreadLocalRandom.current().nextInt(0, 11), ThreadLocalRandom.current().nextInt(0, 11), ThreadLocalRandom.current().nextInt(0, 11)));
        Pieza pieza2 = new Pieza("pieza 2", new Dimension(ThreadLocalRandom.current().nextInt(0, 11), ThreadLocalRandom.current().nextInt(0, 11), ThreadLocalRandom.current().nextInt(0, 11)));
        Pieza pieza3 = new Pieza("pieza 3", new Dimension(ThreadLocalRandom.current().nextInt(0, 11), ThreadLocalRandom.current().nextInt(0, 11), ThreadLocalRandom.current().nextInt(0, 11)));
        Pieza pieza4 = new Pieza("pieza 4", new Dimension(ThreadLocalRandom.current().nextInt(0, 11), ThreadLocalRandom.current().nextInt(0, 11), ThreadLocalRandom.current().nextInt(0, 11)));

        piezas[0] = pieza0;
        piezas[1] = pieza1;
        piezas[2] = pieza2;
        piezas[3] = pieza3;
        piezas[4] = pieza4;

        for(int i = 0; i < piezas.length; i++){
            System.out.println(piezas[i]);
        }

        System.out.println("Modificamos el nombre de la pieza:");
        pieza0.setNombre(scanner.nextLine());

        System.out.println("Dime el alto de la pieza:");
        pieza0.getDim().setAlto(scanner.nextInt());

        System.out.println("Dime el ancho de la pieza:");
        pieza0.getDim().setAncho(scanner.nextInt());

        System.out.println("Dime el largo de la pieza:");
        pieza0.getDim().setLargo(scanner.nextInt());

       for(int i = 0; i < piezas.length; i++){
           System.out.println(piezas[i] + " Volumen: " + piezas[i].getDim().volumen());
       }
    }
}
