package Part2;

public class Sphere extends Circle{
    public Sphere(double radius){
        super(radius);

    }

    public Sphere(int num,double radius){
        super(radius);
        setShapeType("Sphere" + num);
    }
    public double area(){
        return 4*super.area();
    }

    public double volume(){
        return ((double)4/3 * PI * Math.pow(super.getRadius(),3));
    }
}