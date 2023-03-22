package EjemplosExcepciones;

public class InvalidFechaException extends Exception{
    private String mensaje;

    InvalidFechaException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "InvalidFechaException{" +
                "mensaje='" + mensaje + '\'' +
                '}';
    }
}
