package Tarea_8_5_Abstraccion_y_Herencia;

public class Vehiculo_acuatico extends Vehiculos {
    private final double slora;
    public Vehiculo_acuatico(String matricula_letras, int matricula_numeros, String modelo, double slora) {
        super(matricula_letras, matricula_numeros, modelo);
        this.slora = slora;
    }

    @Override
    public boolean maxNumerosMatricula(int n_matricula) {
        return false;
    }

    @Override
    public boolean maxLetrasMatricula(String l_matricula) {
        boolean resultado = true;
        if (l_matricula.length() < 3 || l_matricula.length() > 10) {
            resultado = false;
            System.err.println("Las matriculas de los vehículos terrestres deben tener entre 3 y 10 letras");
        }
        return resultado;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Vehiculo_acuatico{" +
                "slora=" + slora +
                '}';
    }
}
