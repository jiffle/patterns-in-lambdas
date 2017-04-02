package net.jiffle.patterns.factory.i;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

public class ShapeFactory {
    @RequiredArgsConstructor
    @Getter( AccessLevel.PRIVATE)
    public static enum ShapeType {
        CIRCLE( Circle::new),
        RECTANGLE( Rectangle::new);

        private final Supplier<Shape> constructor;
    }

    public static Shape createShape( ShapeType type) {
        return type.getConstructor().get();
    }
}
