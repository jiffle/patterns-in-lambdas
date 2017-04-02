package net.jiffle.patterns.strategy.i;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class EditorMain {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor( new ErrorTextFormatter() );
        textEditor.publishText( "ERROR - something bad happened" );
        textEditor.publishText( "DEBUG - I'm here" );

        publishText( "DEBUG - I'm here", s -> true, s -> s );
        publishText( "ERROR - something bad happened", s -> s.startsWith( "ERROR" ), String::toUpperCase );

        publishText( "DEBUG - I'm here", TextUtil::acceptAll, TextUtil::noFormatting );
        publishText( "ERROR - something bad happened", TextUtil::acceptErrors, TextUtil::formatError );

    }

    public static void publishText(String text, Predicate<String> filter, UnaryOperator<String> format) {
        if (filter.test( text )) {
            System.out.println( format.apply( text ) );
        }
    }

}
