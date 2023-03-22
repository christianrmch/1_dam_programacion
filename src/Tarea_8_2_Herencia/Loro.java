package Tarea_8_2_Herencia;

import java.util.Date;

public class Loro extends Animal{
    private Double longitudPico;
    private String origen;
    public Loro(){}
    public Loro(String nombre, Date fechaNacimiento, Estado estado, Double longitudPico, String origen) {
        super(nombre, fechaNacimiento, estado);
        if(longitudPico > 33){
            System.err.println("No se puede introducir un pico mayor de 33 centimetros");
            this.longitudPico = (double) 0;
        } else this.longitudPico = longitudPico;
        this.origen = origen;
    }
    public Double getLongitudPico() {
        return this.longitudPico;
    }

    public void setLongitudPico(Double longitudPico) {
        if(longitudPico > 33){
            System.err.println("No se puede introducir un pico mayor de 33 centimetros");
            this.longitudPico = (double) 0;
        } else this.longitudPico = longitudPico;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public Date getFechaNacimiento() {
        return super.getFechaNacimiento();
    }

    @Override
    public void setFechaNacimiento(Date fechaNacimiento) {
        super.setFechaNacimiento(fechaNacimiento);
    }

    @Override
    public Estado getEstado() {
        return super.getEstado();
    }

    @Override
    public void setEstado(Estado estado) {
        super.setEstado(estado);
    }

    @Override
    public String toString() {
        return super.toString().replace("{", "{tipo='Loro', ").replace("}", "").
                concat(" longitudPico=" + this.longitudPico + ", origen='"+ this.origen + '\'' + '}');
    }
}
