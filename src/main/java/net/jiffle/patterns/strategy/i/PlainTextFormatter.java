package net.jiffle.patterns.strategy.i;

public class PlainTextFormatter implements TextFormatter {
    @Override
    public boolean filter( String text ) {
        return true;
    }

    @Override
    public String format( String text ) {
        return text;
    }
}
