package Tarea_8_5_Abstraccion_y_Herencia;

public class Submarino extends Vehiculo_acuatico{
    private int profundidadMaxima;

    public Submarino(String matricula_letras, int matricula_numeros, String modelo, double slora, int profundidadMaxima) {
        super(matricula_letras, matricula_numeros, modelo, slora);
        this.profundidadMaxima = profundidadMaxima;
    }

    public int getProfundidadMaxima() {
        return profundidadMaxima;
    }

    public void setProfundidadMaxima(int profundidadMaxima) {
        this.profundidadMaxima = profundidadMaxima;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Submarino{" +
                "profundidadMaxima=" + profundidadMaxima +
                '}';
    }
}
