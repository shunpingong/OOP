package Part2;

public class Circle extends Shape{
    private double radius;
    protected final float PI = 3.142f;

    public Circle(double rad){
        this.radius = rad;
    }

	public Circle(int num, double rad)
	{
		setShapeType("Circle" + num);
		this.radius = rad;
	}
    
    public double getRadius(){
        return this.radius;
    }

    public double area(){
        return (PI * Math.pow(this.radius, 2.0));
    }
}