package shape;
import java.math.*;
import java.lang.*;
public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        this.filled = false;
        this.color = "blue";
        this.width = 2;
        this.length= 3;
    }
    public Rectangle(double width, double length){
        this.filled = false;
        this.color = "blue";
        this.width = width;
        this.length= length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.filled = false;
        this.color = "blue";
        this.width = width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return width*length;
    }
    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }
    @Override
    public String toString() {
        return "Shape: Rectangle, width: "+this.width+", length: "+this.length;
    }
}
