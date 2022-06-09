package service;

public class Main {
    public static void main(String[] args) {
//        System.out.println(cut("qoiAwqAgasngBabhklBjh", "A", "B"));
//        System.out.println(replace("qoiAwqAgasngBabhklBjh"));
//        palindrome("zakaz", "symbol", "lol");
    }

    //1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения сивола(B).
    public static String cut(String str, String a, String b) {
        return str.substring(str.indexOf(a), str.lastIndexOf(b));
    }

    //    2) Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0
    public static String replace(String str) {
        return str.replace(str.charAt(3), str.charAt(0));
    }

    //    3) В массиве находятся слова. Вывести на экран слова палиндромы
//     * (т.е которые читаются справа на лево и слева на право одинаково, например: заказ, казак, дед...)
    public static void palindrome(String... str) {
        for (String word : str) {
            boolean pal = true;
            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                    pal = false;
                    break;
                }
            }
            if (pal) {
                System.out.println(word);
            }
        }
    }

    //    4) Есть строка в которой содержится текст, предложения разделены точками.
//            * После запуска программы на экран должны выводиться только те предложения в которых от 3-х до 5-ти слов.
//            * Если в предложении присутствует слово-палиндром, то не имеет значения какое количество слов в предложении, оно выводится на экран.
//            * Пишем все в ООП стиле.
//     * 1. Метод принимает строку и возвращает кол-во слов в строке.
//            * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
//            * В main создаем строку с текстом, также можно текст задавать с консоли.
//     * Разбиваем текст на предложения. Используя методы класса TextFormatter определяем подходит ли нам предложение.
//     * Если подходит, то выводим на экран.
    public static void countWord(String str) {

    }


}
