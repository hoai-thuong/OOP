package exercise2.exericise2_9;

import exercise2.exercise2_6.MyPoint;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle tri1 = new MyTriangle(1, 2, 3, 4, 5, 5);
        MyPoint poi1 = new MyPoint(1, 2);
        MyPoint poi2 = new MyPoint(3, 4);
        MyPoint poi3 = new MyPoint(5, 6);

        System.out.println(tri1);
        MyTriangle tri2 = new MyTriangle(poi1, poi2, poi3);
        System.out.println(tri2);
//        System.out.println("khoang canh: " + );
        System.out.println("Chu vi: " + tri2.getPerimeter());
        System.out.println(poi1.distance(poi2));
        System.out.println(poi2.distance(poi3));
        System.out.println(poi1.distance(poi3));


    }

}
