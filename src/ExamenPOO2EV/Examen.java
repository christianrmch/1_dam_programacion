package ExamenPOO2EV;

public class Examen {
    private int identificador;
    float nota;

    public Examen(){}

    public Examen(int identificador, float nota){
        this.identificador = identificador;
        if(nota >= 0 && nota <= 10){
            this.nota = nota;
        } else System.err.println("Nota invalida");
    }

    public float getNota() {
        return this.nota;
    }
    public int getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setNota(float nota) {
        if(nota >= 0 && nota <= 10){
            this.nota = nota;
        } else System.err.println("Nota invalida");
    }

    @Override
    public String toString() {
        return "Examen{" +
                "identificador=" + identificador +
                ", nota=" + nota +
                '}';
    }
}
