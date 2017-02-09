package ws16.tutorium.probeklausur2;

/**
 * Created by laurall on 2/9/17.
 */
public class GameMain {

    public static void main(String[] args){

        Game first = new Game();
        System.out.println("Anzahl Würfe: " + first.throwUntilTarget(100));
        System.out.println("Summe: " + first.sumOfStatistics());
        first.printStatistics();
        GameArray second = new GameArray(10);
        second.playGame(10);
    }
}
