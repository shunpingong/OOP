import java.util.Scanner;

public class DiceApp{
    public static void main(String[] args){
        int total=0;
        Dice d1 = new Dice();
        System.out.println("Press <key> to roll the first dice");
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        d1.setDiceValue();
        d1.printDiceValue();
        total += d1.getDiceValue();
        System.out.println("Press <key> to roll the second dice");
        sc.nextInt();
        d1.setDiceValue();
        d1.printDiceValue();
        total += d1.getDiceValue();
        System.out.println("Your total number is: "+ total);
    }
}