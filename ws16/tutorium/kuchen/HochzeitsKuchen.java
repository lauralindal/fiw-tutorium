package ws16.tutorium.kuchen;

/**
 * Created by laurall on 2/7/17.
 */
public class HochzeitsKuchen extends Kuchen {

    Kuchen ersteEtage;
    Kuchen zweiteEtage;
    Kuchen dritteEtage;
    String namen;

    HochzeitsKuchen(String namen){
        super("Hochzeits", 0, 0, 0);
        ersteEtage = new Kuchen("Zitronen", 500, 6, 250);
        zweiteEtage = new Kuchen("Möhren", 100, 4, 200);
        dritteEtage = new Kuchen("Schoko", 100, 6, 300);
        this.namen = namen;
    }

    @Override
    public void backen(){
        System.out.println("Du musst die einzelnen Etagen für " + this.namen + " backen.");
    }
}

