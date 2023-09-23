import java.util.Random;

public class Dice{
    private int valueOfDice;

    public Dice(){
        valueOfDice=0;
    }
    public void setDiceValue(){
        // Create a Random object
        Random random = new Random();

        // Generate a random number between 1 and 6
        valueOfDice = random.nextInt(6) + 1;
    }

    public int getDiceValue(){
        return this.valueOfDice;
    }

    public void printDiceValue(){
        System.out.println("Current value is "+ valueOfDice);
    }
}