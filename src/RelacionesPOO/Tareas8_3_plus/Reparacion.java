package RelacionesPOO.Tareas8_3_plus;

public class Reparacion {
    private String descripcion;
    private int km;

    public Reparacion(){}

    public Reparacion(String descripcion, int km){
        this.descripcion = descripcion;
        this.km = km;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getKm() {
        return this.km;
    }

    @Override
    public String toString() {
        return "Reparacion{" +
                "descripcion='" + descripcion + '\'' +
                ", km=" + km +
                '}';
    }
}
