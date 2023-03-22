package Tarea_8_2_Herencia;

import java.util.Date;

public class Perro extends Animal{
    private String raza;
    private String color;

    public Perro(){}
    public Perro(String nombre, Date fechaNacimiento, Estado estado, String raza, String color) {
        super(nombre, fechaNacimiento, estado);
        this.raza = raza;
        this.color = color;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return this.color;
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
        return super.toString().replace("{", "{tipo='Perro', ").replace("}", "").
                concat(" raza='" + this.raza + "', color='"+ this.color + '\'' + '}');
    }
}
