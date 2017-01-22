package ws16.tutorium.aufgabe1;

/**
 * Created by laurall on 12/17/16.
 */
public class StudentinTest {

    public static void main(String[] args) {
        Studentin ersti = new Studentin();
        Studentin laura = new Studentin("Laura", "Laugwitz", true, 7);

        ersti.printBasicInfo();
        System.out.println();

        laura.printBasicInfo();
        System.out.println("Sie hat mittlerweile " + laura.trinktKaffee() + " Tassen Kaffee getrunken.");
        System.out.println();

        Studentin vormAbschluss = ersti.studiert(2);
        vormAbschluss.printBasicInfo();
        System.out.println("Sie hat mittlerweile " + vormAbschluss.trinktKaffee() + " Tassen Kaffee getrunken.");
        System.out.println();

        System.out.println("Trinken Mahdieh und Laura im ersten Semester zusammen Kaffee? " + ersti.trinktKaffeeMit(laura));
        System.out.println("Trinken Mahdieh und Laura im fünften Semester zusammen Kaffee? " + vormAbschluss.trinktKaffeeMit(laura));
    }
}
