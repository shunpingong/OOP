package Part2;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double b,double h){
        this.base = b;
        this.height = h;
    }

	public Triangle(int num, double b,double h)
	{
		setShapeType("Triangle" + num);
		this.base = b;
        this.height = h;
	}
    
    public double getHeight(){
        return this.height;
    }

    public double getBase(){
        return this.base;
    }
    public double area(){
        return (0.5 * base * height);
    }
}