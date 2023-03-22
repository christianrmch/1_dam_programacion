package Practica1EstructurasAlternativas;
import java.util.Scanner;

/**
    Escribe un programa que lee dos números, calcula y muestra el valor de su suma,
    resta, producto y división. (Ten en cuenta la división por cero).
*/
public class PEAAC3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primerNumero, segundoNumero, suma, resta, producto, division;
        System.out.println("introduce un número, por favor: ");
        primerNumero = scanner.nextDouble();
        System.out.println("introduce otro, por favor: ");
        segundoNumero = scanner.nextDouble();

        suma = primerNumero + segundoNumero;
        System.out.println("La suma del primer número más el segundo es: " + suma);

        resta = primerNumero - segundoNumero;
        System.out.println("La resta del primer número menos el segundo es: " + resta);

        producto = primerNumero * segundoNumero;
        System.out.println("El producto del primer número y el segundo es: " + producto);

        division = primerNumero / segundoNumero;
        if (segundoNumero == 0.0){
            System.out.println("ERROR, no es posible realizar la división ya que el divisor es cero.");
        }else{
            System.out.println("La división del primer número entre el segundo es: " + division);
        }
    }
}
