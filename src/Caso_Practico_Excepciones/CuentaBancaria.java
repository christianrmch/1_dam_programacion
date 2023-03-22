package Caso_Practico_Excepciones;

import java.util.ArrayList;

public class CuentaBancaria {
    private String IBAN;
    private String NOMBRE;
    private String APELLIDOS;
    private Double saldo;
    private Character simboloSaldo;
    private ArrayList<Movimientos> movimientos;

    public CuentaBancaria(String iban, String nombre, String apellidos){
        if (iban.length()==24){
                this.IBAN = iban;
        } else // EXCEPCION
        if (nombre.matches("[A-Z a-z]")){
            this.NOMBRE = nombre;
        }
        if (apellidos.matches("[A-Z a-z]")){
            this.APELLIDOS = apellidos;
        }
        this.saldo = 0.0;
        this.simboloSaldo = '€';
        this.movimientos = new ArrayList<>(100);
    }
}
