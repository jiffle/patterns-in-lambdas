package net.jiffle.patterns.factory.ii;

import lombok.RequiredArgsConstructor;

import java.awt.*;
import java.text.MessageFormat;

@RequiredArgsConstructor
public class Rectangle implements Shape {
    private final Color colour;
    private final int thickness;

    public void draw() {
        System.out.println(MessageFormat.format( "Inside Rectangle::draw( {0}, {1}) method.",
                colour, thickness));
    }
}
