package EjemplosExcepciones;

public class InvalidDniException extends Exception {
    private String mensaje;
    InvalidDniException(String mensaje) {
        this.mensaje = mensaje;
    }
    @Override
    public String toString() {
        return "InvalidDniException{" +
                "msg='" + this.mensaje + '\'' +
                '}';
    }
}
