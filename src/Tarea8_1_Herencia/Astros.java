package Tarea8_1_Herencia;

public abstract class Astros {
    private double radioEcuatorial;
    private double periodoRotacion;
    private double masa;
    private double temperaturaMedia;
    private double gravedad;

    protected Astros(double radioEcuatorial, double periodoRotacion, double masa, double temperaturaMedia, double gravedad) {
        if(radioEcuatorial <= 0 ){
            System.err.println("No se puede introducir un radio menor o igual a cero");
        } else{
            this.radioEcuatorial = radioEcuatorial;
        }
        if(periodoRotacion <= 0){
            System.err.println("No se puede introducir periodo de rotación que sea menor o igual a cero");
        } else {
            this.periodoRotacion = periodoRotacion;
        }
        if (masa <= 0 ){
            System.err.println("No se puede introducir una masa que sea menor o igual a cero");
        } else {
            this.masa = masa;
        }
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }

    public void setRadioEcuatorial(double radioEcuatorial) {
        if (radioEcuatorial <= 0){
            System.err.println("No se puede introducir un radio ecuatorial que sea menor o igual a cero");
        } else {
            this.radioEcuatorial = radioEcuatorial;
        }
    }

    public double getRadioEcuatorial() {
        return this.radioEcuatorial;
    }

    public void setPeriodoRotacion(double periodoRotacion) {
        if (periodoRotacion <= 0){
            System.err.println("No se puede introducir un periodo de rotación que sea menor o igual a cero");
        } else {
            this.periodoRotacion = periodoRotacion;
        }
    }

    public double getPeriodoRotacion() {
        return this.periodoRotacion;
    }

    public void setMasa(double masa) {
        if (masa <= 0){
            System.err.println("No se puede introducir una masa que sea menor o igual a cero");
        } else {
            this.masa = masa;
        }
    }

    public double getMasa() {
        return this.masa;
    }

    public double getTemperaturaMedia() {
        return this.temperaturaMedia;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public double getGravedad() {
        return this.gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    public String toString() {
        return "Astros{" +
                "radioEcuatorial=" + radioEcuatorial +
                ", periodoRotacion=" + periodoRotacion +
                ", masa=" + masa +
                ", temperaturaMedia=" + temperaturaMedia +
                ", gravedad=" + gravedad +
                '}';
    }
}
