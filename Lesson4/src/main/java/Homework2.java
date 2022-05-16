import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //System.out.println(summ(5, -3));
        //triangles();
        //nechet();
        //max();
        //replaceNechet();
        //replaceMax();
        //povtor(new int[]{0, 3, 46, 3, 2, 3, 2});
        //matrix();
        calculateSumOfDiagonalElements();
        //printMatrix();
    }
//        Задачи:

    //        1) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
    public static int summ(int a, int b) {
        int result = 0;
        if ((a < 0 && b < 0) || (a > 0 && b > 0)) {
            for (int i = 1; i <= Math.abs(b); i++) {
                result += Math.abs(a);
            }
        } else if (a < 0 || b < 0) {
            for (int i = 1; i <= Math.abs(b); i++) {
                result -= Math.abs(a);
            }
        }
        return result;
    }

    //        2) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида
//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *
    public static void triangles() {
        char[][] triangleA = {
                {' ', ' ', ' ', '*'},
                {' ', ' ', '*', '*'},
                {' ', '*', '*', '*'},
                {'*', '*', '*', '*'}
        };
        System.out.println("Triangle A");
        for (char[] chars : triangleA) {
            System.out.println(Arrays.toString(chars));
        }
        System.out.println("Triangle B");
        char[][] triangleB = new char[4][4];
        for (int i = 0; i < triangleB.length; i++) {
            for (int j = 0; j < triangleB[i].length; j++) {
                triangleB[i][j] = triangleA[i][triangleA[i].length - j - 1];
            }
            System.out.println(Arrays.toString(triangleB[i]));
        }
        System.out.println("Triangle C");
        char[][] triangleC = new char[4][4];
        for (int i = 0; i < triangleC.length; i++) {
            triangleC[i] = triangleA[triangleA.length - 1 - i];
            System.out.println(Arrays.toString(triangleC[i]));
        }
        System.out.println("Triangle D");
        char[][] triangleD = new char[4][4];
        for (int i = 0; i < triangleD.length; i++) {
            triangleD[i] = triangleB[triangleB.length - 1 - i];
            System.out.println(Arrays.toString(triangleD[i]));
        }
    }

    //        3) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
    public static void nechet() {
        int start = 1;
        int finish = 100;
        int length = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 1) {
                length++;
            }
        }
        int[] nechet = new int[length];
        for (int i = 0; i < nechet.length; i++) {
            nechet[i] = i * 2 + 1;
        }
        System.out.println(Arrays.toString(nechet));
        int[] obrNechet = new int[length];
        for (int i = 0; i < obrNechet.length; i++) {
            obrNechet[i] = nechet[nechet.length - i - 1];
        }
        System.out.println(Arrays.toString(obrNechet));
    }

    //        4) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
    public static void max() {
        int[] mass = new int[12];
        int max = 0;
        int ind = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 16);
            if (mass[i] >= max) {
                max = mass[i];
                ind = i + 1;
            }
        }
        System.out.println(Arrays.toString(mass));
        System.out.println("Максимальный элемент " + max + ", индекс его последнего вхождения в массив = " + ind);
    }

    //        5) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.
    public static void replaceNechet() {
        int[] mass = new int[20];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 21);
        }
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 == 1) {
                mass[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mass));
    }

    //        6) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
    public static void replaceMax() {
        int[] mass = new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int max = 0;
        int ind = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] >= max) {
                max = mass[i];
                ind = i;
            }
        }
        System.out.println(Arrays.toString(mass));
        mass[ind] = mass[0];
        mass[0] = max;
        System.out.println(Arrays.toString(mass));
    }

    //        7) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
    public static void povtor(int[] array) {
        boolean count = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i] == array[j]) {
                    count = true;
                    break;
                }
            }
        }
        if (count) {
            System.out.print("Массив имеет повторяющиеся элементы ");
            for (int i = 0; i < array.length; i++) {
                int count2 = 0;
                for (int j = i + 1; j < array.length; ++j) {
                    if (array[i] == array[j]) {
                        count2++;
                    }
                }
                if (count2 == 1) {
                    System.out.print(array[i] + " ");
                }
            }
        } else {
            System.out.print("Массив не имеет повторяющихся элементов");
        }
    }

    //        8) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7
    public static void matrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк в массиве: ");
        int a = sc.nextInt();
        System.out.println("Введите количество столбцов в массиве: ");
        int b = sc.nextInt();
        sc.close();
        int[][] mat = new int[a][b];
        System.out.println("Оригинальная матрица: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int) (Math.random() * 51);
            }
            System.out.println(Arrays.toString(mat[i]));
        }
        System.out.println("Транспонированная матрица: ");
        int[][] mat2 = new int[b][a];
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                mat2[i][j] = mat[j][i];
            }
            System.out.println(Arrays.toString(mat2[i]));
        }
    }

    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void calculateSumOfDiagonalElements() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк в массиве: ");
        int a = sc.nextInt();
        System.out.println("Введите количество столбцов в массиве: ");
        int b = sc.nextInt();
        sc.close();
        int sum = 0;
        int[][] mat = new int[a][b];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int) (Math.random() * 100);
            }
            System.out.println(Arrays.toString(mat[i]));
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    sum += mat[i][j];
                } else if (i == (mat[j].length - j)) {

                }
            }
            System.out.println("Сумма элементов матрицы по диагонали: " + sum);
        }
    }


    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printMatrix() {
        // тут пишем логику
    }

//    Доп задача!
//    Создать матрицу размера 10 на 10 и заполнить ее случайными целочислеными значениями (тип int) из диапазона от 0 до 10000.
//    Найти максимум среди сумм трех соседних элементов в строке. Для найденной тройки с максимальной суммой выведите значение суммы и индексы(i,j) первого элемента тройки.
//    Пример:
//            *Для простоты пример показан на одномерном массиве размера 10
//            [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254] Тройка с максимальной суммой:  [2789, 4, 8742]
//    Вывод в консоль:
//            11535 (0,5)
//            *Пояснение. Первое число - сумма тройки  [2789, 4, 8742]. Числа в скобках это 0 строка и 5 столбец - индекс первого элемента тройки, то есть индекс числа 2789.
}
