package hus.oop.lap11.factory.factorymethod.ex1;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
