package Part2;

public abstract class Shape{
    private String shapeType;

    public String getShapeType(){
        return this.shapeType;
    }

    public void setShapeType(String shape){
        this.shapeType = shape;
    }

    public abstract double area();

}