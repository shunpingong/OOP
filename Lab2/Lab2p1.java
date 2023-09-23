import java.util.Scanner;

public class Lab2p1 {
    public static void main(String[] args){
        int choice; 
        Methods test = new Methods();
        
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods");
            System.out.println("1:  multiplication test");
            System.out.println("2:  quotient using division by subtraction");
            System.out.println("3:  remainder using division by subtraction");
            System.out.println("4:  count the number of digits");
            System.out.println("5:  position of a digit");
            System.out.println("6:  extract all odd digits");
            System.out.println("7:  quit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            
            switch (choice){
                case 1: 
                    Methods.mulTest(); //static -> class method call class 
                    break;

                case 2:
                    System.out.print("Enter m: "); 
                    int a = sc.nextInt();
                    System.out.print("Enter n: ");
                    int b = sc.nextInt();
                    // System.out.format("%d/%d=%d\n\n",a,b,test.divide(a, b));
                    System.out.println(a + "/" + b + " = " + test.divide(a,b)+ "\n");
                    break;

                case 3:
                    System.out.print("Enter m: ");
                    a = sc.nextInt();
                    System.out.print("Enter n: ");
                    b = sc.nextInt();
                    System.out.format("%d %%% d= %d\n\n",a,b,test.modulus(a, b));
                    break;

                case 4:
                    System.out.print("Enter n: ");
                    a = sc.nextInt();
                    test.countDigits(a);
                    break;

                case 5:
                    System.out.print("Enter n: ");
                    a = sc.nextInt();
                    System.out.print("Enter digit: ");
                    b = sc.nextInt();
                    System.out.format("Position=%d\n\n",test.position(a,b));
                    break;

                case 6:
                    System.out.print("Enter n: ");
                    long d=sc.nextLong();
                    if (d<0){
                        System.out.println("Error, negative number\n");
                    }
                    else{
                        System.out.format("oddDigits = %d\n\n",test.extractOddDigits(d));
                    }
                    break;
                case 7: System.out.println("Program terminating ...."); break;
                // default: System.out.println("Try Again");
            }
        }while (choice<7);
    }
}