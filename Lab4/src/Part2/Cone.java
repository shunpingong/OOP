package Part2;

public class Cone extends Circle{
    private double height;

    public Cone(double radius,double height){
        super(radius);
        this.height = height;
    }

    public Cone(int num,double radius,double height){
        super(radius);
        this.height = height;
        setShapeType("Cone" + num);
    }

    public double getHeight(){
        return this.height;
    }

    public double area(){
        return (super.area() + PI * super.getRadius() * (Math.sqrt(Math.pow(this.height, 2) + Math.pow(super.getRadius(), 2))));
    }

    public double volume(){
        return (super.area() * this.height * 1/3);
    }
}