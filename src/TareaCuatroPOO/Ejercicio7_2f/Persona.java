package TareaCuatroPOO.Ejercicio7_2f;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private int dni;

    public Persona() {}

    public Persona(String nombre, String apellidos, int edad, int dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }

    public void inmprime() {
        System.out.println("--Información--");
        System.out.println("-" + this.nombre + "-");
        System.out.println("-" + this.apellidos + "-");
        System.out.println("-" + this.edad + "-");
        System.out.println("-" + this.dni + "-");
    }

    public boolean esMayorEdad() {
        return this.edad >= 18;
    }

    public boolean esJubilado() {
        return this.edad >= 65;
    }

    public int diferenciaEdad(Persona p) {
        return Math.abs(p.edad - this.edad);
    }

}
