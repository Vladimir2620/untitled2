package shape;
import java.math.*;
import java.lang.*;
public class Square extends Rectangle{
    protected double side;

    public Square(){
        this.filled = false;
        this.color = "blue";
        this.side = 2;
    }
    public Square(double side){
        this.filled = false;
        this.color = "blue";
        this.side = side;
    }
    public Square(double side,String color, boolean filled){
        this.filled = false;
        this.color = "blue";
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }
    @Override
    public double getPerimeter() {
        return 4*side;
    }
    @Override
    public String toString() {
        return "Shape: Square, side: "+this.side;
    }
}