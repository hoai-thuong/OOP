package EXEI.exe1_5;

public class TestResiz {
    public static void main(String[] args) {
        GeometricObject object1 = new Circle(5);
        System.out.println(object1.toString());
        System.out.println("Area: " + object1.getArea());
        System.out.println("Perimeter: " + object1.getPerimeter());

        ResizableCircle object2 = new ResizableCircle(10);
        System.out.println(object2.toString());
        object2.resize(70);
        System.out.println(object2.toString());
        System.out.println("Area: " + object2.getArea());
        System.out.println("Perimeter: " + object2.getPerimeter());


    }

}
