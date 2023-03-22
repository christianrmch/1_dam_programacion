package Practica1EstructurasAlternativas;
import java.util.Scanner;

/**
 * Escribe un programa que calcula el salario neto semanal de un trabajador (al que
 * pediremos nombre, horas trabajadas y su tarifa por hora) en función del número
 * de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
 * • Las primeras 35 horas se pagan a tarifa normal.
 * • Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
 * • Las tasas de impuestos son:
 * o Los primeros 500 euros son libres de impuestos.
 * o Los siguientes 400 tienen un 25% de impuestos.
 * o Los restantes un 45% de impuestos.
 * Escribir nombre, salario bruto, tasas y salario neto.
 * */
public class PEAAC11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        double salarioBrutoTarifaNormal, horasTrabajadas, tarifaPorHora, salarioNeto,
                tarifaMaxima500, primerTramoImpuestos, netoDespuesImpuestoPrimero,
                segundoTramoImpuestos, netoDespuesImpuestoSegundo;
        System.out.println("Por favor, introduzca su nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Por favor, introduzca el número de horas que trabaja: ");
        horasTrabajadas = scanner.nextInt();
        System.out.println("Por favor, introduzca su tarifa por hora: ");
        tarifaPorHora = scanner.nextDouble();
        tarifaMaxima500 = 500/35;

        //CALCULO SALARIO BRUTO//
        salarioBrutoTarifaNormal = horasTrabajadas * tarifaPorHora;
        if(horasTrabajadas >= 0 && horasTrabajadas <= 35){

            //Sin impuestos salario solo hasta 500.
            if (tarifaPorHora > 0 && tarifaPorHora <= tarifaMaxima500){
                salarioNeto = salarioBrutoTarifaNormal;
                System.out.println("el salario bruto, " + salarioBrutoTarifaNormal + "€, de " + nombre + " después de impuestos es de " + salarioNeto +"€");
            }

            //Con Impuestos
            else if(tarifaPorHora > tarifaMaxima500){
                if (salarioBrutoTarifaNormal >= 500 && salarioBrutoTarifaNormal <= 900){
                    primerTramoImpuestos = (salarioBrutoTarifaNormal - 500) * 0.25;
                    netoDespuesImpuestoPrimero = salarioBrutoTarifaNormal - 500 - primerTramoImpuestos;
                    salarioNeto = netoDespuesImpuestoPrimero  + 500;
                    System.out.println("el salario bruto, " + salarioBrutoTarifaNormal + "€, de " + nombre + " después de impuestos es de " + salarioNeto +"€");
                }else if(salarioBrutoTarifaNormal > 900){
                    primerTramoImpuestos = 400 * 0.25;
                    netoDespuesImpuestoPrimero = salarioBrutoTarifaNormal - 500 - primerTramoImpuestos;
                    segundoTramoImpuestos = netoDespuesImpuestoPrimero * 0.45;
                    netoDespuesImpuestoSegundo = netoDespuesImpuestoPrimero - segundoTramoImpuestos;
                    salarioNeto = netoDespuesImpuestoSegundo + 500;
                    System.out.println("el salario bruto, " + salarioBrutoTarifaNormal + "€, de " + nombre + " después de impuestos es de " + salarioNeto +"€");
                }
            }
        }
    }
}
