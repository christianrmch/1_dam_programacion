package Tarea_8_5_Abstraccion_y_Herencia;

public class Moto extends Vehiculo_Terrestre{
    private String color;
    public Moto(String matricula_letras, int matricula_numeros, String modelo, int numeroRuedas, String color) {
        super(matricula_letras, matricula_numeros, modelo, numeroRuedas);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Moto{" +
                "color='" + color + '\'' +
                '}';
    }
}
