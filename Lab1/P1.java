package Lab1;
import java.util.Scanner;  // Import the Scanner class

public class P1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter choice");

        char choice = sc.next().charAt(0);
        
        switch(choice){
            case 'a','A': System.out.println("Action movie fan\n"); break;
            // case 'A': System.out.println("Action movie fan\n"); break;
            // case 'b': System.out.println("Invalid choice\n"); break;
            // case 'B': System.out.println("Invalid choice\n"); break;
            case 'c': System.out.println("Comedy movie fan\n"); break;
            case 'C': System.out.println("Comedy movie fan\n"); break;
            case 'd': System.out.println("Drama movie fan\n"); break;
            case 'D': System.out.println("Drama movie fan\n"); break;
            default: System.out.println("Invalid choice\n"); break;
        }
        sc.close();
    }

}