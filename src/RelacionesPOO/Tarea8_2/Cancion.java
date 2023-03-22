package RelacionesPOO.Tarea8_2;

public class Cancion {
    private String titulo;
    private double duracion;

    public Cancion() {}
    public Cancion(String titulo, double duracion){
        this.duracion = duracion;
        this.titulo = titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getDuracion() {
        return this.duracion;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + this.titulo + '\'' +
                ", duracion=" + this.duracion +
                '}';
    }
}
