package ws16.tutorium.kuchen;

/**
 * Created by laurall on 2/7/17.
 */
public class GeburtstagsKuchen extends Kuchen {

    @Override
    public void dekorieren(){
        System.out.println("Dein Geburtstagskuchen sieht toll aus!");
    }

    public void positioniereKerzen(int kerzen){
        System.out.println("Dieser Kuchen ist für deinen " + kerzen + ". Geburtstag.");
    }

    public void zündeKerzenAn(int kerzen){
        for(int i = 1; i <= kerzen; i++){
            System.out.println("Kerze " + i + " brennt nun.");
        }
    }
}
