package ws16.tutorium.kuchen;

/**
 * Created by laurall on 2/7/17.
 */
public class Kuchen {

    private String geschmack;
    private int mehl;
    private int eier;
    private int butter;

    Kuchen(){
        this.geschmack = "Rühr";
        this.mehl = 400;
        this.eier = 5;
        this.butter = 200;
    }

    Kuchen(String geschmack, int mehl, int eier, int butter){
        this.geschmack = geschmack;
        this.mehl = mehl;
        this.eier = eier;
        this .butter = butter;
    }

    public void backen(){
        System.out.println("Dein " + this.geschmack + "kuchen bäckt.");
    }

    public void dekorieren(){
        System.out.println("Dein Kuchen ist nun dekoriert.");
    }

    public void dekorieren(String deko){
        System.out.println("Dein Kuchen ist nun mit " + deko + " dekoriert.");
    }

    public String verteilen(int stuecke, int esser){
        if(stuecke >= esser){
            return "Es ist genug Kuchen für alle da!";
        }
        else {
            return "Da wird wohl jemand teilen müssen";
        }
    }
}
