package RelacionesPOO.Tarea8_1;

public class Principal {
    public static void main(String[] args) {
    Agenda agenda = new Agenda(7);
    agenda.anyadePersona("Irene", "695124875");
    agenda.anyadePersona("Juan", "635154451");
    agenda.anyadePersona("Irene", "695472813");
    agenda.anyadePersona("Lucas", "648579213");
    agenda.anyadePersona("Irene", "693528417");
    agenda.anyadePersona("Matias", "632515451");
    agenda.anyadePersona("Irene", "634515451");
        System.out.println(agenda.buscaPorNombre("Christian").toString());
        System.out.println(agenda);
    }
}
