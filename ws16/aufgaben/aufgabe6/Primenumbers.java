package ws16.aufgaben.aufgabe6;

/**
 * Created by laurall on 11/26/16.
 */
public class Primenumbers {

    // this method gets called in printPrimenumbers several times
    private static boolean isPrime(int number){
        if(number == 2){
            return true;
        }
        // code from https://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/
        // check if number is a multiple of 2
        else {
            if (number % 2 == 0) {
                return false;
            } else {
                //if not, then just check the odds
                for (int i = 3; i * i <= number; i += 2) {
                    if (number % i == 0)
                        return false;
                }
            }
            return true;
        }
    }

    // this is the method that gets called in main
    public static void printPrimenumbers(int maximum){
        // loop will count through all number from 1 until maximum
        for(int i = 2; i <= maximum; i++) {
            // call method isPrime and give it our current index
            if(isPrime(i)){
                System.out.print(i);
            }
            else {
                System.out.print("-");
            }
        }
    }

    // this is our main method - this is where the program starts
    public static void main(String[] args){
        // call method printPrimenumbers and give it a maximum
        printPrimenumbers(61);

    }

}
