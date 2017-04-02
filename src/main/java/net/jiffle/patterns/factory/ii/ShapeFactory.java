package net.jiffle.patterns.factory.ii;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.awt.*;
import java.util.function.Supplier;

public class ShapeFactory {
    @RequiredArgsConstructor
    @Getter( AccessLevel.PRIVATE)
    public static enum ShapeType {
        CIRCLE( (c, t) -> new Circle( c, t)),
        RECTANGLE( (c, t) -> new Rectangle( c, t));

        private final ShapeConstructor constructor;
    }

    @FunctionalInterface
    private interface ShapeConstructor {
        Shape create( Color colour, int thickness);
    }

    public static Shape createShape( ShapeType type, Color colour, int thickness) {
        return type.getConstructor().create( colour, thickness);
    }
}
