package Part2;

public class Pyramid extends Triangle{
    private Square s1;

    public Pyramid(double base,double height){
        super(base,height);
        s1 = new Square(base);
    }

	public Pyramid(int num, double base, double height)
	{
		super(base, height);
        s1 = new Square(base);
		setShapeType("Pyramid" + num);
	}

    public double area(){
        return s1.area() + (2 * (super.getBase() * Math.sqrt(Math.pow(super.getBase()/2, 2) + Math.pow(super.getHeight(), 2))));
    }

    public double volume(){
        return (super.getBase() * super.getBase() * super.getHeight() * 1/3);
    }

}