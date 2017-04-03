package net.jiffle.patterns.factory.iii.nolombok;

import java.awt.*;

@FunctionalInterface
public interface ShapeFactory {
    enum ShapeType {
        // use either explicit or implicit constructor references
        CIRCLE( Circle::new),
        RECTANGLE( (c, t) -> new Rectangle( c, t));

        private final ShapeFactory constructor;

        ShapeType(ShapeFactory constructor) {
            this.constructor = constructor;
        }

        private ShapeFactory getConstructor() {
            return this.constructor;
        }
    }

    Shape create( Color colour, int thickness);

    static ShapeFactory createFactory( ShapeType type) {
        return type.getConstructor();
    }

    static ShapeFactory createFactory( String type) {
        if( type == null) {
            return (c, t) -> null;
            // or throw IllegalArgumentException
        }
        return ShapeType.valueOf( type.trim().toUpperCase()).getConstructor();
    }
}
