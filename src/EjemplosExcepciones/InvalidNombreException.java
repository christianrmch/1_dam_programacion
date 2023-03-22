package EjemplosExcepciones;

public class InvalidNombreException extends Exception{
    private String msg;

    InvalidNombreException(String cadena) {
        this.msg = cadena;
    }

    @Override
    public String toString() {
        return "InvalidNombreException{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
