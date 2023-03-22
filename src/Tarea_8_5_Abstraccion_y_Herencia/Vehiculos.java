package Tarea_8_5_Abstraccion_y_Herencia;

import java.util.ArrayList;

public abstract class Vehiculos {
    private String matricula_letras;
    private int matricula_numeros;
    private final String modelo;

    public Vehiculos(String matricula_letras, int matricula_numeros, String modelo) {
        if(maxLetrasMatricula(matricula_letras)){
            this.matricula_letras = matricula_letras;
        }
        if(maxNumerosMatricula(matricula_numeros)){
            this.matricula_numeros = matricula_numeros;
        }
        this.modelo = modelo;
    }

    public abstract boolean maxNumerosMatricula(int n_matricula);

    public abstract boolean maxLetrasMatricula(String l_matricula);

    @Override
    public String toString() {
        return "Vehiculos{" +
                "matricula_letras='" + matricula_letras + '\'' +
                ", matricula_numeros=" + matricula_numeros +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
