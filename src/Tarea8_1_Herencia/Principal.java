package Tarea8_1_Herencia;

public class Principal {
    public static void main(String[] args) {
        Satelites s_2009_s_1 = new Satelites("s_2009_s_1", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites pan = new Satelites("Pan", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites dafne = new Satelites("Dafne", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites atlas = new Satelites("Atlas", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites prometeo = new Satelites("Prometeo", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites pandora = new Satelites("pandora", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites epimeteo = new Satelites("epimeteo", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites jano = new Satelites("jano", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites egeon = new Satelites("egeon", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites metone = new Satelites("metone", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites anthe = new Satelites("anthe", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites palene = new Satelites("palene", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites encelado = new Satelites("encelado", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites tetis = new Satelites("tetis", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites telesto = new Satelites("telesto", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites dione = new Satelites("dione", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites helena = new Satelites("helena", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites pollux = new Satelites("pollux", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites rea = new Satelites("rea", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites titan = new Satelites("titan", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites hiperion = new Satelites("hiperion", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites japeto = new Satelites("japeto", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites kiviuq = new Satelites("kiviuq", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");
        Satelites ijiraq = new Satelites("ijiraq", 150, 23, 534535, 32, 4.3, 117000, 183, "Saturno");

        Satelites[] satelitesSaturno = new Satelites[23];
        satelitesSaturno[0] = s_2009_s_1;
        satelitesSaturno[1] = pan;
        satelitesSaturno[2] = dafne;
        satelitesSaturno[3] = atlas;
        satelitesSaturno[4] = prometeo;
        satelitesSaturno[5] = pandora;
        satelitesSaturno[6] = epimeteo;
        satelitesSaturno[7] = jano;
        satelitesSaturno[8] = egeon;
        satelitesSaturno[9] = metone;
        satelitesSaturno[10] = anthe;
        satelitesSaturno[11] = palene;
        satelitesSaturno[12] = encelado;
        satelitesSaturno[13] = tetis;
        satelitesSaturno[14] = telesto;
        satelitesSaturno[15] = dione;
        satelitesSaturno[16] = helena;
        satelitesSaturno[17] = pollux;
        satelitesSaturno[18] = rea;
        satelitesSaturno[19] = titan;
        satelitesSaturno[20] = hiperion;
        satelitesSaturno[21] = japeto;
        satelitesSaturno[22] = kiviuq;

        Planetas saturno = new Planetas("saturno", 58232, 11, 5.688*10, -130, 10.44, 123412, 4234234, true, satelitesSaturno );

        System.out.println(saturno);

        satelitesSaturno[1].setGravedad(3.23);

        saturno.anyadirSatelite(ijiraq);

        System.out.println(saturno);
    }
}
