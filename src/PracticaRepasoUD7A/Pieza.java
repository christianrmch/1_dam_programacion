package PracticaRepasoUD7A;

public class Pieza{
    public int System;
    private String nombre;
    private Dimension dim;

    public Pieza(String nombre, Dimension dim) {
        this.nombre = nombre;
        this.dim = dim;
    }
    public Pieza(){
        this.nombre = "";
        this.dim = new Dimension(0, 0,0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dimension getDim() {
        return dim;
    }

    public void setDim(Dimension dim) {
        this.dim = dim;
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "nombre='" + nombre + '\'' +
                ", dim=" + dim +
                "}";
    }
}
