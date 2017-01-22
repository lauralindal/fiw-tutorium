package ws16.aufgaben.aufgabe7;

/**
 * Created by laurall on 12/2/16.
 */
public class TriangleTest {

    public static void main(String[] args){

        Triangle erstes = new Triangle();
        Triangle zweites = new Triangle(7);
        Triangle drittes = new Triangle(8, 8, 9);

        System.out.println(erstes.equilateral());
        System.out.println(erstes.isosceles());
        System.out.println(erstes.circumference());
        System.out.println(erstes.area());

        System.out.println(zweites.equilateral());
        System.out.println(zweites.isosceles());
        System.out.println(zweites.circumference());
        System.out.println(zweites.area());

        System.out.println(drittes.equilateral());
        System.out.println(drittes.isosceles());
        System.out.println(drittes.circumference());
        System.out.println(drittes.area());
    }
}
