package com.example.patterns.AbstractFactory;


public class AbstractFactoryExample {
    
    public static void main(String[] args) {
        
        FactoryProducer.getFactory(AbstractFactory.SHAPE_FACTORY).getShape(Shape.SQUARE).draw();
        
    }
    
}

class FactoryProducer{
    public static AbstractFactory getFactory(int type){
        if(AbstractFactory.COLOR_FACTORY == type){
            return new ColorFactory();
        } else if(AbstractFactory.SHAPE_FACTORY == type){
            return new ShapeFactory();
        }
        return null;
    }
}


interface AbstractFactory {
    public final static int SHAPE_FACTORY = 1;
    public final static int COLOR_FACTORY = 2;
    public Shape getShape(int type);
    public Color getColor(int type);
}

class ShapeFactory implements AbstractFactory{

    public Shape getShape(int type) {
        if(type == Shape.CIRCLE){
            return new Circle();
        } else if(type == Shape.SQUARE){
            return new Square();
        }
        return null;
    }

    public Color getColor(int type) {
        return null;
    }
}

class ColorFactory implements AbstractFactory{

    public Shape getShape(int type) {
        return null;
    }

    public Color getColor(int type) {
        if(type == Color.GREEN){
            return new Green();
        } else if(type == Color.RED){
            return new Red();
        }
        return null;
    }
}

interface Shape {
    public final static int CIRCLE = 1;
    public final static int SQUARE = 2;
    public void draw();
}

class Circle implements Shape{
    public void draw() {
        System.out.println("Draw circle");
    }
}

class Square implements Shape{
    public void draw() {
        System.out.println("Draw square");
    }
}

interface Color {
    public final static int RED = 1; 
    public final static int GREEN = 1; 
    
    public void fill();
}

class Red implements Color {
    public void fill() {
        System.out.println("Fill red");
    }
}
class Green implements Color {
    public void fill() {
        System.out.println("Fill green");
    }
}
