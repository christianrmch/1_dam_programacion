package Repaso_POO;

import java.util.Arrays;

public class CuentaBancaria {
    private final String IBANletters;
    private int[] IBANnumbers;
    private String name;
    private String lastName;
    private double money;

    public CuentaBancaria(String IBANletters, int[] IBANnumbers, String name, String lastName) {
        this.IBANnumbers = IBANnumbers;
        this.IBANletters = IBANletters;
        this.name = name;
        this.lastName = lastName;
        this.money = 0.0;
    }

    public String imprimirCuenta() {
        return "La cuenta: " + this.IBANletters + Arrays.toString(this.IBANnumbers).
                replace("[", "").
                replace("]", "").
                replace(",", "").
                replace(" ", "")
                + " que pertenece a: " + this.name + this.lastName.indent(1) +
                "Tiene un saldo de: " + this.money + "€";
    }

    public void ingreso(float cantidad){
        this.money += cantidad;
        if (cantidad > 3000){
            System.out.println("AVISO: Notificar a hacienda");
        }
    }

    public boolean retirada(float cantidad) {
        if ((this.money - cantidad) < 0 && (this.money - cantidad) >= -50) {
            this.money -= cantidad;
            System.out.println("AVISO: Saldo negativo");
        } else if (this.money - cantidad > 0) {
            this.money-= cantidad;
        }
        return this.money > -50;
    }
}