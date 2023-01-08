package exericise2.exe2_1;

public class LineSub extends Point {private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, endX);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public String toString() {
        return "Line passing 2 point: (" + super.getX() + "," + super.getY() + ") and (" + end.getX() + "," + end.getY() + ")";
    }

    public Point getBegin() {
        Point point = new Point(super.getX(), super.getY());
        return point;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        super.setXY(begin.getX(), begin.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setBeginY(int y) {
        super.setY(y);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public double getLength() {
        double xDiff = end.getX() - super.getX();
        double yDiff = end.getY() - super.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        double xDiff = end.getX() - super.getX();
        double yDiff = end.getY() - super.getY();
        return Math.atan2(yDiff, xDiff);
    }
}
