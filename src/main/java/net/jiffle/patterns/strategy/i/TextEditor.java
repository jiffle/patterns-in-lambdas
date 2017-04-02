package net.jiffle.patterns.strategy.i;

public class TextEditor {
    private final TextFormatter textFormatter;

    public TextEditor(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void publishText(String text) {
        if (textFormatter.filter( text )) {
            System.out.println( textFormatter.format( text ) );
        }
    }
}
