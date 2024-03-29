package resizableandgeometricobject;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(5);
        System.out.println(resizableCircle);
        resizableCircle.resize(50);
        System.out.println(resizableCircle);
    }
}
