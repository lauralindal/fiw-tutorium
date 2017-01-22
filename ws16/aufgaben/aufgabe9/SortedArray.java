package ws16.aufgaben.aufgabe9;

/**
 * Created by laurall on 1/9/17.
 */

public class SortedArray {

    private int[] s;

    // SortedArray() erzeugt ein leeres s mit der Länge 0
    SortedArray(){
        s = new int[0];
    }

    // SortedArray(int element) erzeugt ein einelementiges s, wobei der Wert von s[0] das element ist
    SortedArray(int element){
        s = new int[1];
        s[0] = element;
    }

    // Objektmethode insert(int element)
    public boolean insert(int element){
        // gibt false zurück, wenn element bereits in s enthalten ist - iteriere
        for(int i = 0; i < this.s.length; i++){
            if(s[i]==element){
                return false;
            }
        }

        // gibt true zurück, wenn element in s eingefügt wurde
        // in dem alle vorherigen Werte aus s und das neue element (an der richtigen Stelle einsortiert) enthalten sind.
        // Um element einzufügen, wird ein neues Array für s erzeugt, wir müssen also einen neuen Array erstellen, mit Länge+1 für die neue Zahl
        int[] copy = new int[this.s.length+1];
        // wenn der ursprüngliche Array leer war, schreiben wir im neuen Array einfach an die erste Stelle die neue Zahl
        if(s.length==0){
            copy[0] = element;
        }
        else {
            boolean inserted = true;
            for(int i = 0; i < copy.length; i++){
                // solange i kleiner ist als die länge des Arrays und das element größer ist als die zahl auf i
                if(i < s.length && this.s[i] < element){
                    // schreibe die Zahlen einfach vom alten in den neuen Array
                    copy[i] = s[i];
                }
                else if(!inserted){
                    // schreibe element an die Stelle im neuen Array
                    copy[i] = element;
                    inserted = true;
                }
                else {
                    // schreibe die restlichen Zahlen aus dem alten Array in den neuen Array
                    copy[i] = this.s[i-1];
                }
            }
        }
        // überschreibe s mit dem neuen Array
        this.s = copy;
        return true;
    }

    // Objektmethode delete(int element)
    public boolean delete(int element){
        boolean contains = false;
        // solange i nicht gefunden wurde und der Array noch nicht fertig durchsucht ist
        for(int i=0; i < this.s.length && !contains; i++)
        {
            // prüfe, ob die Zahl auf i mit element übereinstimmt und gib ggf true zurück
            if(s[i] == element) contains=true;
        }
        // wenn wir durch alles durch sind, prüfe ob element drin war, falls nicht, beende mit false
        if(!contains) return false;
        // falls doch, mache weiter: erstelle einen neuen Array, der um eine Stelle kürzer ist
        int i=0;
        int[] copy = new int[this.s.length-1];
        // solange die Zahl auf i kleiner ist als das element, kopieren wir
        while(this.s[i] < element)
        {
            copy[i] = this.s[i];
            i++;
        }
        // wenn die Zahl auf i gleich das element ist, machen wir NIX, es wird also übersprungen
        // wenn die Zahl auf i größer ist, kopiere weiter
        while(i<copy.length)
        {
            copy[i] = this.s[i+1];
            i++;
        }
        // überschreibe s mit dem neuen Array
        this.s = copy;
        return true;
    }

    // Objektmethode print()
    public void print() {
        // wenn der Array leer ist, geben wir einen leeren Array aus
        if(s.length==0)
        {
            System.out.println("[ ]");
        }
        else
        {
            // gib den Anfang aus
            System.out.print("[ ");
            // gib jede einzelne Zahl mit Komma und Leerzeichen aus
            for(int i=0; i<s.length-1; i++)
                System.out.print(s[i] + ", ");
            // gib das Ende aus
            System.out.println(s[s.length-1] + " ]");
        }
    }


}
