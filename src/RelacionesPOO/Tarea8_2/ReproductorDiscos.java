package RelacionesPOO.Tarea8_2;

public class ReproductorDiscos {
    private boolean estado;
    private Cancion cancionActual;
    private int numeroCancion;
    private Disco disco;

    public ReproductorDiscos(){}
    public ReproductorDiscos(Disco disco){
        this.disco = disco;
    }
}
