package net.jiffle.patterns.factory.ii.nolombok;

import java.awt.*;
import java.text.MessageFormat;

public class Rectangle implements Shape {
    private final Color colour;
    private final int thickness;

    public Rectangle(Color colour, int thickness) {
        this.colour = colour;
        this.thickness = thickness;
    }

    public void draw() {
        System.out.println(MessageFormat.format( "Inside Rectangle::draw( {0}, {1}) method.",
                colour, thickness));
    }
}
