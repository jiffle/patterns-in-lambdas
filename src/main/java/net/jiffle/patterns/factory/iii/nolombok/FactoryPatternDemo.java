package net.jiffle.patterns.factory.iii.nolombok;

import java.awt.Color;

import static net.jiffle.patterns.factory.iii.nolombok.ShapeFactory.ShapeType.CIRCLE;
import static net.jiffle.patterns.factory.iii.nolombok.ShapeFactory.ShapeType.RECTANGLE;

public class FactoryPatternDemo {
    private final ShapeFactory shapeFactory;

    public FactoryPatternDemo(ShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    public static void main( String[] args) {
        // first: static factory method example
        ShapeFactory.createFactory( CIRCLE).create( Color.RED, 2).draw();

        // second: inject factory into application and use later on
        ShapeFactory factory = ShapeFactory.createFactory( RECTANGLE);

        FactoryPatternDemo demoApp = new FactoryPatternDemo( factory);
        demoApp.drawShape( Color.BLUE, 3);
    }

    private void drawShape(Color colour, int thickness) {
        shapeFactory.create( colour, thickness).draw();
    }


}
