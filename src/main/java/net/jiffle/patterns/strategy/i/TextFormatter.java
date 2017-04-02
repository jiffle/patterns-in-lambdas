package net.jiffle.patterns.strategy.i;

public interface TextFormatter {
    boolean filter(String text);
    String format(String text);
}
