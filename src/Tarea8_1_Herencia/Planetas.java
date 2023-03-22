package Tarea8_1_Herencia;

import java.util.Arrays;

public class Planetas extends Astros{
    private String nombre;
    private double distanciaAlSol;
    private double orbitaAlSol;
    private boolean tieneSatelites;
    private Satelites[] satelites;

    protected Planetas(
            String nombre, double radioEcuatorial,
            double periodoRotacion, double masa,
            double temperaturaMedia, double gravedad,
            double distanciaAlSol, double orbitaAlSol,
            boolean tieneSatelites, Satelites[] satelites
    ){
        super(radioEcuatorial, periodoRotacion, masa, temperaturaMedia, gravedad);

        this.nombre = nombre;

        if(distanciaAlSol <= 0){
            System.err.println("No se puede introducir una distancia negativa");
        } else{
            this.distanciaAlSol = distanciaAlSol;
        }
        if(orbitaAlSol <= 0){
            System.err.println("No se puede introducir una masa que sea menor o igual a cero");
        } else{
            this.orbitaAlSol = orbitaAlSol;
        }
        this.tieneSatelites = tieneSatelites;

        this.satelites = new Satelites[satelites.length];
        for(int i = 0; i < this.satelites.length; i++){
            if(this.satelites[i]==null && satelites[i]!=null){
                this.satelites[i] = satelites[i];
            }
        }
    }

    @Override
    public void setRadioEcuatorial(double radioEcuatorial) {
        super.setRadioEcuatorial(radioEcuatorial);
    }

    @Override
    public double getRadioEcuatorial() {
        return super.getRadioEcuatorial();
    }

    @Override
    public void setPeriodoRotacion(double periodoRotacion) {
        super.setPeriodoRotacion(periodoRotacion);
    }

    @Override
    public double getPeriodoRotacion() {
        return super.getPeriodoRotacion();
    }

    @Override
    public void setMasa(double masa) {
        super.setMasa(masa);
    }

    @Override
    public double getMasa() {
        return super.getMasa();
    }

    @Override
    public double getTemperaturaMedia() {
        return super.getTemperaturaMedia();
    }

    @Override
    public void setTemperaturaMedia(double temperaturaMedia) {
        super.setTemperaturaMedia(temperaturaMedia);
    }

    @Override
    public double getGravedad() {
        return super.getGravedad();
    }

    @Override
    public void setGravedad(double gravedad) {
        super.setGravedad(gravedad);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDistanciaAlSol() {
        return this.distanciaAlSol;
    }

    public void setDistanciaAlSol(double distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    public double getOrbitaAlSol() {
        return orbitaAlSol;
    }

    public void setOrbitaAlSol(double orbitaAlSol) {
        this.orbitaAlSol = orbitaAlSol;
    }

    public boolean getTieneSatelites() {
        return this.tieneSatelites;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }

    public Satelites[] getSatelites() {
        return this.satelites;
    }

    public void setSatelites(Satelites[] satelites) {
        this.satelites = new Satelites[satelites.length];
        for(int i = 0; i < this.satelites.length; i++){
            if(this.satelites[i]==null && satelites[i]!=null){
                this.satelites[i] = satelites[i];
            }
        }
    }

    public void anyadirSatelite(Satelites satelite){
        //Copia los satelites que ya tiene el planeta
        Satelites[] copiarSatelites = new Satelites[this.satelites.length];
        for(int i = 0; i < copiarSatelites.length; i++){
            if(copiarSatelites[i]==null && this.satelites[i]!=null){
                copiarSatelites[i] = this.satelites[i];
            }
        }
        //Crea un nuevo array de satelites añadiendole una posicion extra al array
        this.satelites = new Satelites[copiarSatelites.length + 1];

        //Vuelve a copiar los satelites de antes
        for(int i = 0; i < this.satelites.length - 1; i++) {
           if (this.satelites[i]==null && copiarSatelites[i]!=null){
               this.satelites[i]=copiarSatelites[i];
           }
        }

        //Añade el satelite nuevo que se le pasa por la función
        this.satelites[this.satelites.length -1] = satelite;
    }

    @Override
    public String toString() {
        return  "Planetas{" +
                "nombre='" + nombre + '\'' +
                super.toString().replace("Astros{", "").replace("}","") +
                ", distanciaAlSol=" + distanciaAlSol +
                ", orbitaAlSol=" + orbitaAlSol +
                ", tieneSatelites=" + tieneSatelites +
                ", satelites=" + Arrays.toString(satelites) +
                '}';
    }
}
