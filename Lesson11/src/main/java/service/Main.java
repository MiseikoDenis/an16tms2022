package service;

public class Main {
    public static void main(String[] args) {
//        System.out.println(cut("qoiAwqAgasngBabhklBjh", "A", "B"));
//        System.out.println(replace("qoiAwqAgasngBabhklBjh"));
//        writePalindrome(new String[]{"zakaz", "symbol", "lol"});
//        writeSentences(" asdasgag zakaz. akjsgalskgal asgasg as qwa  tqwt qwt qwqtqw. asga qwa, qqh");
//        System.out.println(middle("code"));
//        Employee[] employees = new Employee[]{
//                new Employee("Петр Ильич Чайковский", 248.593),
//                new Employee("Иван Иванович Иванов", 521.500),
//                new Employee("Дмитрий Сергеевич Петров", 212.6432)
//        };
//        for (Employee employee: employees) {
//            employee.generateReport();
//        }
//        System.out.println(onlyEng("Методы доступа называют ещё аксессорами (от англ. access — доступ), " +
//                "или по отдельности — геттерами (англ. get — чтение) and сеттерами (англ. set — запись)"));
        pm("cab, ccab, cccab");

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
    public static void writePalindrome(String[] str) {
        for (String word : str) {
            boolean pal = isPalindrom(word);
            if (pal) {
                System.out.println(word);
            }
        }
    }

    //проверяем слово, является ли оно палиндромом
    public static boolean isPalindrom(String word) {
        boolean pal = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                pal = false;
                break;
            }
        }
        return pal;
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

    //Возвращаем количество слов в строке
    public static int countWord(String str) {
        return allWords(str).length;
    }

    //делим строку на массив слов
    public static String[] allWords(String str) {
        return str.trim().split("\\W+");
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

    public static void writeSentences(String str) {
        String[] sentence = str.split("\\.");
        for (String s : sentence) {
            if (containsPalindrom(s) || (countWord(s) <= 5 && countWord(s) >= 3)) {
                System.out.println(s);
            }
        }
    }

//    5)Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака:
//            * Пример: "string" → "ri", "code" → "od", "Practice"→"ct".

    public static String middle(String str) {
        String mid;
        mid = str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
        return mid;
    }

//6)Создать класс Employee, у которого есть переменные класса - String fullname, double salary.
//     * Создать массив содержащий несколько объектов этого типа. Создать класс Report (по возможности интерфейс),
//     * который будет содержать метод generateReport, в котором выводится информация о зарплате всех сотрудников.
//     * Используйте форматировании строк(https://javarush.ru/quests/lectures/questmultithreading.level02.lecture06)
//     * Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после запятой и по одной первой букве имени и отчества через точки.
//     * Пример: | Л.Н. Толстой		|		200.34|

//    8*(Можно не делать!))Найти количество слов, содержащих только символы латинского алфавита. Пример:
//            * "Методы доступа называют ещё аксессорами (от англ. access — доступ), или по отдельности — геттерами (англ. get — чтение) and сеттерами (англ. set — запись)"

    public static int onlyEng(String str) {
        int num = 0;
        for (String word : allWords(str)) {
            if (word.matches("[a-zA-Z]+")) {
                num++;
            }
        }
        return num;
    }

//     * 2) Дана строка "cab, ccab, cccab" Необходимо составить регулярное выражение, сделать класс Pattern, Matcher, вызвать метод find и вывести слова на консоль
//     * Должно вывести:
//     * cab
//     * ccab
//     * cccab

    public static void pm(String str) {

    }
}
