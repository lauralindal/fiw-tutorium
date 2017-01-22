package ws16.tutorium.vererbung;

/**
 * Created by laurall on 1/22/17.
 */
public class TestTiere {

    public static void main(String[] args) {

        Haustier erstes = new Haustier(60, 5000, "Schnuffel", "Laura");
        erstes.ausmaß();

        Katze zweites = new Katze(40, 4500, "Luna");
        zweites.ausmaß(); // Diese Methode wurde einfach von Haustier geerbt!
        zweites.zerkratzt(); // Diese Methode haben wir durch Erweiterung der Klasse Katze erstellt.
        zweites.spricht();
        zweites.spielt();
        zweites.spielt("Knut");
    }

}
