package Lab1;
import java.util.Scanner;

public class P2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary:");
        int salary = sc.nextInt();
        
        System.out.println("Enter merit:");
        int merit = sc.nextInt();
        if (salary>=600 && salary <=649){
            if (merit>=10){
                System.out.println("Grade B");
            }
            else{
                System.out.println("Grade C");
            }
        }
        else if (salary>=700 && salary <=899){
            if (merit>=20){
                System.out.println("Grade A");
            }
            else{
                System.out.println("Grade B");
            }
        }
        else if (salary<=649){
            System.out.println("Grade C");
        }
        sc.close();
    }
}