package exercise1.exe1_4;

public class TestMain {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1.toString());
        Shape shape2 = new Shape("green", false) ;
        System.out.println(shape2);
        shape2.setFilled(true);
        shape2.setColor("blue");
        System.out.println(shape2);
        //test circle
        Circle circle = new Circle("green", true , 3.0);
        System.out.println("Area is : " + circle.getArea());
        System.out.println("Perimeter is: " + circle.getPerimeter());
        circle.setRadius(6.0);
        System.out.println("Area is : " + circle.getArea());
        //test Rectangle
        Rectangle rectangle = new Rectangle(3 , 4);
        System.out.println(rectangle);
        rectangle.setLength(5);
        rectangle.setWidth(4);
        System.out.println(rectangle.getArea());
        Rectangle rectangle1 =  new Rectangle("green", true , 6.0, 7.0);
        rectangle1.setColor("blue");
        System.out.println(rectangle1);
        System.out.println(rectangle1.getPerimeter());
        //test square

        Square square1 = new Square(3.0);
        System.out.println(square1.getArea());
        square1.setSide(5);
        System.out.println(square1.getPerimeter());
        square1.setLength(6);
        System.out.println(square1.getPerimeter());
    }
}
