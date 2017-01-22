package ws16.tutorium.aufgabe1;

/**
 * Created by laurall on 12/17/16.
 */
public class Studentin {

    private String vorname;
    private String nachname;
    private boolean likesCoffee;
    private int semester;

    Studentin(){
        this.vorname = "Mahdieh";
        this.nachname = "Musterfrau";
        this.likesCoffee = false;
        this.semester = 1;
    }

    Studentin(String vorname, String nachname, boolean likesCoffee, int semester){
        this.vorname = vorname;
        this.nachname = nachname;
        this.likesCoffee = likesCoffee;
        this.semester = semester;
    }

    public Studentin studiert(int jahre){
        String vorname = this.vorname;
        String nachname = this.nachname;
        int semester = this.semester + jahre*2;
        boolean likesCoffee = true;
        return (new Studentin(vorname, nachname, likesCoffee, semester));
    }

    public int trinktKaffee(){
        int semester = this.semester;
        if(likesCoffee){
            // gehen wir davon aus, dass das Semester 120 Tage hat (vier Monate Vorlesungszeit) und sie pro Tag zwei Kaffee trinkt
            int kaffeeKonsum = semester * 120 * 2;
            return kaffeeKonsum;
        }
        else {
            // gehen wir davon aus, dass sie erst ab dem zweiten Semester Kaffe trinkt
            int kaffeeKonsum = semester * 120 * 2 - 240;
            return kaffeeKonsum;
        }
    }

    public boolean trinktKaffeeMit(Studentin kommilitonin){
        return (this.likesCoffee && kommilitonin.likesCoffee);
    }

    public void printBasicInfo(){
        System.out.println(this.vorname + " " + this.nachname);
        if(likesCoffee){
            System.out.println("Mag Kaffee.");
        }
        else {
            System.out.println("Mag keinen Kaffee.");
        }
        System.out.println("Sie studiert im " + semester + ". Semester");
    }
}
