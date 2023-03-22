package BoletinUD4;
import java.util.Scanner;
/*
Diseña e implementa el siguiente programa:
1) Introducir una nota
2) Leer la nota
3) Mostrar información acerca de los valores posibles de notas (0 – 10)
a) Si es mayor o igual que 9 o igual a 10 la nota es “Excelente“
b) Entre 6.5 (incluido) y 9, la nota es “Notable“
c) Entre 5 (incluido) y 6.5 la nota es “Aprobado“
d) En cualquier otro caso “Suspendido“
*/
public class BoletinUD4EJ2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double nota = 0;
		System.out.println("Por favor, introduzca una nota: ");
		nota = scanner.nextDouble();
		if(nota >= 9 && nota <= 10){
			System.out.println("Excelente");
		}else if(nota>= 6.5 && nota < 9){
			System.out.println("Notable");
		}else if(nota>= 5 && nota < 6.5){
			System.out.println("Aprobado");
		}else if (nota>= 0 && nota < 5){
			System.out.println("Suspendido");
		}else{
			System.out.println("ERROR: nota no aceptada.");	
		}
	scanner.close();
	}
}