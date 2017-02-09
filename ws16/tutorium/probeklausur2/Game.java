package ws16.tutorium.probeklausur2;

import java.util.Random;

/**
 * Created by laurall on 2/9/17.
 */
public class Game {

    private Random r;
    private int[] statistics;

    Game(){
        r = new Random();
        statistics = new int[6];
    }

    private int createRandomNumber1to6(){
        return (r.nextInt(6)+1);
    }

    private void printRandomNumber1to6(int randomNumber){
        System.out.println("Es wurde eine " + randomNumber + " gewürfelt.");
    }

    private void insertIntoStatistics(int randomNumber){
        for(int i = 0; i < this.statistics.length; i++){
            if(i + 1 == randomNumber){
                this.statistics[i]++;
            }
        }
    }

    void throwDice(){
        int randomNumber = createRandomNumber1to6();
        insertIntoStatistics(randomNumber);
        printRandomNumber1to6(randomNumber);
    }

    void printStatistics(){
        System.out.print("[ ");
        for(int i = 0; i < this.statistics.length; i++){
            System.out.print("( ");
            System.out.print(this.statistics[i]);
            System.out.print(" x ");
            System.out.print(i+1);
            System.out.print(" )");
        }
        System.out.print(" ]");
    }

    int sumOfStatistics(){
        int sum = 0;
        for(int i = 0; i < this.statistics.length; i++){
            sum += (this.statistics[i]*(i+1));
        }
        return sum;
    }

    int throwUntilTarget(int target){
        int counter = 0;
        while (sumOfStatistics() < target){
            throwDice();
            counter++;
        }
        return counter;
    }
}
