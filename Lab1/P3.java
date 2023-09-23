package Lab1;
import java.util.Scanner;

public class P3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting value:");
        int starting = sc.nextInt();

        System.out.println("Enter ending value:");
        int ending = sc.nextInt();

        System.out.println("Enter increment value:");
        int increment = sc.nextInt();

        if (ending < starting){
            System.out.println("Error");
        }
        else{
            System.out.format("%s %6s","US$","S$\n");
            for (int i =starting;i<= ending; i +=increment){
                System.out.format("%d %8.1f\n", i,i*1.82);
            }
        
            // System.out.println(" ");
            // System.out.println("US$     S$");
            // while (starting <= ending){
            //     System.out.print(starting);
            //     System.out.println("       "+ starting*1.82);
            //     starting+=increment;
            // }

            // System.out.println(" ");
            // System.out.println("US$     S$");
            // do{
            //     System.out.print(starting);
            //     System.out.println("       "+ starting*1.82);
            //     starting+=increment;
            // }while (starting<=ending);
        }


        sc.close();
    }
}