package Part2;

public class Cylinder extends Circle{
	private double height;
	
	public Cylinder(double radius, double height)
	{
		super(radius);
		this.height = height;
	}
	
	public Cylinder(int num, double radius, double height)
	{
		super(radius);
		setShapeType("Cylinder" + num);
		this.height = height;
	}

    public double getHeight(){
        return this.height;
    }

    public double area(){
        return (2* super.area() + 2* PI * super.getRadius() * this.height);
    }

    public double volume(){
        return (super.area() * this.height);
    }
}