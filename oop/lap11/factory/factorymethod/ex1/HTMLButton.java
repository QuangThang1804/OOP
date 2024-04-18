package hus.oop.lap11.factory.factorymethod.ex1;

public class HTMLButton implements Button{
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
