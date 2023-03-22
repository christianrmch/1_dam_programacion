package RelacionesPOO.Tareas8_3_plus;
import java.util.*;


public class Coche {
    private String matricula;
    private String direccionDuenyo;
    private ArrayList<Reparacion> reparaciones = new ArrayList<>(1);

    public Coche(){}
    public Coche(String matricula, String direccionDuenyo){
        this.matricula = matricula;
        this.direccionDuenyo = direccionDuenyo;
    }

    public ArrayList<Reparacion> buscaReparaciones(String palabraClave){
        ArrayList<Reparacion> reparacionesPorPalabraClave = new ArrayList<>();
        List<String> descripcionPorPalabra;
        for(int i = 0; i < this.reparaciones.size(); i++){
                descripcionPorPalabra = Arrays.stream(this.reparaciones.get(i).getDescripcion().split(" ")).toList();
                for (int j = 0; j < descripcionPorPalabra.size(); j++){
                    if(descripcionPorPalabra.get(j).equalsIgnoreCase(palabraClave)){
                        reparacionesPorPalabraClave.add(this.reparaciones.get(i));
                        break;
                    }
                }
        }
        return reparacionesPorPalabraClave;
    }
    public void anyadeReparacion(Reparacion reparacion){
        if (this.reparaciones.get(1)==null){
            this.reparaciones.set(1, reparacion);
        } else if (reparacion.getKm() < this.ultimaReparacion().getKm()){
            System.err.println("El kilometraje no puede ser menor al de la última reparación");
        } else {
            for(int i = 0; i < this.reparaciones.size(); i++){
                if (this.reparaciones.get(i)== null){
                    this.reparaciones.set(i, reparacion);
                    break;
                }
            }
        }
    }
    public Reparacion ultimaReparacion(){
        return this.reparaciones.get((this.reparaciones.size()));
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", direccionDuenyo='" + direccionDuenyo + '\'' +
                ", reparaciones=" + reparaciones +
                '}';
    }
}
