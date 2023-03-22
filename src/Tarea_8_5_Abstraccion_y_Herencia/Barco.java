package Tarea_8_5_Abstraccion_y_Herencia;

public class Barco extends Vehiculo_acuatico{
    private boolean tieneMotor;

    public Barco(String matricula_letras, int matricula_numeros, String modelo, double slora, boolean tieneMotor) {
        super(matricula_letras, matricula_numeros, modelo, slora);
        this.tieneMotor = tieneMotor;
    }

    public boolean isTieneMotor() {
        return this.tieneMotor;
    }

    public void setTieneMotor(boolean tieneMotor) {
        this.tieneMotor = tieneMotor;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Barcos{" +
                "tieneMotor=" + tieneMotor +
                '}';
    }
}
