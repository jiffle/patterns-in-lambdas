package net.jiffle.patterns.strategy.i;

public class TextUtil {
    public static boolean acceptAll(String text) {
        return true;
    }

    public static String noFormatting(String text) {
        return text;
    }

    public static boolean acceptErrors(String text) {
        return text.startsWith( "ERROR" );
    }

    public static String formatError(String text) {
        return text.toUpperCase();
    }
}
