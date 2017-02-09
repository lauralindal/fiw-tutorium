package ws16.tutorium.uebungsklausur1;

/**
 * Created by laurall on 1/26/17.
 */
public class KlausurMain {

    public static void main (String[] args){

        Zaehler first = new Zaehler();
        for(int i = 0; i < 100; i++){
            if(i%10==0){
                first.erhoehe();
                first.print();
            }
            else {
                first.erhoehe();
            }
        }

        ZaehlerMitUeberlauf foo = new ZaehlerMitUeberlauf();
        for(int i = 0; i < 100; i++){
            if(i%10==0){
                foo.erhoehe();
                foo.print();
            }
            else {
                foo.erhoehe();
            }
        }
    }
}
