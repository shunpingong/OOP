package Part2;

import java.util.Scanner;

public class Shape3DApp {
    public static void main(String args[]){
        int sh = 1;
        int py = 1;
        int cu = 1;
        int con = 1;
        int cyl = 1;
        double length;
        double breadth;
        double height;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of shapes:");
        int numOfShapes = sc.nextInt();

        Shape[] shapeList = new Shape[numOfShapes];

		//menu of what shapes to be created
		System.out.println("1. Sphere\n"
				+ "2. Square-based pyramid\n"
				+ "3. Cubiod\n"
				+ "4. Cone\n"
				+ "5. Cylinder");
        
        for (int i =0; i <numOfShapes; i++){
            
            System.out.print("Enter a choice of shape:");

            switch(sc.nextInt()){
                case 1: 
                    System.out.print("Input the radius of the sphere:");
                    shapeList[i] = new Sphere(sh, sc.nextDouble());
                    System.out.println("Sphere" + sh + " has been created!");
                    //increment for name of the next sphere created
                    ++sh;
                    break; 
                case 2:
					System.out.print("Input the length of base of square-based pyramid:");
				    length = sc.nextDouble();
					System.out.print("Input the height of the square-based pyramid:");
					height = sc.nextDouble();
                    shapeList[i] = new Pyramid(py, length, height);
					System.out.println("Square-based pyramid" + py + " has been created!");
					//increment for name of the next square-based pyramid created
					++py;
					break;
                case 3:
					System.out.print("Input the length of the cubiod:");
					length = sc.nextDouble();
					System.out.print("Input the breadth of the cubiod:");
					breadth = sc.nextDouble();
					System.out.print("Input the height of the cubiod:");
					height = sc.nextDouble();
					shapeList[i] = new Cubiod(cu, length, breadth, height);
					System.out.println("Cubiod" + cu + " has been created!");
					//increment for name of the next cubiod created
					++cu;
					break;
                case 4:
                    System.out.print("Input the radius of the cone:");
                    length = sc.nextDouble();
                    System.out.print("Input the height of the cone:");
                    height = sc.nextDouble();
                    shapeList[i] = new Cone(con,length,height);
                    System.out.println("Cone" + con + " has been created!");
                    ++con;
                    break;
                case 5:
                    System.out.print("Input the radius of the cylinder:");
                    length = sc.nextDouble();
                    System.out.print("Input the height of the cylinder:");
                    height = sc.nextDouble();
                    shapeList[i] = new Cylinder(cyl,length,height);
                    System.out.println("Cylinder" + cyl + " has been created!");
                    ++cyl;
                    break;
                }
            }
            //menu for what result should be output
            for(int i=0; i<numOfShapes; i++)
            {
                System.out.println(i + ". Print area and volume of " + shapeList[i].getShapeType());
            }
            System.out.println("-1. Exit");
		//get choice and print output 
		do
		{
			System.out.print("Input a choice:");
			int choice = sc.nextInt();
			
			//get out of the menu (loop)
			if(choice == -1)
				break;
			
			if(shapeList[choice] instanceof Sphere)
			{
				Sphere sp1 = (Sphere)shapeList[choice];
				
				System.out.printf(sp1.getShapeType() + " of radius %f area is %f\n", sp1.getRadius(), sp1.area());
				System.out.printf(sp1.getShapeType() + " of radius %f volume is %f\n", sp1.getRadius(), sp1.volume());
			}
			else if(shapeList[choice] instanceof Pyramid)
			{
				Pyramid py1 = (Pyramid)shapeList[choice];
				
				System.out.printf(py1.getShapeType() + " of base length %f and height %f area is %f\n", py1.getBase(), py1.getHeight(), py1.area());
				System.out.printf(py1.getShapeType() + " of base length %f and height %f volume is %f\n", py1.getBase(), py1.getHeight(), py1.volume());
			}
			else if(shapeList[choice] instanceof Cubiod)
			{
				Cubiod cu1 = (Cubiod)shapeList[choice];
				
				System.out.printf(cu1.getShapeType() + " of length %f, breadth %f and height %f area is %f\n", cu1.getLength(), cu1.getBreadth(), cu1.getHeight(), cu1.area());
				System.out.printf(cu1.getShapeType() + " of length %f, breadth %f and height %f volume is %f\n", cu1.getLength(), cu1.getBreadth(), cu1.getHeight(), cu1.volume());
			}
			else if(shapeList[choice] instanceof Cone)
			{
				Cone con1 = (Cone)shapeList[choice];
				
				System.out.printf(con1.getShapeType() + " of radius %f and height %f area is %f\n", con1.getRadius(), con1.getHeight(), con1.area());
				System.out.printf(con1.getShapeType() + " of radius %f and height %f volume is %f\n", con1.getRadius(), con1.getHeight(), con1.volume());
			}
			else if(shapeList[choice] instanceof Cylinder)
			{
				Cylinder cyl1 = (Cylinder)shapeList[choice];
				
				System.out.printf(cyl1.getShapeType() + " of radius %f and height %f area is %f\n", cyl1.getRadius(), cyl1.getHeight(), cyl1.area());
				System.out.printf(cyl1.getShapeType() + " of radius %f and height %f volume is %f\n", cyl1.getRadius(), cyl1.getHeight(), cyl1.volume());
			}
		}while(true);       
    }
}