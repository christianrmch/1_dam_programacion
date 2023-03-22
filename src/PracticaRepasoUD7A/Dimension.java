package PracticaRepasoUD7A;

public class Dimension {
    private int largo;
    private int ancho;
    private int alto;

    public Dimension(int largo, int ancho, int alto) {
        if(largo < 0){
            this.largo = 0;
            System.err.println("No se pueden introducir valores negativos");
        } else {
            this.largo = largo;
        }
        if(ancho < 0){
            this.ancho = 0;
            System.err.println("No se pueden introducir valores negativos");
        } else {
            this.ancho = ancho;
        }
        if(alto < 0){
            this.alto = 0;
            System.err.println("No se pueden introducir valores negativos");
        } else {
            this.alto = alto;
        }
    }

    public Dimension() {
        this.largo = 0;
        this.ancho = 0;
        this.alto = 0;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        if(largo < 0){
            this.largo = 0;
            System.err.println("No se pueden introducir valores negativos");
        } else {
            this.largo = largo;
        }
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if(ancho < 0){
            this.ancho = 0;
            System.err.println("No se pueden introducir valores negativos");
        } else {
            this.ancho = ancho;
        }
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        if(alto < 0){
            this.alto = 0;
            System.err.println("No se pueden introducir valores negativos");
        } else {
            this.alto = alto;
        }
    }

    public Double volumen(){
        return (double) this.alto * this.ancho * this.largo;
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}
