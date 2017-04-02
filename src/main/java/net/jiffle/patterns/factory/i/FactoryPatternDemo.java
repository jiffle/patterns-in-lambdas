package net.jiffle.patterns.factory.i;

import static net.jiffle.patterns.factory.i.ShapeFactory.ShapeType.CIRCLE;
import static net.jiffle.patterns.factory.i.ShapeFactory.ShapeType.RECTANGLE;

public class FactoryPatternDemo {
    public static void main( String[] args) {
        //call draw method of circle
        ShapeFactory.createShape( CIRCLE).draw();
        //call draw method of Rectangle
        ShapeFactory.createShape( RECTANGLE).draw();
    }
}
