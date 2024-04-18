package hus.oop.lap5.rectangle;

public class TestMain {
    public static void main(String[] args) {
        Ractangle ractangle1 = new Ractangle(1.2f, 3.4f);
        System.out.println(ractangle1);
        Ractangle ractangle2 = new Ractangle();
        System.out.println(ractangle2);

        ractangle1.setLength(5.6f);
        ractangle1.setWidth(7.8f);
        System.out.println(ractangle1);
        System.out.println("lenghth is: " + ractangle1.getLength());
        System.out.println("width is: " + ractangle1.getWidth());
        System.out.printf("area is: %.2f%n", ractangle1.getArea());
        System.out.printf("perimeter is: %.2f%n", ractangle1.getPerimeter());
    }
}
