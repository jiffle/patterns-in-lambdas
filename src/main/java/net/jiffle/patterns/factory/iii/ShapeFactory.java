package net.jiffle.patterns.factory.iii;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.awt.*;

@FunctionalInterface
public interface ShapeFactory {
    @RequiredArgsConstructor
    @Getter( AccessLevel.PRIVATE)
    public static enum ShapeType {
        CIRCLE( (c, t) -> new Circle( c, t)),
        RECTANGLE( (c, t) -> new Rectangle( c, t));

        private final ShapeFactory constructor;
    }

    Shape create( Color colour, int thickness);

    public static ShapeFactory createFactory( ShapeType type) {
        return type.getConstructor();
    }

    public static ShapeFactory createFactory( String type) {
        if( type == null) {
            return (c, t) -> null;
            // or throw IllegalArgumentException
        }
        return ShapeType.valueOf( type.trim().toUpperCase()).getConstructor();
    }
}
