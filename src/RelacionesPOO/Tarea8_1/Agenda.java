package RelacionesPOO.Tarea8_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Agenda{
    private DatosPersona[] personas;
    private int numeroPersonas;

    public Agenda(int capacidad){
        this.personas = new DatosPersona[capacidad];
        this.numeroPersonas = 0;
    }

    public void anyadePersona(String nombre, String tlf){
        this.numeroPersonas++;
        for(DatosPersona persona: personas){
            if (persona == null){
                this.personas[this.numeroPersonas-1] = new DatosPersona(nombre, tlf);
                break;
            }
        }
    }

    public ArrayList<DatosPersona> buscaPorNombre(String nombre){
        ArrayList<DatosPersona> personasCompartenNombre = new ArrayList<>();
        for (int i = 0; i < this.personas.length; i++) {
            if (this.personas[i] != null && this.personas[i].getNombre().equalsIgnoreCase(nombre)){
                    personasCompartenNombre.add(this.personas[i]);
            }
        }
        return personasCompartenNombre;
    }


    @Override
    public String toString() {
        return "Agenda{\n" +
                "personas=" + Arrays.deepToString(this.personas) +
                ",\nnumeroPersonas=" + this.numeroPersonas +
                "\n}";
    }
}
