package com.decorate.Ex1;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    public void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
