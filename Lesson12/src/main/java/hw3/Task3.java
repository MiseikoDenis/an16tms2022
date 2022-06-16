package hw3;

import hw2.TextFormatter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    private static final String PATH = "Lesson12\\src\\main\\java\\hw3\\";

    public static void task() {
        int count = 0;
        StringBuilder strInput = new StringBuilder();
        StringBuilder strBL = new StringBuilder();
        StringBuilder text = new StringBuilder();

        try (BufferedReader brInput = new BufferedReader(new FileReader(PATH + "input.txt"));
             BufferedReader brBL = new BufferedReader(new FileReader(PATH + "black list.txt"))) {

            strBuild(strInput, brInput);
            strBuild(strBL, brBL);

            String[] blWords = strBL.toString().split(",\\s*");

            Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я\\s,:]+[.?!]+");
            Matcher matcher = pattern.matcher(strInput);
            while (matcher.find()) {
                String sentence = strInput.substring(matcher.start(), matcher.end()).trim();
                String[] words = TextFormatter.allWords(sentence);
                for (String word : words) {
                    boolean pass = true;
                    for (String blWord : blWords) {
                        if (word.equals(blWord)) {
                            pass = false;
                            count++;
                            break;
                        }
                    }
                    if (!pass) {
                        text.append(sentence).append("\n");
                        break;
                    }
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (count == 0) {
            System.out.println("Text is ok!");
        } else {
            System.out.println("Sentences that didn't pass: " + count);
            System.out.println(text);
        }
    }

    public static void strBuild(StringBuilder stringBuilder, BufferedReader bf) throws IOException {
        String s;
        while ((s = bf.readLine()) != null) {
            if (s.endsWith("-")) {
                s = s.substring(0, s.length() - 1);
            }
            stringBuilder.append(s);
        }
    }
}
