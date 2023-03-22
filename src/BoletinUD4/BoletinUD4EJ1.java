package BoletinUD4;
import java.util.Scanner;
/*
Realiza el diseño y la posterior implementación en Java del siguiente programa
“Adivina el número“
a) El número secreto será el 241
b) Pedir un número por teclado
c) Leer el número
d) Comprobar si el número introducido es igual al número secreto
1) Si es igual, se informa del acierto
2) Si no es igual, se informa de que se ha fallado
*/

public class BoletinUD4EJ1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		final int numeroSecreto = 241;
		int numeroUsuario;
		//¿numeroUsuario == numeroSecreto?
		// SÍ -> "ACERTASTE"
		//NO -> "FALLASTE"
		System.out.println("¡Tienes que adivinar un número secreto!");
		System.out.println("Introduce un número: ");
		numeroUsuario = scanner.nextInt();
		if(numeroUsuario == numeroSecreto){
			System.out.println("¡Has acertado!");
		}else {
			System.out.println("¡Has fallado!");
		}
		scanner.close();
	}
}