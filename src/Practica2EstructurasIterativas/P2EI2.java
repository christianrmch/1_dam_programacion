package Practica2EstructurasIterativas;

/**
 *  Realiza un programa que muestre los números pares comprendidos entre el 1 y el
 * 200. Para ello utiliza un contador y suma de 2 en 2.
 */
public class P2EI2 {
    public static void main(String[] args) {
        int contadorPares = 0;

        //1A forma
        for(int i=0; i <= 200; i++){
            System.out.println(contadorPares);
            contadorPares += 2;
        }

        System.out.println("\n");

        //2A forma
        for (int i = 1; i > 0 && i < 201; i++){
            if (i % 2 == 0){
                contadorPares = i;
                System.out.println(contadorPares);
            }
        }
    }
}
