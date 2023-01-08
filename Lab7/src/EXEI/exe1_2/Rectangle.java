package EXEI.exe1_2;


public class Rectangle implements GeometricObject {
    private double width;
    private double length;
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public String toString() {
        return "Rectangle[width=" + this.width + ",length=" + this.length + "]";
    }
    @Override
    public double getArea() {
        return width*length;
    }
    @Override
    public double getPerimeter() {
        return (width+length) * 2;
    }
}
