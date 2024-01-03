
/**
 * Write a description of class Sides13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sides13 implements Shape
{
    private int height;
    private int base;
    private String color;
    
    public Sides13(int height, int base, String color) {
        this.height = height;
        this.base = base;
        this.color = color;
    }
    
    public double getArea() {
        return 1/2 * base * height * 13;
    }
    
    public double getPerimeter() {
        return base * 13;
    }
    
    public String getColor() {
        return this.color;
    }
}
