package net.jiffle.patterns.factory.ii.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.awt.*;
import java.util.function.Supplier;

public class ShapeFactory {
    @RequiredArgsConstructor
    @Getter( AccessLevel.PRIVATE)
    public static enum ShapeType {
        // use either explicit or implicit constructor references
        CIRCLE( Circle::new),
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
