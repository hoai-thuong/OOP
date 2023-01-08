package exericise2.exe2_1;

public class TestMain {
    public static void main(String[] args) {

        System.out.println("Line");
        Line line = new Line(0, 0, 3, 4);
        System.out.println(line);

        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Line line2 = new Line(point1, point2);
        System.out.println(line2);

        System.out.println("LineSub");
        LineSub linesub1 = new LineSub(0, 0, 2, 6);
        System.out.println(linesub1);

        Point p3 = new Point(1, 2);
        Point p4 = new Point(3, 4);
        Line ls2 = new Line(point1, point2);
        System.out.println(ls2);
    }

}
