package EjemplosExcepciones;

import java.util.Calendar;

public class Persona{
    private String dni;
    private String nombreCompleto;
    private String fNacimiento;
    private int edad;
    private String telefono;
    private String ciudad;

    public Persona(String dni, String nombreCompleto, String fNacimiento, String telefono, String ciudad) throws InvalidDniException, InvalidNombreException, InvalidFechaException, InvalidEdadException{
        if(!dni.matches("[0-9]{7,8}[A-Z a-z]")){
            throw new InvalidDniException("El dni tiene menos de 9 carácteres");
        }
        if(!checkNombre(nombreCompleto)){
            throw new InvalidNombreException("Debes incluir nombre y los dos apellidos");
        }
        if(!checkFecha(fNacimiento)){
            throw new InvalidFechaException("El formato de la fecha no es el correcto");
        }
        if(checkFecha(fNacimiento)){
            int edad = getEdad(fNacimiento);
            if(edad < 18){
                throw new InvalidEdadException("Debe ser mayor de edad la persona");
            } else{
                this.edad = edad;
            }
        }

        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.fNacimiento = fNacimiento;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    private boolean checkNombre(String nombreCompleto){
        if(nombreCompleto.split(" ").length >= 3){
            return true;
        }
        return false;
    }

    private boolean checkFecha(String fecha){
        int d, m;
        boolean fechaCorrecta = false;
        String [] arr = fecha.split("/");
        if(arr.length == 3){
            try{
                d = Integer.parseInt(arr[0]);
                m = Integer.parseInt(arr[1]);
                if(!(d > 31 || m > 12)){
                    fechaCorrecta = true;
                }
            }
            catch(NumberFormatException e ){
                System.out.println("Se ha producido un error en la fecha");
            }
        }
        return fechaCorrecta;
    }

    private int getEdad(String fecha){
        int a, year;
        String[] arr = fecha.split("/");
        if(arr.length == 3){
            try{
                a = Integer.parseInt(arr[2]);
                year = Calendar.getInstance().get(Calendar.YEAR);
                return year - a;
            } catch(NumberFormatException e){
                System.out.println("Se ha producido un error en la fecha");
                return -1;
            }
        }
        return -1;
    }

        @Override
        public String toString(){
            return "Persona{" +
                    "dni='" + dni + '\'' +
                    ", nombreCompleto='" + nombreCompleto + '\'' +
                    ", fNacimiento='" + fNacimiento + '\'' +
                    ", edad=" + edad +
                    ", telefono='" + telefono + '\'' +
                    ", ciudad='" + ciudad + '\'' +
                    '}';
        }
}


