package net.jiffle.patterns.factory.ii.nolombok;

import java.awt.*;

public class ShapeFactory {
    public static enum ShapeType {
        // use either explicit or implicit constructor references
        CIRCLE(Circle::new),
        RECTANGLE( (c, t) -> new Rectangle( c, t));

        private final ShapeConstructor constructor;

        ShapeType(ShapeConstructor constructor) {
            this.constructor = constructor;
        }

        private ShapeConstructor getConstructor() {
            return this.constructor;
        }
    }

    @FunctionalInterface
    private interface ShapeConstructor {
        Shape create( Color colour, int thickness);
    }

    public static Shape createShape( ShapeType type, Color colour, int thickness) {
        return type.getConstructor().create( colour, thickness);
    }
}
