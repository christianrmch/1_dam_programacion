package TareaCuatroPOO.Ejercicio7_3f;

import java.util.IllegalFormatCodePointException;

public class Articulo {
    private String nombre;
    private final double iva = 21;
    private double precio;
    private int cuantosQuedan;


    public Articulo(){}

    public Articulo(String nombre, double precio, int cuantosQuedan) {
        this.nombre = nombre;
        this.precio = precio;
        if(cuantosQuedan > 0){
            this.cuantosQuedan = cuantosQuedan;
        }
    }

    public String informacion() {
        return "El artículo " + this.nombre +
                " tiene un precio de " + this.precio +
                " €, con un iva del " + this.iva + " %" +
                " y del que quedan " + this.cuantosQuedan + " artículos";
    }

    public double getPVP() {
        return precio + (precio * (iva/100));
    }

    public void getPVPDescuento(int descuento) {
        System.out.println("Precio con descuento: " + (this.getPVP() - (this.getPVP() * descuento/100)));
    }

    public boolean vender(int x){
        if((this.cuantosQuedan - x) >= 0){
            this.cuantosQuedan -= x;
        }
        return (this.cuantosQuedan - x) >= 0;
    }

    public boolean almacenar(int x) {
        if((this.cuantosQuedan + x) <= 100){
            this.cuantosQuedan += x;
        }
        return (this.cuantosQuedan + x) <= 100;
    }
}
