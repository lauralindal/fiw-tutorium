package ws16.tutorium.vererbung;

/**
 * Created by laurall on 1/23/17.
 */
public class Hund extends Haustier {

    String farbe;

    public Hund(int groesse, int gewicht, String besitzer, String farbe){
        super(groesse, gewicht, "Schnuffel", besitzer);
        this.farbe = farbe;
    }

    @Override
    void spricht(){
        System.out.println(this.name + " bellt!");
    }
}
