package Practica3EstructurasIterativasII;

/*
Realiza un programa para calcular la suma de los cuadrados de los 5 primeros
números naturales.
 */
public class P3EIII4 {
    public static void main(String[] args) {
        int suma = 0;
        for(int i = 0; i <= 4; i++){
            suma += Math.pow(i, 2);
        }
        System.out.println(suma);
    }
}
