package Tarea_8_2_Herencia;

import java.util.Date;

public class Gato extends Animal {
    protected enum Pelo {LARGO, CORTO, SEMILARGO, RIZADO, SIN_PELO}
    protected Pelo pelo;
    private String color;
    public Gato(){}
    public Gato(String nombre, Date fechaNacimiento, Estado estado, Pelo pelo, String color) {
        super(nombre, fechaNacimiento, estado);
        this.pelo = pelo;
        this.color = color;
    }

    public Pelo getPelo() {
        return pelo;
    }

    public void setPelo(Pelo pelo) {
        this.pelo = pelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return super.toString().replace("{", "{tipo='Gato', ").replace("}", "").
                concat(" pelo=" + this.pelo + ", color='"+ this.color + '\'' + '}');
    }
}
