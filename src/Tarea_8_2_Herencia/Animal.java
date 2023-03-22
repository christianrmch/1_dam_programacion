package Tarea_8_2_Herencia;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
    private String nombre;
    private Date fechaNacimiento;
    protected enum Estado {SANO, ENFERMO}
    private Estado estado;

    public Animal() {}

    public Animal(String nombre, Date fechaNacimiento, Estado estado) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", estado=" + estado +
                '}';
    }
}
