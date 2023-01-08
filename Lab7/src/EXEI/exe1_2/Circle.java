package EXEI.exe1_2;


public class Circle implements GeometricObject {
    protected double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public String toString() {
        return "Circle[radius=" + this.radius + "]";
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
