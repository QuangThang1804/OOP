package circleandcylinder2_2;

public class TestMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4, "blue");
        System.out.println(circle1);

        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder: "
                + " radius=" + cylinder1.getBase().getRadius()
                + " height=" + cylinder1.getHeight()
                + " base area=" + cylinder1.getArea()
                + " volume=" + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(10.0);
        System.out.println("Cylinder: "
                + " radius=" + cylinder2.getBase().getRadius()
                + " height=" + cylinder2.getHeight()
                + " base area=" + cylinder2.getArea()
                + " volume=" + cylinder2.getVolume());

        Cylinder cylinder3 = new Cylinder(2.0,10.0);
        System.out.println("Cylinder: "
                + " radius=" + cylinder3.getBase().getRadius()
                + " height=" + cylinder3.getHeight()
                + " base area=" + cylinder3.getArea()
                + " volume=" + cylinder3.getVolume());
        System.out.println(cylinder3);
    }
}
