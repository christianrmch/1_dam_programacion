package RelacionesPOO.Tareas8_3;
import java.util.Arrays;

public class Coche {
    private String matricula;
    private String direccionDuenyo;
    //Lo mejor sería usar un ArrayList<Reparacion> para que el tamaño de la lusta fuera dinámico
    //y cada coche tuviera reparaciones sin que queden huecos null en el array.

    private Reparacion[] reparaciones;

    public Coche(){}
    public Coche(String matricula, String direccionDuenyo, Reparacion[] reparaciones){
        this.matricula = matricula;
        this.direccionDuenyo = direccionDuenyo;
        this.reparaciones = new Reparacion[reparaciones.length];
        for(int i = 0; i < this.reparaciones.length; i++){
            if(this.reparaciones[i]==null){
                this.reparaciones[i] = new Reparacion(reparaciones[i].getDescripcion(), reparaciones[i].getKm());
            }
        }
    }

    public Reparacion[] getReparaciones() {
        return this.reparaciones;
    }

    public void setDireccionDuenyo(String direccionDuenyo) {
        this.direccionDuenyo = direccionDuenyo;
    }

    public String getDireccionDuenyo() {
        return this.direccionDuenyo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public Reparacion[] buscaReparaciones(String palabraClave){
        Reparacion[] reparacionesPorPalabraClave = new Reparacion[50];
        String[] split;
        for(int i = 0; i < this.reparaciones.length; i++){
            if(this.reparaciones[i] != null){
                split = this.reparaciones[i].getDescripcion().split(" ");
                for (int j = 0; j < split.length; j++) {
                    if (split[j].equalsIgnoreCase(palabraClave)) {
                        for (int k = 0; k < reparacionesPorPalabraClave.length; k++) {
                            if (reparacionesPorPalabraClave[k] == null) {
                                reparacionesPorPalabraClave[k] = this.reparaciones[i];
                                break;
                            }
                        }
                    }
                }
            } else break;
        }
        return reparacionesPorPalabraClave;
    }

    public void anyadeReparacion(Reparacion reparacion){
        if (reparacion.getKm() < this.ultimaReparacion().getKm()) {
            System.err.println("El kilometraje no puede ser menor al de la última reparación");
        } else {
            for(int i = 0; i < this.reparaciones.length; i++) {
                if (this.reparaciones[i] == null) {
                    this.reparaciones[i] = reparacion;
                    break;
                }
            }
        }
    }

    public Reparacion ultimaReparacion(){
        Reparacion ultimaReparacion = new Reparacion();
        for(int i = 0; i < this.reparaciones.length; i++){
            if(this.reparaciones[this.reparaciones.length -1] != null){
                ultimaReparacion = this.reparaciones[this.reparaciones.length -1];
                break;
            } else if(this.reparaciones[i]!=null && this.reparaciones[i+1]==null){
                ultimaReparacion = this.reparaciones[i];
                break;
            }
            /*
            if(this.reparaciones[i]!=null && this.reparaciones[i+1]==null){
                ultimaReparacion = this.reparaciones[i];
                break;
            } else if(this.reparaciones[this.reparaciones.length - 1]!=null){
                ultimaReparacion = this.reparaciones[i];
                break;
            }*/
        }
        return ultimaReparacion;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", direccionDuenyo='" + direccionDuenyo + '\'' +
                ", reparaciones=" + Arrays.toString(reparaciones) +
                '}';
    }
}
