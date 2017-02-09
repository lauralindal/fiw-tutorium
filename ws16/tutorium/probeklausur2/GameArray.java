package ws16.tutorium.probeklausur2;

/**
 * Created by laurall on 2/9/17.
 */
public class GameArray {

    private Game[] gameArray;

    GameArray (int nrOfGames){
        gameArray = new Game[nrOfGames];
    }

    void printResults(int[] nrOfThrows){
        for(int i = 0; i < this.gameArray.length; i++){
            System.out.println("Spieler " + i + " hat " + nrOfThrows[i] + " Würfe benötigt.");
        }
    }

    void printWinner(int[] nrofThrows){
        int smallest = nrofThrows[0];
        int playerIndex = 0;
        for (int i = 0; i < nrofThrows.length; i++){
            if(nrofThrows[i] < smallest){
                smallest = nrofThrows[i];
                playerIndex = i;
            }
        }
        System.out.println("Gewonnen hat Spieler*in " + playerIndex + ". Sie / er hat " + smallest + " Würfe benötigt.");
    }

    void playGame(int target){
        int[] nrOfThrows = new int[gameArray.length];
        for(int i = 0; i < gameArray.length; i++){
            Game game = new Game();
            nrOfThrows[i] = game.throwUntilTarget(target);
        }
        this.printResults(nrOfThrows);
        this.printWinner(nrOfThrows);
    }

}
