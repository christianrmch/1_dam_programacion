package Tarea_8_5_Abstraccion_y_Herencia;

public class Coche extends Vehiculo_Terrestre{
    private boolean aireAcondicionado;
    public Coche(String matricula_letras, int matricula_numeros, String modelo, int numeroRuedas, boolean aireAcondicionado) {
        super(matricula_letras, matricula_numeros, modelo, numeroRuedas);
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isAireAcondicionado() {
        return this.aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Coche{" +
                "aireAcondicionado=" + aireAcondicionado +
                '}';
    }
}
