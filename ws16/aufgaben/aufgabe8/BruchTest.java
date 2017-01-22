package ws16.aufgaben.aufgabe8;

/**
 * Created by laurall on 12/11/16.
 */
public class BruchTest {

    public static void main(String[] args) {
        Bruch b1 = new Bruch(3,7);
        Bruch b2 = new Bruch(4,8);

        b1.print();	System.out.print(" + "); b2.print(); System.out.print(" = "); b1.plus(b2).print();System.out.println();
        b2.print();	System.out.print(" / "); b1.print(); System.out.print(" = "); b2.geteilt(b2).print();System.out.println();
        System.out.println();
        System.out.println();
        b1.print();System.out.print(" groesser ");b2.print();System.out.println(" ? "+ Bruch.istGroesser(b1,b2));
        b1.print();System.out.print(" kleiner ");b2.print();System.out.println(" ? "+ Bruch.istKleiner(b1,b2));
        b1.print();System.out.print(" gleich ");b2.print();System.out.println(" ? "+ Bruch.sindGleich(b1,b2));
    }
}
