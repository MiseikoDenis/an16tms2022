package hw2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    private static final String PATH = "Lesson12\\src\\main\\java\\hw2\\";

    public static void task() {

        StringBuilder str = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(PATH + "input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter(PATH + "output.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                if (s.endsWith("-")) {
                    s = s.substring(0, s.length() - 1);
                }
                str.append(s);
            }
            Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я\\s,:]+[.?!]+");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                String sentence = str.substring(matcher.start(), matcher.end()).trim();
                if (TextFormatter.containsPalindrom(sentence) || (TextFormatter.countWord(sentence) <= 5 && TextFormatter.countWord(sentence) >= 3)) {
                    bw.write(sentence + "\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
