package net.jiffle.patterns.strategy.ii;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public interface TextFormatStrategy {
    @RequiredArgsConstructor
    @Getter
    public static enum StrategyType implements TextFormatStrategy {
        PLAIN_TEXT( t -> true,
                t -> t),
        ERROR_TEXT( t -> t.startsWith( "ERROR" ),
                t -> t.toUpperCase()),
        SHORT_TEXT( t -> t.length() < 20 ,
                t -> t.toLowerCase());

        private final Predicate<String> filter;
        private final UnaryOperator<String> formatter;
    }

    Predicate<String> getFilter();
    UnaryOperator<String> getFormatter();
}
