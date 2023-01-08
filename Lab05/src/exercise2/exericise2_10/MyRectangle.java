package exercise2.exericise2_10;

import exercise2.exercise2_6.MyPoint;

public class MyRectangle {
    private MyPoint v1;
    private MyPoint v2;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
    }

    public double getSiz1() {
        return v1.distance(new MyPoint(v1.getY(), v2.getX()));
    }

    public double getSize2() {
        return v1.distance(new MyPoint(v2.getY(), v1.getX()));
    }

    public double getArea() {
        return getSiz1() * getSize2();
    }

    public double getPerimeter() {
        return getSiz1() + getSize2();

    }

}
