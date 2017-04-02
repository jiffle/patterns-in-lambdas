package net.jiffle.patterns.strategy.ii;

import net.jiffle.patterns.strategy.i.ErrorTextFormatter;
import net.jiffle.patterns.strategy.i.TextEditor;
import net.jiffle.patterns.strategy.i.TextUtil;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class EditorMain {
    public static void main(String[] args) {

        List<String> messages = Arrays.asList( "DEBUG - I'm here", "ERROR - something bad happened");

        messages.forEach( t -> publishText( t, TextFormatStrategy.StrategyType.PLAIN_TEXT));
        messages.forEach( t -> publishText( t, TextFormatStrategy.StrategyType.ERROR_TEXT));
        messages.forEach( t -> publishText( t, TextFormatStrategy.StrategyType.SHORT_TEXT));

        messages.forEach( publishText( TextFormatStrategy.StrategyType.PLAIN_TEXT)::accept);
        messages.forEach( publishText( TextFormatStrategy.StrategyType.ERROR_TEXT)::accept);
        messages.forEach( publishText( TextFormatStrategy.StrategyType.SHORT_TEXT)::accept);
    }

    public static void publishText(String text, TextFormatStrategy formatStrategy) {
        if ( formatStrategy.getFilter().test( text )) {
            System.out.println( formatStrategy.getFormatter().apply( text ) );
        }
    }

    public static Consumer<String> publishText( TextFormatStrategy formatStrategy) {
        return t -> {
        if ( formatStrategy.getFilter().test( t )) {
            System.out.println( formatStrategy.getFormatter().apply( t) );
        }};
    }
}
