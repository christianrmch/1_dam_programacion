package Tarea1EjerciciosPOO;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    //constructor vacío
    public Persona(){}

    // Constructor
    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String primer, String segundo) {
        this.apellidos = primer + " " + segundo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int numeros, char letra) {
        this.dni = String.valueOf(numeros) + letra;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public int getEdad(){
        return this.edad;
    }

    public String getDni(){
        return this.dni;
    }

    public boolean esMayorDeEdad(int edad){
        return edad >= 18;
    }
}
