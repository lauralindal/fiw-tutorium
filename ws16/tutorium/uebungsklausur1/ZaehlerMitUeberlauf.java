package ws16.tutorium.uebungsklausur1;

/**
 * Created by laurall on 1/26/17.
 */
public class ZaehlerMitUeberlauf extends Zaehler {

    final static int MAX = 10;
    Zaehler anzUeberlaeufe = new Zaehler();

    @Override
    void reset() {
        this.setWert(0);
        this.anzUeberlaeufe.setWert(0);
    }

    @Override
    void erhoehe() {
        if(getWert() < MAX){
            setWert(getWert() + 1);
        }
        else {
            setWert(1);
            anzUeberlaeufe.setWert(getWert() + 1);
        }
    }

    public int gesamt() {
        return this.anzUeberlaeufe.getWert() * 10 + this.getWert();
    }

    @Override
    public String toString() {
        return ("Zählerstand: " + getWert() + ", " + "Anzahl Überläufe = " + anzUeberlaeufe.getWert() + ", " + "Gesamtzähler: " + gesamt());
    }
}
