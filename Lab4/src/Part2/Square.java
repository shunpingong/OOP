package Part2;

public class Square extends Shape{
    private double length;

    public Square(double len){
        this.length = len;
    }

    public Square(int num,double len){
        setShapeType("Square" + num);
        this.length = len;
    }

    public double area(){
        return (length * length);
    }

    public double getLength(){
        return this.length;
    }
}