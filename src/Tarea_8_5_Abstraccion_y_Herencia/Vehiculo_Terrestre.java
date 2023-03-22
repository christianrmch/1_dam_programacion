package Tarea_8_5_Abstraccion_y_Herencia;

import java.util.ArrayList;

public class Vehiculo_Terrestre extends Vehiculos {
    private final int numeroRuedas;
    private static final ArrayList<Integer> contadorNumeros = new ArrayList<>();
    public Vehiculo_Terrestre(String matricula_letras, int matricula_numeros, String modelo, int numeroRuedas) {
        super(matricula_letras, matricula_numeros, modelo);
        this.numeroRuedas = numeroRuedas;
    }
    @Override
    public boolean maxNumerosMatricula(int n_matricula) {
        boolean resultado = true;
        if(contadorNumeros(n_matricula) != 4){
            System.err.println("Las matriculas de los vehículos terrestres deben tener 4 números");
            resultado = false;
        }
        return resultado;
    }

    private int contadorNumeros(int n_matricula){
        if(n_matricula / 10 > 0){
            contadorNumeros.add(n_matricula % 10);
            contadorNumeros(n_matricula/10);
        } else {
            contadorNumeros.add(n_matricula);
        }
        return contadorNumeros.size();
    }

    @Override
    public boolean maxLetrasMatricula(String l_matricula) {
        boolean resultado = true;
        if (l_matricula.length() != 3) {
            resultado = false;
            System.err.println("Las matriculas de los vehículos terrestres deben tener 3 letras");
        }
        return resultado;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Vehiculo_Terrestre{" +
                "numeroRuedas=" + numeroRuedas +
                '}';
    }
}
