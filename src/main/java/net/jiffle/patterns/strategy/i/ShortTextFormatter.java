package net.jiffle.patterns.strategy.i;

public class ShortTextFormatter implements TextFormatter {

    @Override
    public boolean filter( String text ) {
        return text.length() < 20;
    }

    @Override
    public String format( String text ) {
        return text.toLowerCase();
    }
}