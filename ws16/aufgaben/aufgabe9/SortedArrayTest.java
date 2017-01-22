package ws16.aufgaben.aufgabe9;

public class SortedArrayTest {

    public static void main(String[] args) {
        SortedArray a1 = new SortedArray();
        SortedArray a2 = new SortedArray(6);

        a1.print(); a2.print();

        a1.insert(8); a1.print();
        a2.insert(90); a2.print();


    }

}