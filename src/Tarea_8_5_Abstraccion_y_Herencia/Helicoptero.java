package Tarea_8_5_Abstraccion_y_Herencia;

public class Helicoptero extends Vehiculo_Aereo {
    private int numeroHelices;

    public Helicoptero(String matricula_letras, int matricula_numeros, String modelo, int numeroAsientos, int numeroHelices) {
        super(matricula_letras, matricula_numeros, modelo, numeroAsientos);
        if (numeroHelices<0){
            System.err.println("No se puede introducir un numero de helices negativo");
        } else {
            this.numeroHelices = numeroHelices;
        }
    }

    public int getNumeroHelices() {
        return this.numeroHelices;
    }

    public void setNumeroHelices(int numeroHelices) {
        if (numeroHelices<0){
            System.err.println("No se puede introducir un numero de helices negativo");
        } else {
            this.numeroHelices = numeroHelices;
        }
    }

    @Override
    public String toString() {
        return super.toString()+
                "Helicoptero{" +
                "numeroHelices=" + numeroHelices +
                '}';
    }
}
