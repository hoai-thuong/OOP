package exercise1.exercise1_1;

public class Circle {
    private double radius;
    private String color;

    public Circle() {   //default
        radius = 1.0;
        color = "red";
    }

    //    public Circle(double r) {  //default color and radius change
//        radius = r;
//        color = "red";
//    }
    public Circle(double radius) {
        this.radius = radius; //use this resolve the conflict between argument and variable
    }

    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public String toString() {
        return "Circle[radius = " + radius + " color= " + color + "]";
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
//circle is a block building so it runs by testcircle file