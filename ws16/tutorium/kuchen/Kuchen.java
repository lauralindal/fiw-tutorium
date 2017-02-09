package ws16.tutorium.kuchen;

/**
 * Created by laurall on 2/7/17.
 */
public class Kuchen {

    private String geschmack;

    Kuchen(){
        this.geschmack = "Rühr";
    }

    Kuchen(String geschmack){
        this.geschmack = geschmack;
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
