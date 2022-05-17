import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        day();
        ameb();
        numbs(0);
        zodiac(15, 10);
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        countDevs(103);
        countDevs(11);
        foobar(6);
        foobar(10);
        foobar(15);
        printPrimeNumbers();
    }

    //1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.
    private static void day() {
        int num = (int) ((Math.random() * 7) + 1);
        switch (num) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            default -> System.out.println("Выходной");
        }
    }

    //2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа
    public static void ameb() {
        int ameba = 1;
        int interval = 3;
        for (int i = 0; i < 8; i++) {
            ameba *= 2;
            System.out.println("Через " + interval * (i + 1) + "часа(ов) будет " + ameba + "амёб");
        }
    }

    //3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
    public static void numbs(int number) {
        int count = 0;
        int num = number;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        if (number < 0) {
            System.out.println(number + " - это отрицательное число, количество цифр = " + count);
        } else if (number > 0) {
            System.out.println(number + " - это положительное число, количество цифр = " + count);
        } else {
            System.out.println("Это просто 0");
        }
    }

    //4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
    public static void zodiac(int day, int month) {
        String zod = "";
        switch (month) {
            case 1:
                if (day < 21) {
                    zod = "Козерог";
                } else {
                    zod = "Водолей";
                }
                break;
            case 2:
                if (day < 20) {
                    zod = "Водолей";
                } else {
                    zod = "Рыбы";
                }
                break;
            case 3:
                if (day < 21) {
                    zod = "Рыбы";
                } else {
                    zod = "Овен";
                }
                break;
            case 4:
                if (day < 21) {
                    zod = "Овен";
                } else {
                    zod = "Телец";
                }
                break;
            case 5:
                if (day < 22) {
                    zod = "Телец";
                } else {
                    zod = "Близнецы";
                }
                break;
            case 6:
                if (day < 22) {
                    zod = "Близнецы";
                } else {
                    zod = "Рак";
                }
                break;
            case 7:
                if (day < 23) {
                    zod = "Рак";
                } else {
                    zod = "Лев";
                }
                break;
            case 8:
                if (day < 22) {
                    zod = "Лев";
                } else {
                    zod = "Дева";
                }
                break;
            case 9:
                if (day < 24) {
                    zod = "Дева";
                } else {
                    zod = "Весы";
                }
                break;
            case 10:
                if (day < 24) {
                    zod = "Весы";
                } else {
                    zod = "Скорпион";
                }
                break;
            case 11:
                if (day < 23) {
                    zod = "Скорпион";
                } else {
                    zod = "Стрелец";
                }
                break;
            case 12:
                if (day < 23) {
                    zod = "Стрелец";
                } else {
                    zod = "Козерог";
                }
                break;
        }
        System.out.println("Знак зодиака: " + zod);
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * сделать проверку что если пользователь ввел не положительное число,
     * то вывести ошибку и отправить пользователя вводить заново новое число!
     * далее создать одномерный массив типа int размера прочитанного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Введите положительное число :");
        do {
            i = sc.nextInt();
            if (i <= 0) {
                System.out.println("Ошибка! Введите положительное число повторно! :");
            }
        } while (i <= 0);
        int[] nums = new int[i];
        for (int j = 0; j < nums.length; j++) {
            nums[j] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(nums));
    }


    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }
        return number;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int count = 0;
        for (int anInt : ints) {
            if (anInt % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        if (count % 10 == 1 && count % 100 != 11) {
            System.out.println(count + " программист");
        } else if (count % 10 == 0 || count % 10 >= 5 || (count % 100 == 11) || (count % 100 == 12)|| (count % 100 == 13)|| (count % 100 == 14)) {
            System.out.println(count + " программистов");
        } else {
            System.out.println(count + " программиста");
        }
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("foobar");
        } else if (number % 3 == 0) {
            System.out.println("foo");
        } else if (number % 5 == 0) {
            System.out.println("bar");
        } else {
            System.out.println("Число не делится на 3 или 5 без остатка");
        }
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        System.out.print("2");
        for (int i = 3; i < 1000; i++) {
            int count = 0;
            for (int j = 2; j <= (int) Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(", " + i);
            }
        }
    }
}
