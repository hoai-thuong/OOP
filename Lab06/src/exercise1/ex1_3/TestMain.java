package exercise1.ex1_3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.2f , 4.5f);
        System.out.println(point2D.toString());
        point2D.setY(10.0f);
        System.out.println(Arrays.toString(point2D.getXY()));
        point2D.setXY(11f, 12f);
        System.out.println(point2D);


        Point3D point3D = new Point3D(1.2f, 1.3f ,1.4f);
        System.out.println(point3D);
        point3D.setXYZ(3.4f, 4.5f, 5.6f);
        System.out.println(point3D);
        point3D.setZ(7.8f);
        System.out.println(Arrays.toString(point3D.getXYZ()));

    }
}
