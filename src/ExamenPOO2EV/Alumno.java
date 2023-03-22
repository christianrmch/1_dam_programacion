package ExamenPOO2EV;

import java.util.Arrays;

public class Alumno {
    private String dni;
    private String nombre;
    private int nivel;
    private int estadoMatricula;

    private Examen[] examenes;

    public Alumno(){}

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 1 && nivel <= 6){
            this.nivel = nivel;
        } else System.err.println("Nivel introducido inválido");
    }

    public int getEstadoMatricula() {
        return this.estadoMatricula;
    }

    public void setEstadoMatricula(int estadoMatricula) {
        this.estadoMatricula = estadoMatricula;
    }

    public void setExamenes(Examen[] examenes) {
        this.examenes = new Examen[examenes.length];
        for(int i = 0; i < examenes.length; i++){
            if(examenes[i]!=null){
                for(int j = 0; j < this.examenes.length; j++){
                    if (this.examenes[j]==null){
                        this.examenes[j] = examenes[i];
                    }
                }
            }
        }
    }

    public Examen[] getExamenes() {
        return this.examenes;
    }

    public Alumno(String dni, String nombre, int nivel, int estadoMatricula, Examen[] examenes){
        this.dni = dni;
        this.nombre = nombre;
        if (nivel >= 1 && nivel <= 6){
            this.nivel = nivel;
        } else System.err.println("Nivel introducido inválido");
        this.estadoMatricula = estadoMatricula;
        this.examenes = new Examen[examenes.length];
        for(int i = 0; i < examenes.length; i++){
            if(examenes[i]!=null){
                for(int j = 0; j < this.examenes.length; j++){
                    if (this.examenes[j]==null){
                        this.examenes[j] = examenes[i];
                        break;
                    }
                }
            }
        }
    }
    public boolean registrarExamen(Examen examen){
        boolean registro = false;
        for(int i = 0; i < this.examenes.length; i++){
            if(this.examenes[i]==null){
                this.examenes[i] = examen;
                registro = true;
                break;
            }
        }
        return registro;
    }

    public float calcuarNotaMediaExamen(){
        float sumaNotas = 0;
        for(int i = 0; i < this.examenes.length; i++){
            if(this.examenes[i]!=null){
                sumaNotas += this.examenes[i].getNota();
            }
        }
        return  sumaNotas / this.examenes.length;
    }

    public float calcularNotaMaximaExamen(){
        float notaMaxima = 0;
        for(int i = 0; i < this.examenes.length; i++){
            if(this.examenes[i]!=null && this.examenes[i].getNota() > notaMaxima){
                notaMaxima = this.examenes[i].getNota();
            }
        }
        return notaMaxima;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", estadoMatricula=" + estadoMatricula +
                ", examenes=" + Arrays.toString(examenes) +
                '}';
    }
}
