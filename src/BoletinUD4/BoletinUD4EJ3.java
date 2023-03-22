package BoletinUD4;
import java.util.Scanner;
import java.lang.Math;
/*
3. Diseña e implementa el siguiente programa: (SWITCH)
• Pedir dos números enteros
• Mostrar un menú que dé a elegir entre 4 opciones posibles:
• Leer la opción seleccionada
– Diseña e implementa el siguiente programa:
– Pedir dos números enteros
– Mostrar un menú que dé a elegir entre 4 opciones posibles:
– Leer la opción seleccionada
• Se muestra el resultado por pantalla

*/
public class BoletinUD4EJ3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double primerEntero, segundoEntero, producto, division, potencia, suma, resta;
		int opcion;
		do{
			System.out.println("¿Qué operacion quieres hacer?\n");
			System.out.println("1: sumar");
			System.out.println("2: restar");
			System.out.println("3: producto");
			System.out.println("4: division");
			System.out.println("5: obtener el potencia de un numero");
			System.out.println("6: Salir del programa \n");
			opcion = scanner.nextInt();
			switch (opcion) {
				case 1:{
					System.out.println("suma de dos numeros enteros: \n");
					System.out.println("introduce un numero entero");
					primerEntero = scanner.nextInt();
					System.out.println("introduce otro entero: ");
					segundoEntero = scanner.nextInt();

					suma = primerEntero + segundoEntero; 
					System.out.println("El resultado de la suma es: " + suma + "\n");
					break;
				}
				case 2:{
					System.out.println("resta de dos numeros enteros: \n");
					System.out.println("introduce un numero entero");
					primerEntero = scanner.nextInt();
					System.out.println("introduce otro entero: ");
					segundoEntero = scanner.nextInt();

					resta = primerEntero - segundoEntero; 
					System.out.println("El resultado de la resta es: " + resta + "\n");
					break;
				}
				case 3:{
					System.out.println("producto de dos numeros enteros: \n");
					System.out.println("introduce un numero entero");
					primerEntero = scanner.nextInt();
					System.out.println("introduce otro entero: ");
					segundoEntero = scanner.nextInt();

					producto = primerEntero * segundoEntero; 
					System.out.println("El resultado del producto es: " + producto + "\n");
					break;
				}
				case 4:{
					System.out.println("division de dos numeros enteros: \n");
					System.out.println("introduce un numero entero");
					primerEntero = scanner.nextInt();
					System.out.println("introduce otro entero: ");
					segundoEntero = scanner.nextInt();

					division = primerEntero / segundoEntero; 
					System.out.println("El resultado de la division es: " + division + "\n");
					break;
				}
				case 5:{
					System.out.println("potencia de dos numeros enteros: \n");
					System.out.println("introduce un numero entero");
					primerEntero = scanner.nextInt();
					System.out.println("introduce otro entero: ");
					segundoEntero = scanner.nextInt();

					potencia = Math.pow(primerEntero, segundoEntero); 
					System.out.println("El resultado de la potencia es: " + potencia + "\n");
					break;
				}
				case 6:{
					System.out.println("Saliendo del programa...\n");
					break;
				}
				default:{
					System.out.println("ERROR: introduce una opcion disponble en el menú: ");
					break;
				}
			}
			//System.out.println("¿Qué operacion quieres hacer?");
			//opcion = scanner.nextInt();
		}while(opcion>0 && opcion<=5);
		scanner.close();
	}
}