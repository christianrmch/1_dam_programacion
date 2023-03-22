package Repaso_POO;

import java.util.Scanner;

public class DAMMZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria miCuenta = new CuentaBancaria("ES", new int[]{2, 3, 0, 4, 8, 7, 2, 4, 9, 5, 8, 0, 8, 5, 3, 7, 1, 4, 7, 1, 3, 4}, "Chrsitan Reinaldo", "Mamani Choque" );
        System.out.println("""
                Menú:
                1: Imprimir Cuenta.
                2: Ingresar dinero en la cuenta.
                3: Retirar dinero de la cuenta.
                4: Salir del menú.
                """);
        int number = scanner.nextInt();
        do {
                switch (number) {
                    case 1: {
                        System.out.println(miCuenta.imprimirCuenta());
                        break;
                    }
                    case 2: {
                        miCuenta.ingreso(scanner.nextInt());
                        break;
                    }
                    case 3: {
                        miCuenta.retirada(scanner.nextInt());
                        break;
                    }
                }
                number = scanner.nextInt();
            } while (number!=4);
        }
    }
