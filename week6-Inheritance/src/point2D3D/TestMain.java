package point2D3D;

public class TestMain {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D.setX(2.0f);
        point2D.setY(3.0f);
        System.out.println(point2D);

        Point3D point3D = new Point3D(2.0f, 1.0f, 5.0f);
        System.out.println(point3D);
        point3D.setX(0.0f);
        point3D.setY(2.0f);
        point3D.setZ(4.0f);
        System.out.println(point3D);

    }
}
