package Practica2EstructurasIterativas;

/*
Realiza un programa que sume independientemente los pares y los impares de los
números comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.
 */
public class P2EI11 {
    public static void main(String[] args) {
        int sumaPar = 0, sumaImpar = 0;
        for(double i = 100; i <= 200; i++){
            if(i%2==0){
                sumaPar += i;
            }else{
                sumaImpar += i;
            }
        }
        System.out.println("suma par: " + sumaPar);
        System.out.println("suma impar: " + sumaImpar);
    }
}
