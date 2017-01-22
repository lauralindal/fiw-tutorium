package ws16.aufgaben.aufgabe7;

/**
 * Created by laurall on 12/2/16.
 */
public class Triangle {

    private int a;
    private int b;
    private int c;

    Triangle() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    Triangle(int length) {
        this.a = length;
        this.b = length;
        this.c = length;
    }

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // prüft, ob das Dreieck gleichseitig ist oder nicht
    boolean equilateral(){
        return ((this.a==this.b) && (this.b==this.c));
    }

    // prüft, ob das Dreieck gleichschenklig ist oder nicht
    boolean isosceles() {
        return ((this.a==this.b) || (this.b==this.c) || (this.a==this.c));
    }

    // gibt den Umfang als Integer-Wert zurück
    int circumference() {
        return (this.a+this.b+this.c);
    }

    //gibt den Flächeninhalt als Double zurück
    double area() {
        double s = (this.a+this.b+this.c)/2.0;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        return area;
    }

}
