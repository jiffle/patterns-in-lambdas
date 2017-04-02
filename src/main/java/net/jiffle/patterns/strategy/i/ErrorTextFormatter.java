package net.jiffle.patterns.strategy.i;

public class ErrorTextFormatter implements TextFormatter {

    @Override
    public boolean filter( String text ) {
        return text.startsWith( "ERROR" );
    }

    @Override
    public String format( String text ) {
        return text.toUpperCase();
    }
}