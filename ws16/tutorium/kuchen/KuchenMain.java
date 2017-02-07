package ws16.tutorium.kuchen;

/**
 * Created by laurall on 2/7/17.
 */
public class KuchenMain {

    public static void main(String[] args){

        Kuchen standard = new Kuchen();
        standard.backen();
        standard.dekorieren("Glitzer");
        System.out.println(standard.verteilen(12, 4));

        System.out.println();

        GeburtstagsKuchen[] meineGeburtstage = new GeburtstagsKuchen[28];
        for (int index = 0; index < 28; index++){
            meineGeburtstage[index] = new GeburtstagsKuchen();
            meineGeburtstage[index].positioniereKerzen(index+1);
        }
        meineGeburtstage[4].zündeKerzenAn(5);

        System.out.println();

        HochzeitsKuchen[] auftragsarbeit = new HochzeitsKuchen[4];
        auftragsarbeit[0] = new HochzeitsKuchen("Myriam und Bella");
        auftragsarbeit[0].backen();
        auftragsarbeit[0].ersteEtage.backen();
        auftragsarbeit[0].zweiteEtage.backen();
        auftragsarbeit[0].dritteEtage.backen();
    }
}
