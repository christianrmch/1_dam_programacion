package TareaCuatroPOO.Ejercicio7_1f;

public class Punto {
    private int puntoX;
    private int puntoY;

    public Punto() {}

    public Punto(int x, int y) {
        this.puntoX = x;
        this.puntoY = y;
    }

    public void imprime() {
        System.out.println("("+this.puntoX+", "+this.puntoY+")");
    }

    public void setXY(int x, int y){
        this.puntoX = x;
        this.puntoY = y;
    }

    public void desplaza(int dx, int dy) {
        this.puntoX += dx;
        this.puntoY += dy;
    }

    public int distancia (Punto p){
        return (int) Math.sqrt(Math.pow((p.puntoX - this.puntoX), 2) + Math.pow((p.puntoY - this.puntoY), 2));
    }
}
