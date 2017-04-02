package net.jiffle.patterns.factory.ii;

import java.awt.*;

import static net.jiffle.patterns.factory.ii.ShapeFactory.ShapeType.CIRCLE;
import static net.jiffle.patterns.factory.ii.ShapeFactory.ShapeType.RECTANGLE;

public class FactoryPatternDemo {
    public static void main( String[] args) {
        //call draw method of circle
        ShapeFactory.createShape( CIRCLE, Color.RED, 2).draw();
        //call draw method of Rectangle
        ShapeFactory.createShape( RECTANGLE, Color.BLUE, 5).draw();
    }
}
