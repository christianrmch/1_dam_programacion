package Tarea_8_5_Abstraccion_y_Herencia;

public class Avion extends Vehiculo_Aereo{
    private double tiempoMaximoVuelo;

    public Avion(String matricula_letras, int matricula_numeros, String modelo, int numeroAsientos, double tiempoMaximoVuelo) {
        super(matricula_letras, matricula_numeros, modelo, numeroAsientos);
        this.tiempoMaximoVuelo = tiempoMaximoVuelo;
    }

    public double getTiempoMaximoVuelo() {
        return tiempoMaximoVuelo;
    }

    public void setTiempoMaximoVuelo(double tiempoMaximoVuelo) {
        this.tiempoMaximoVuelo = tiempoMaximoVuelo;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Avion{" +
                "tiempoMaximoVuelo=" + tiempoMaximoVuelo +
                '}';
    }
}
