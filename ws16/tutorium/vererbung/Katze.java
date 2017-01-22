package ws16.tutorium.vererbung;

/**
 * Created by laurall on 1/22/17.
 */

// Kindklasse - erbt Methoden und Variablen
public class Katze extends Haustier {

    Katze(int groesse, int gewicht, String name){
        // Achtung! Der Kosntruktor wird nicht vererbt, aber der Konstruktor der Elternklasse wird auch aufgerufen
        super(groesse, gewicht, name, name); // Wir passen hier also an: Katzen gehören sich selbst ;)
    }

    // Wir überschreiben die Methode des Haustiers
    @Override
    void spricht(){
        System.out.println(this.name + " miaut!");
    }

    // wir erweitern die Klasse nun - sie erhält Methoden, die Haustier nicht hat
    void zerkratzt(){
        System.out.println(this.name + " zerkrazt gerne deine Couch.");
    }

}
