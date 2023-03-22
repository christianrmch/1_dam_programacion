package Tarea1EjerciciosPOO;

public class Ejercicio71 {
    public static void main(String[] args) {
        Punto punto1 = new Punto(10, 10);
        Punto punto2 = new Punto(5, 2);
        Punto punto3 = new Punto(-3, 7);

        punto1.sumarX(10);
        punto1.sumarY(10);
        punto2.multiplicaX(2);
        punto2.multiplicaY(1);
        punto3.dividirX(2);
        punto3.dividirY(5);

        System.out.println(punto1.restarPuntos(punto2));
        System.out.println(punto1.getCordenadas());
        System.out.println(punto2.getCordenadas());
        System.out.println(punto3.getCordenadas());
    }
}