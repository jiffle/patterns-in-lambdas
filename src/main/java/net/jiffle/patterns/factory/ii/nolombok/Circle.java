package net.jiffle.patterns.factory.ii.nolombok;

import java.awt.*;
import java.text.MessageFormat;

public class Circle implements Shape {
    private final Color colour;
    private final int thickness;

    public Circle(Color colour, int thickness) {
        this.colour = colour;
        this.thickness = thickness;
    }

    public void draw() {
        System.out.println(MessageFormat.format( "Inside Circle::draw( {0}, {1}) method.",
                colour, thickness));
    }
}
