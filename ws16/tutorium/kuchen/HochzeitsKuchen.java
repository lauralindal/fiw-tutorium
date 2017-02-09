package ws16.tutorium.kuchen;

/**
 * Created by laurall on 2/7/17.
 */
public class HochzeitsKuchen extends Kuchen {

    Kuchen ersteEtage;
    Kuchen zweiteEtage;
    Kuchen dritteEtage;
    String hochzeitspaar;

    HochzeitsKuchen(String hochzeitspaar){
        super("Hochzeits");
        ersteEtage = new Kuchen("Zitronen");
        zweiteEtage = new Kuchen("Möhren");
        dritteEtage = new Kuchen("Schoko");
        this.hochzeitspaar = hochzeitspaar;
    }

    @Override
    public void backen(){
        System.out.println("Du musst die einzelnen Etagen für " + this.hochzeitspaar + " backen.");
    }
}

