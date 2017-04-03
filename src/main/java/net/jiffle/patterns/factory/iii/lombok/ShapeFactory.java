package net.jiffle.patterns.factory.iii.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.awt.*;

@FunctionalInterface
public interface ShapeFactory {
    @RequiredArgsConstructor
    @Getter( AccessLevel.PRIVATE)
    enum ShapeType {
        // use either explicit or implicit constructor references
        CIRCLE( Circle::new),
        RECTANGLE( (c, t) -> new Rectangle( c, t));

        private final ShapeFactory constructor;
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
