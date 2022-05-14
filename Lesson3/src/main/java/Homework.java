import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        eng();
        chet();
        mod();
        time();
        table();
        System.out.println(average(new int[]{1, 2, 3, 4, 8, -2}));
        System.out.println(max(new int[]{1, 2, 3, 200, 5, 9, 0}));

    }

    //Задачи:
    //1) Используя тип данных char и операцию инкремента вывести на консоль все буквы английского алфавита
    public static void eng() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i);
        }
    }

    //2)Проверка четности числа
    //Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
    // чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
    // Если пользователь введёт не целое число, то сообщать ему об ошибке.
    public static void chet() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num = in.nextInt();
        in.close();
        if (num % 2 == 1) {
            System.out.println("Число " + num + " является нечетным");
        } else {
            System.out.println("Число " + num + " является четным");
        }
    }

    //3) Меньшее по модулю число
    //Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
    // пользователем вещественных чисел с консоли.
    public static void mod() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int first = in.nextInt();
        System.out.println("Введите второе число: ");
        int second = in.nextInt();
        System.out.println("Введите третье число: ");
        int third = in.nextInt();
        if (Math.abs(first) <= Math.abs(second) && Math.abs(first) <= Math.abs(third)) {
            System.out.println(first + " меньшее по модулю число");
        } else if (Math.abs(second) <= Math.abs(first) && Math.abs(second) <= Math.abs(third)) {
            System.out.println(second + " меньшее по модулю число");
        } else {
            System.out.println(third + " меньшее по модулю число");
        }
        in.close();
    }

    //4) На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
    // оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
    // когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
    // (т.е. рабочий день закончился).
    //Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
    // Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
    // сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
    //Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
    // далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна
    // выводиться фраза о количестве полных часов, содержащихся в n секундах.
    public static void time() {
        int n = (int) (Math.random() * 28801);
        System.out.println("Количество секунд: " + n);
        int h = n / 3600;
        if (h == 0) {
            System.out.println("Осталось менее часа");
        } else if (h == 1) {
            System.out.println("Остался 1 час");
        } else if (h >= 2 && h <= 4) {
            System.out.println("Осталось " + h + " часа");
        } else {
            System.out.println("Осталось " + h + " часов");
        }
    }

    //5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!
//              byte	short	char	int 	long	float	double	boolean
//    byte
//    short
//    char
//    int
//    long
//    float
//    double
//    boolean
//
//    На пересечении напишите следующие фразы:
//    ня (неявное) – если преобразование происходит автоматически,
//    я (явное) – если нужно использовать явное преобразование,
//    х – если преобразование невозможно,
//    т  - если преобразование тождественно.
//    Внимание! используйте System.out.printLn
    public static void table() {
        String[][] table = {
                {"       ", "byte", "short", "char", "int", "long", "float", "double", "boolean"},
                {"byte   ", " т ", " ня ", " я ", "ня", " ня", " ня", "  ня  ", "   x   "},
                {"short  ", " я ", "  т  ", " я ", "ня", "ня", " ня ", "  ня ", "   x   "},
                {"char   ", " я ", "  я  ", " т ", "ня", "ня", " ня ", "  ня ", "   x   "},
                {"int    ", " я ", "  я  ", " я ", "т ", " ня", " ня", "  ня ", "   x   "},
                {"long   ", " я ", "  я  ", " я ", "я ", " т ", " ня", "  ня  ", "   x   "},
                {"float  ", " я ", "  я  ", " я ", "я ", " я ", " т  ", "  ня ", "   x   "},
                {"double ", " я ", "  я  ", " я ", "я ", " я ", " я  ", "  т   ", "   x   "},
                {"boolean", "  x ", "  x  ", "  x ", "x ", " x  ", "  x  ", "  x   ", "   т   "}
        };
        for (String[] strings : table) {
            System.out.println(Arrays.toString(strings));
        }
    }


    /**
     * 6) Метод должен вернуть среднее значение из массива чисел
     * (необходимо сумму всех элементов массива разделить на длину массива)
     * <p>
     * Example:
     * array = {1,2,3,4,5}
     * Метод должен return 3.0
     */
    public static double average(int[] array) {
        double res;
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        res = sum / array.length;
        return res;
    }

    /**
     * 7) Метод должен вернуть максимальный элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     **/
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
