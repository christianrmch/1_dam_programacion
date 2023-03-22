package RelacionesPOO.Tarea8_2;

public class Disco {
    private String titulo;
    private String fecha;
    private Cancion[] cancionesDelDisco;

    public Disco(){}
    public Disco(String titulo, String fecha, Cancion[] cancionesDelDisco){
        this.fecha = fecha;
        this.titulo = titulo;
        this.cancionesDelDisco = new Cancion[cancionesDelDisco.length];
        for(int i = 0; i < this.cancionesDelDisco.length; i++){
            this.cancionesDelDisco[i] = new Cancion(cancionesDelDisco[i].getTitulo(), cancionesDelDisco[i].getDuracion());
        }
    }

    public Cancion[] getCancionesDelDisco() {
        return this.cancionesDelDisco;
    }

    public void setCancionesDelDisco(Cancion cancion) {
        this.cancionesDelDisco = new Cancion[this.cancionesDelDisco.length];
        for(int i = 0; i < this.cancionesDelDisco.length; i++){
            this.cancionesDelDisco[i] = new Cancion(cancion.getTitulo(), cancion.getDuracion());
        }    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Float obtenerDuracionTotal(Disco disco){
        float resultado = 0;
        for (int i = 0; i < disco.cancionesDelDisco.length; ++i){
            resultado += disco.cancionesDelDisco[i].getDuracion();
        }
        return resultado;
    }

    public Cancion obtenerCancion(int posicion){
        if (posicion < 0 || posicion > this.cancionesDelDisco.length){
            return null;
        }
        return this.cancionesDelDisco[posicion];
    }
}
