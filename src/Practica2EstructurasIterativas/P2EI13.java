package Practica2EstructurasIterativas;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el
ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números una y
otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si es mayor,
menor o igual al número que ha pensado).
 */
public class P2EI13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hasta = 100, desde=1,  mayorMenor;
        String respuesta;
        boolean acierto = false;
        do {
            int numeroRandom = ThreadLocalRandom.current().nextInt(desde, hasta+1);
             System.out.println("\nEs " + numeroRandom + " el número en el que estás pensando? \n");
            System.out.println("Si es así, pulsa la tecla 's' y si no, la 'n': ");
            respuesta = scanner.next();
            if(respuesta.equals("n")){
                System.out.println("¿El número que he propuesto, " + numeroRandom + ", es mayor o menor al que estás pensando?\n");
                System.out.println("introduce 1 para indicar que es mayor y -1 para indicar que es menor: ");
                mayorMenor = scanner.nextInt();
                switch(mayorMenor){
                    case 1 :{
                        hasta = numeroRandom;
                        break;
                    }
                    case (-1) :{
                        desde = numeroRandom;
                        break;
                    }
                }
            } else if (respuesta.equals("s")) {
                acierto = true;
            }
        }while(!acierto);
        System.out.println("Qué bien! lo he adivinado!");
    }
}
