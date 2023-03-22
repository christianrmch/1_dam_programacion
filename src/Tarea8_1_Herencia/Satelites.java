package Tarea8_1_Herencia;

public class Satelites extends Astros{
    private String nombreSatelite;
    private double distanciaAlPlaneta;
    private double orbitaPlanetaria;
    private String planetaAlQuePertenece;
    protected Satelites(String nombreSatelite, double radioEcuatorial, double periodoRotacion, double masa,
                     double temperaturaMedia, double gravedad, double distanciaAlPlaneta,
                     double orbitaPlanetaria, String planetaAlQuePertenece) {
        super(radioEcuatorial, periodoRotacion, masa, temperaturaMedia, gravedad);
        this.nombreSatelite = nombreSatelite;
        if(distanciaAlPlaneta <= 0){
            System.err.println("No se puede introducir una distancia negativa");
        } else{
            this.distanciaAlPlaneta = distanciaAlPlaneta;
        }
        if(orbitaPlanetaria <= 0){
            System.err.println("No se puede introducir una masa que sea menor o igual a cero");
        } else{
            this.orbitaPlanetaria = orbitaPlanetaria;
        }
        this.planetaAlQuePertenece = planetaAlQuePertenece;
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

    public String getNombreSatelite() {
        return this.nombreSatelite;
    }

    public void setNombreSatelite(String nombreSatelite) {
        this.nombreSatelite = nombreSatelite;
    }

    public double getDistanciaAlPlaneta() {
        return this.distanciaAlPlaneta;
    }

    public void setDistanciaAlPlaneta(double distanciaAlPlaneta) {
        if(distanciaAlPlaneta <= 0){
            System.err.println("No se puede introducir una distancia negativa");
        } else{
            this.distanciaAlPlaneta = distanciaAlPlaneta;
        }
    }

    public double getOrbitaPlanetaria() {
        return this.orbitaPlanetaria;
    }

    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
        if(orbitaPlanetaria <= 0){
            System.err.println("No se puede introducir una masa que sea menor o igual a cero");
        } else{
            this.orbitaPlanetaria = orbitaPlanetaria;
        }
    }

    public String getPlanetaAlQuePertenece() {
        return this.planetaAlQuePertenece;
    }

    public void setPlanetaAlQuePertenece(String planetaAlQuePertenece) {
        this.planetaAlQuePertenece = planetaAlQuePertenece;
    }

    @Override
    public String toString() {
        return  "Satelites{" +
                "nombreSatelite='" + nombreSatelite + '\'' +
                super.toString().replace("Astros{", "").replace("}","") +
                ", distanciaAlPlaneta=" + distanciaAlPlaneta +
                ", orbitaPlanetaria=" + orbitaPlanetaria +
                ", planetaAlQuePertenece='" + planetaAlQuePertenece + '\'' +
                '}';
    }
}
