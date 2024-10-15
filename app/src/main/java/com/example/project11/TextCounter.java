package com.example.project11;

public class TextCounter {
    public static int countWords(String text) {
        String trimmedText = text.trim();
        if (trimmedText.isEmpty()) {
            return 0;
        }
        return trimmedText.split("\\s+").length;
    }
    public static int countCharacters(String text) {
        return text.length();
    }
}
