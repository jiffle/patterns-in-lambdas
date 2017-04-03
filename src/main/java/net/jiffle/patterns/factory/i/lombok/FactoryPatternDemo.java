package net.jiffle.patterns.factory.i.lombok;

public class FactoryPatternDemo {
    public static void main( String[] args) {
        //call draw method of circle
        ShapeFactory.createShape( ShapeFactory.ShapeType.CIRCLE).draw();
        //call draw method of Rectangle
        ShapeFactory.createShape( ShapeFactory.ShapeType.RECTANGLE).draw();
    }
}
