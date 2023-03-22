import java.util.Scanner;
public class Utils {
    static Scanner sc;
    public static int intLimiterValidator( int min, int max) {
        sc = new Scanner(System.in);
        int num;
        do {
            while (!sc.hasNextInt()) {
                System.out.print("Entrada incorrecta, intentalo de nuevo: ");
                sc.next();
            }
            num = sc.nextInt();
            if (num > max && num < min) {
                System.out.print("El numero debe estar entre " + min + " y " + max + ". ");
            }
        } while (num > max && num < min);
        return num;
    }
    public static double doubleValidator () {
        sc = new Scanner(System.in);
        while (!sc.hasNextDouble()) {
            System.out.print("Entrada incorrecta, intentalo de nuevo: ");
            sc.next();
        }
        return sc.nextDouble();
    }
    public static int intValidator () {
        sc = new Scanner(System.in);
        while (!sc.hasNextDouble()) {
            System.out.print("Entrada incorrecta, intentalo de nuevo: ");
            sc.next();
        }
        return sc.nextInt();
    }
}
