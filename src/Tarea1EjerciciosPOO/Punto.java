package Tarea1EjerciciosPOO;

/*
Crea un programa con una clase llamada Punto (punto.java) que representará un punto de dos
dimensiones en un plano. Solo contendrá dos atributos enteros llamadas x e y (coordenadas).
Además realiza una clase principal (ejercicio71.java)
• En el main de la clase principal instancia 3 objetos Punto con las coordenadas (5,0), (10,10)
y (-3, 7).
• Muestra por pantalla sus coordenadas (utiliza un println para cada punto).
• Modifica todas las coordenadas (prueba distintos operadores como = + - += *=...) y
vuelve a imprimirlas por pantalla
◦ Por ejemplo (El primer punto cambia sumando 3 a cada coordenada, el segundo
punto cambia restando 2 al doble del valor de la coordenada ..etc)
◦ Indica con comentarios como cambia el valor de las coordenadas.
 */

public class Punto {
    private int x;
    private int y;

    //Constructor vacío
    public Punto(){}

    //Constructor al que se le pasan parámetros
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Métodos
    public void setPunto(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public String getCordenadas(){
        return "(" + this.x + "," + this.y + ")";
    }

    public void sumarX(int x){this.x += x;}
    public void sumarY(int y){
        this.y += y;
    }

    public void restaX(int x){
        this.x -= x;
    }
    public void restaY(int y){
        this.y -= y;
    }

    public void multiplicaX(int x){
        this.x *= x;
    }
    public void multiplicaY(int y){
        this.y *= y;
    }

    public String restarPuntos(Punto punto){
        int x = punto.x - this.x;
        int y = punto.y - this.y;
        Punto resultadoResta = new Punto(x, y);
        return resultadoResta.getCordenadas();
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void dividirX(int x){
        this.x /= x;
    }
    public void dividirY(int y){
        this.y /= y;
    }
}
