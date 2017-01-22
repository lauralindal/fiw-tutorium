package ws16.uebungen.uebung6;

/**
 * Created by laurall on 11/26/16.
 */
public class Uebung6 {

    public static void printIntDivision(int nr1, int nr2) {
        System.out.println(nr1 + " geteilt durch " + nr2 + " ergibt " + nr1/nr2 + ". Es bleibt ein Rest von " + nr1%nr2);
    }

    public static void main(String[] args){
        int zahl = 2147483647+1;
        long longNumber = 2147483647L +1; //aufgrund von Schnelligkeit nimmt Java hier trotzdem den int
        char character = 'f'; // 65 = A
        byte eightBit = 112;
        short something = 32767;
        float away = 4.23f; // casting from double to float
        double more = 5.88;
        boolean truthfulness = true;
        String fIsFor = "Feminism";

        System.out.println("Wert vom Typ int: " + zahl);
        System.out.println("Wert vom Typ long: " + longNumber);
        System.out.println("Wert vom Typ char: " + eightBit);
        System.out.println("Wert vom Typ char: " + character);
        System.out.println("Wert vom Typ short: " + something);
        System.out.println("Wert vom Typ float: " + away);
        System.out.println("Wert vom Typ double: " + more);
        System.out.println("Wert vom Typ boolean: " + truthfulness);
        System.out.println("Wert vom Typ String: " + fIsFor);
        printIntDivision(17, 4);
    }
}
