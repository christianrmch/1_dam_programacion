package ExamenPOO2EV;

import java.util.Arrays;

public class Academia {
    private String nombre;
    private String ubicacion;

    private Alumno[] alumnos = new Alumno[20];

    public Academia(){}

    public Academia(String nombre, String ubicacion, Alumno[] alumnos){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        if(alumnos.length > 20) {
            System.err.println("No se pueden introducir más alumnos que los permitidos por el sistema");
        } else {
            for (int i = 0; i < alumnos.length; i++){
                if(alumnos[i]!=null){
                    for(int j = 0; j < this.alumnos.length; j++){
                        this.alumnos[j] = alumnos[i];
                    }
                }
            }
        }
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Alumno[] getAlumnos() {
        return this.alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        if(alumnos.length > 20) {
            System.err.println("No se pueden introducir más alumnos que los permitidos por el sistema");
        } else {
            for (int i = 0; i < alumnos.length; i++){
                if(alumnos[i]!=null){
                    for(int j = 0; j < this.alumnos.length; j++){
                        this.alumnos[j] = alumnos[i];
                    }
                }
            }
        }
    }

    public boolean matriculaAlumno(Alumno alumno){
        boolean resultado = true;
        if(alumnosMatriculados()<20){
            for(int i =0; i < this.alumnos.length; i++){
                if(this.alumnos[i]==null){
                    this.alumnos[i]=alumno;
                    break;
                }
            }
        } else resultado = false;
        return resultado;
    }

    private int alumnosMatriculados() {
        int numeroAlumnos = 0;
        for (Alumno alumno: this.alumnos){
            if (alumno!=null) {
                numeroAlumnos++;
            }
        }
        return numeroAlumnos;
    }

    public void cambiaEstadoMatriculaAlumno(Alumno alumno){
        for(int i = 0; i < this.alumnos.length; i++){
            if(this.alumnos[i].getNombre().equalsIgnoreCase(alumno.getNombre())){
                this.alumnos[i].setEstadoMatricula(alumno.getEstadoMatricula());
                break;
            }
        }
    }

    public void listaTodosAlumnos(){
        System.out.println(Arrays.deepToString(this.alumnos));
    }


}
