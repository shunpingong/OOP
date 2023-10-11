package Part2;

public class Cubiod extends Rectangle{
    private double height;

	public Cubiod(double len, double bth, double height){
		super(len,bth);
		this.height = height;
	}
	
    public Cubiod(int num,double len, double bth, double height){
        super(len,bth);
        this.height = height;
        setShapeType("Cuboid" + num);
    }

    public double getHeight(){
        return this.height;
    }

    public double area(){
        return (super.area() * 2) + (2 * super.getLength() * this.height) + (2 * super.getBreadth() * this.height);
    }

	public double volume()
	{
		//Volume = area of rectangle * height
		return super.area() * this.height;
	}

}