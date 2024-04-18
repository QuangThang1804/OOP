package hus.oop.lap11.factory.factorymethod.ex1;

public abstract class Dialog {
    public void render(){
        Button okButton = createButton();
        okButton.render();
        okButton.onClick();
    }
    public abstract Button createButton();
}
