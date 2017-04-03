package net.jiffle.patterns.factory.iii.lombok;

import lombok.RequiredArgsConstructor;

import java.awt.*;
import java.text.MessageFormat;

@RequiredArgsConstructor
public class Circle implements Shape {
    private final Color colour;
    private final int thickness;

    public void draw() {
        System.out.println(MessageFormat.format( "Inside Circle::draw( {0}, {1}) method.",
                colour, thickness));
    }
}
