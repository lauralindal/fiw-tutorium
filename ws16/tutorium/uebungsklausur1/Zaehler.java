package ws16.tutorium.uebungsklausur1;

/**
 * Created by laurall on 1/26/17.
 */
public class Zaehler {

    private int wert;

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public Zaehler() {
        this.wert = 0;
    }

    void erhoehe() {
        this.wert ++;
    }

    void reset(){
        this.wert = 0;
    }

    @Override
    public String toString() {
        return ("Zählerstand: " + this.wert);
    }

    void print() {
        System.out.println(this.toString());
    }

}
