package Tarea_8_5_Abstraccion_y_Herencia;

import java.util.ArrayList;

public class Vehiculo_Aereo extends Vehiculos{
    private final int numeroAsientos;
    private static final ArrayList<Integer> contadorNumeros = new ArrayList<>();
    public Vehiculo_Aereo(String matricula_letras, int matricula_numeros, String modelo, int numeroAsientos) {
        super(matricula_letras, matricula_numeros, modelo);
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Vehiculo_Aereo{" +
                "numeroAsientos=" + numeroAsientos +
                '}';
    }

    @Override
    public boolean maxNumerosMatricula(int n_matricula) {
        boolean resultado = true;
        if(contadorNumeros(n_matricula)!=6){
            resultado = false;
            System.err.println("Las matriculas de los vehículos aéreos deben tener 6 números");
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
        if (l_matricula.length() != 4) {
            resultado = false;
            System.err.println("Las matriculas de los vehículos aéreos deben tener 4 letras");
        }
        return resultado;
    }
}
