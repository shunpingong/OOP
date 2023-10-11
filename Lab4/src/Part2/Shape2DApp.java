package Part2;

import java.util.*;

public class Shape2DApp{
    public static void main(String args[]){
		int sq=1;
		int rect=1;
		int cir=1;
		int tri=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of shapes:");
        int numOfShapes = sc.nextInt();

        Shape[] shapeList = new Shape[numOfShapes];

		//menu of what shapes to be created
		System.out.println("1. Square\n"
				+ "2. Rectangle\n"
				+ "3. Circle\n"
				+ "4. Triangle");
        
        for (int i =0; i <numOfShapes; i++){
            
            System.out.print("Enter a choice of shape:");

            switch(sc.nextInt()){
                case 1: 
                    System.out.print("Input the length of the square:");
					shapeList[i] = new Square(sq, sc.nextDouble());
					System.out.println("Square" + sq + " has been created!");
					//increment for name of the next square created
					++sq;
					break;
                case 2:
                    System.out.print("Input the length of the rectangle:");
					double length = sc.nextDouble();
					System.out.print("Input the breadth of the rectangle:");
					double breadth = sc.nextDouble();
                    shapeList[i] = new Rectangle(rect, length, breadth);
					System.out.println("Rectangle" + rect + " has been created!");
                    ++rect;
                    break;
                case 3:
                    System.out.print("Input the radius of the circle:");
                    shapeList[i] = new Circle(cir, sc.nextDouble());
                    System.out.println("Circle" + cir + " has been created!");
                    //increment for name of the next circle created
                    ++cir;
                    break;
                case 4:
                    System.out.print("Input the base of the triangle:");
                    double base = sc.nextDouble();
                    System.out.println("Input the height of the triangle:");
                    double height = sc.nextDouble();
                    shapeList[i] = new Triangle(tri, base, height);
                    System.out.println("Triangle" + tri + " has been created!");
                    //increment for name of the next triangle created
                    ++tri;
                    break;
            }
        }
        System.out.println("");
		//menu for what result should be output
		for(int i=0; i<numOfShapes; i++)
		{
			System.out.println(i + ". Print area of " + shapeList[i].getShapeType());
		}
		System.out.println("-1. Exit");

        //get choice and print output 
		do
		{
			System.out.print("Input a choice:");
			int choice = sc.nextInt();

            if (choice==-1) break;
			if(shapeList[choice] instanceof Square)
			{
				Square s1 = (Square)shapeList[choice];
				
				System.out.printf(s1.getShapeType() + " of length %f ,area is %f\n", s1.getLength(), s1.area());
			}
			else if(shapeList[choice] instanceof Rectangle)
			{
				Rectangle r1 = (Rectangle)shapeList[choice];
				
				System.out.printf(r1.getShapeType() + " of length %f and breadth %f ,area is %f\n", r1.getLength(), r1.getBreadth(), r1.area());
			}
			else if(shapeList[choice] instanceof Circle)
			{
				Circle c1 = (Circle)shapeList[choice];
				
				System.out.printf(c1.getShapeType() + " of radius %f ,area is %f\n", c1.getRadius(), c1.area());
			}
			else if(shapeList[choice] instanceof Triangle)
			{
				Triangle t1 = (Triangle)shapeList[choice];
				
				System.out.printf(t1.getShapeType() + " of base %f and height %f ,area is %f\n", t1.getBase(), t1.getHeight(), t1.area());
			}
		}while(true);
    }
}