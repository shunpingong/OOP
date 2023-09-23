import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args){
        Circle C1 = new Circle();
        int choice;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1. Create a new circle");
            System.out.println("2. Print Area");
            System.out.println("3. Print circumference");
            System.out.println("4. Quit");
            System.out.println("=============================");
            System.out.println("Choose option (1-3):");
            choice = sc.nextInt();

            //If statement if cir == NULL -> circle not created -> display error message
            switch (choice){
                case 1:
                    System.out.println("Enter the radius to compute the area and circumference");
                    int radius=sc.nextInt();
                    C1.setRadius(radius);
                    System.out.println("A new circle is created");
                    break;
                case 2:
                    System.out.println("Area of circle");
                    System.out.println("Radius: "+ C1.getRadius());
                    C1.printArea();
                    break;
                case 3:
                    System.out.println("Circumference of circle");
                    System.out.println("Radius: "+ C1.getRadius());
                    C1.printCircumference();
                    break;
                case 4:
                    System.out.println("Thank you!!");

            }
        } while (choice<4);
    }
}