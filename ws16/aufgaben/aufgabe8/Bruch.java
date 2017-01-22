package ws16.aufgaben.aufgabe8;

/**
 * Created by laurall on 12/8/16.
 */
public class Bruch {

    private int zaehler;
    private int nenner;

    Bruch() {
        this.zaehler = 1;
        this.nenner = 1;
    }

    Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    private int ggT()
    {
        int a = this.zaehler;
        int b = this.nenner;
        int merke = b;
        while(b!=0)
        {
            merke = a % b;
            a = b;
            b = merke;
        }
        return a;
    }

    public Bruch kuerzen()
    {
        int ggT = this.ggT();
        int zaehler = this.zaehler/ggT;
        int nenner = this.nenner/ggT;
        return new Bruch(zaehler,nenner);
    }

    public Bruch plus(Bruch b)
    {
        int zaehler = this.zaehler*b.nenner + b.zaehler*this.nenner;
        int nenner = this.nenner*b.nenner;
        return (new Bruch(zaehler,nenner)).kuerzen();
    }

    public Bruch minus(Bruch b)
    {
        int zaehler = this.zaehler*b.nenner - b.zaehler*this.nenner;
        int nenner = this.nenner*b.nenner;
        return (new Bruch(zaehler,nenner)).kuerzen();
    }

    public Bruch mal(Bruch b)
    {
        int zaehler = this.zaehler*b.zaehler;
        int nenner = this.nenner*b.nenner;
        return (new Bruch(zaehler,nenner)).kuerzen();
    }

    public Bruch geteilt(Bruch b)
    {
        int zaehler = this.zaehler*b.nenner;
        int nenner = this.nenner*b.zaehler;
        return (new Bruch(zaehler,nenner)).kuerzen();
    }

    public void print()
    {
        System.out.print(this.zaehler + " / " + this.nenner);
    }

    public static boolean istGroesser(Bruch b1, Bruch b2)
    {
        return (b1.zaehler*b2.nenner > b2.zaehler*b1.nenner);
    }

    public static boolean istKleiner(Bruch b1, Bruch b2)
    {
        return (b1.zaehler*b2.nenner < b2.zaehler*b1.nenner);
    }

    public static boolean sindGleich(Bruch b1, Bruch b2)
    {
        return (b1.zaehler*b2.nenner == b2.zaehler*b1.nenner);
    }
}
