package ws16.tutorium.uebungsklausur1;

/**
 * Created by laurall on 2/6/17.
 */
public class ZahlenFeld {

    int[] meinFeld;
    Zaehler anzDoppel;
    ZaehlerMitUeberlauf anzVersuche;

    ZahlenFeld(int laenge){
        this.meinFeld = new int[laenge];
        this.anzDoppel = new Zaehler();
        this.anzVersuche = new ZaehlerMitUeberlauf();
    }
}
