package hw1;

import java.io.*;

public class Task1 {

    private static final String PATH = "Lesson12\\src\\main\\java\\hw1\\";

    public static void task() {
        try (BufferedReader br = new BufferedReader(new FileReader(PATH + "input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter(PATH + "output.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                s = s.trim();
                if (isPalindrom(s) && s.matches("[a-zA-Zа-яА-Я-]+")) {
                    bw.write(s + "\n");
                }
            }
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isPalindrom(String word) {
        if (word.length() != 1) {
            boolean pal = true;
            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                    pal = false;
                    break;
                }
            }
            return pal;
        } else {
            return false;
        }
    }
}
