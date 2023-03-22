package Examen_POO;

public class Empresa {
    private String nombre;
    private String cif;
    private int n_trabajadores;
    private double capital;


    public Empresa(String nombre, String cif, int n_trabajadores, double capital) {
        this.nombre = nombre;
        this.cif = cif;
        if (n_trabajadores > 0){
            this.n_trabajadores = n_trabajadores;
        } else if (n_trabajadores < 0){
            System.out.println("ERROR: NUM. TRABAJADORES NO VÁLIDO");
        }
        if (capital > 3000){
            this.capital = capital;
        } else if(capital <= 0){
            System.out.println("ERROR: CAPITAL NO VÁLIDO");
        }
    }

    public Empresa(String nombre, String cif, int n_trabajadores){
        this.nombre = nombre;
        this.cif = cif;
        if (n_trabajadores > 0){
            this.n_trabajadores = n_trabajadores;
            this.capital = 3000;
        } else if (n_trabajadores < 0){
            System.out.println("ERROR: NUM. TRABAJADORES NO VÁLIDO");
        }
    }

    public String getNombre(){return this.nombre;}
    public String getCif(){return this.cif;}
    public int getNumTrabajadores(){return this.n_trabajadores;}
    public double getCapital(){return this.capital;}

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCif(String cif){
        this.cif = cif;
    }
    public void setNumTrabajadores(int n_trabajadores){
        if (n_trabajadores > 0){
            this.n_trabajadores = n_trabajadores;
        } else if (n_trabajadores < 0){
            System.out.println("ERROR: NUM. TRABAJADORES NO VÁLIDO");
        }
    }

    public void setCapital(double capital){
        if (capital > 3000){
            this.capital = capital;
        } else if(capital <= 0){
            System.out.println("ERROR: CAPITAL NO VÁLIDO");
        }
    }
}
