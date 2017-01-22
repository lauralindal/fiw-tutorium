package ws16.tutorium.vererbung;

/**
 * Created by laurall on 1/22/17.
 */

// Superklasse bzw Elternklasse
public class Haustier {

    int groesse;
    int gewicht;
    String name;
    String besitzer;

    Haustier(int groesse, int gewicht, String name, String besitzer){
        this.groesse = groesse;
        this.gewicht = gewicht;
        this.name = name;
        this.besitzer = besitzer;
    }

    // eine Methode, die wir einfach so vererben können
    void ausmaß() {
        if (this.groesse < 50){
            System.out.println("Das ist ein kleines Tier.");
        }
        else{
            System.out.println("Das ist ein großes Tier.");
        }
    }

    // eine Methode, die wir überschreiben werden (verschiedene Funktionalität durch gleichnamige Methoden in Ober- und Unterklasse)
    void spricht() {
        System.out.println(this.name + "macht Geräusche");
    }

    // eine Methode, die wir überlagern (gleiche Funktionalität durch gleichnamige Methoden mit verschiedenen Parameterlisten (verschiedenen Signaturen))
    void spielt(){
        System.out.println(this.name +  " spielt.");
    }
    void spielt(String spielpartner){
        System.out.println(this.name + " spielt mit " + spielpartner + ".");
    }

}
