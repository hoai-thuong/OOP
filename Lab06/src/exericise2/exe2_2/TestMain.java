package exericise2.exe2_2;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0, "blue");
        Cylinder cylinder = new Cylinder(circle, 5.0);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder);
        Circle circle2 = new Circle(4.0, "bluee");
        cylinder.setBase(circle);
        System.out.println(cylinder.toString());
        System.out.println(cylinder.getVolume());
    }
}
