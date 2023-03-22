package RelacionesPOO.Tareas8_3;


import java.util.Arrays;

public class Garaje {
    private final int capacidad = 100;
    private final Coche[] coches = new Coche[capacidad];
    private int ocupacion;

    public Garaje(){}

    public Coche[] getCoches() {
        return this.coches;
    }

    public void setOcupacion(int ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getOcupacion() {
        return ocupacion;
    }

    public void anyadeCoche(Coche coche) {
        if (noHayCochesRegistrado(coche.getMatricula())){
            for (int i = 0; i < this.coches.length; i++) {
                if (this.coches[i] == null) {
                    this.coches[i] = coche;
                    break;
                }
            }
        } else System.err.println("No puedes añadir un coche con la misma matrícula que otro coche ya registrado");
    }

    private boolean noHayCochesRegistrado(String matricula) {
        boolean resultado = true;
        for (int i = 0; i < this.coches.length; i++){
              if (this.coches[i] != null && this.coches[i].getMatricula().equalsIgnoreCase(matricula)){
                  resultado = false;
                  break;
              }
          }
          return resultado;
        }


    public Coche buscaCoche(String matricula) {
        Coche resultado = new Coche();
        for (Coche coche: coches){
            if  (coche !=null && coche.getMatricula().equalsIgnoreCase(matricula)) {
                resultado = coche;
                break;
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Garaje{" +
                "capacidad=" + capacidad +
                ", coches=" + Arrays.toString(coches) +
                ", ocupacion=" + ocupacion +
                '}';
    }
}
