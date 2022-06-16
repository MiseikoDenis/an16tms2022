package hw2;

import static hw1.Task1.isPalindrom;

public class TextFormatter {

    public static int countWord(String str) {
        return allWords(str).length;
    }

    public static String[] allWords(String str) {
        return str.trim().split("[ ,!.?-]+");
    }

    public static boolean containsPalindrom(String str) {
        boolean pal = false;
        String[] words = allWords(str);
        for (String word : words) {
            if (isPalindrom(word)) {
                pal = true;
                break;
            }
        }
        return pal;
    }
}
