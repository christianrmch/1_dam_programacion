package EjemplosExcepciones;

public class InvalidEdadException extends Exception{
    private String mensaje;

    InvalidEdadException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "InvalidEdadException{" +
                "mensaje='" + this.mensaje + '\'' +
                '}';
    }
}
