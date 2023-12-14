public class hendecagon implements Shape
{
    private int sideLength;
    private String color;
    private int SIDES = 11;
    
    public hendecagon(int sideLength, String color)
    {
        this.sideLength = sideLength;
        this.color = color;
    }
    
    public double getArea() {
        return (SIDES*sideLength*sideLength)/(4*Math.tan(Math.PI/SIDES));
    }
    
    public double getPerimeter() {
        return sideLength*SIDES;
    }
    
    public String getColor() {
        return this.color;
    }
}
