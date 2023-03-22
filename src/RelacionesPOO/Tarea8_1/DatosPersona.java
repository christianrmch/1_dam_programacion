package RelacionesPOO.Tarea8_1;

public class DatosPersona {
    private String nombre;
    private String tlf;

    public DatosPersona(String nombre, String tlf){
        this.nombre = nombre;
        this.tlf = tlf;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getTlf(){
        return this.tlf;
    }

    public void setTlf(String tlf){
        this.tlf = tlf;
    }

    @Override
    public String toString() {
        return "DatosPersona{" +
                "nombre='" + this.nombre + '\'' +
                ", tlf='" + this.tlf + '\'' +
                '}';
    }
}

