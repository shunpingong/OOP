package Lab1;
import java.util.Scanner;

public class P4{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter height");
    int height = sc.nextInt();
    if (height<=0){
        System.out.println("Error height");
    }
    else{
        for (int i = 0;i<height;i++){
            for (int j=i;j<=i*2;j++){
                if (j%2 ==0 ){
                    System.out.print("AA");
                }
                else{
                    System.out.print("BB");
                }
            }
            System.out.println("");
            // System.out.println("AA".repeat(i));
        }
    }
    sc.close();
    }
}