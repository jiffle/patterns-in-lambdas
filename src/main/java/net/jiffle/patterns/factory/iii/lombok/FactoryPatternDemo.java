package net.jiffle.patterns.factory.iii.lombok;

import lombok.RequiredArgsConstructor;

import java.awt.*;

import static net.jiffle.patterns.factory.iii.lombok.ShapeFactory.ShapeType.CIRCLE;
import static net.jiffle.patterns.factory.iii.lombok.ShapeFactory.ShapeType.RECTANGLE;

@RequiredArgsConstructor
public class FactoryPatternDemo {
    private final ShapeFactory shapeFactory;

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
