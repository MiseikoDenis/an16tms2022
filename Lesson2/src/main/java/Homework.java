public class Homework {
    public static void main(String[] args) {
        printLiterals();
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(calculateHypotenuse(3, 4));
    }

    private static void printLiterals() {
//        вывести на консоль литералы следующих видов:
//        логический
        boolean b = true;
//        строковый
        String str = "строка";
//        символьный
        char c = 'c';
//        целочисленный 2-й
        byte by = 0b1001;
//        целочисленный 8-й
        short s = 056;
//        целочисленный 10-й
        int i = 126;
//        целочисленный 16-й
        long l = 0xAB;
//        литерал типа float
        float f = 19.5F;
//        литерал типа double.
        double d = 15.7;
        System.out.println(b);
        System.out.println(str);
        System.out.println(c);
        System.out.println(by);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
        if (a==Integer.MAX_VALUE | b==Integer.MAX_VALUE | (a+b)>=Integer.MAX_VALUE)
            return -1;
        else return a+b;
    }

    /**
     * Метод должен вернуть максимальное значение из двух чисел
     *
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * Метод должен вернуть 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * Метод должен вернуть 10
     */
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     * <p>
     * Example1:
     * 3
     * 4
     * return 5
     * <p>
     * Example2:
     * 12
     * 16
     * return 20
     */
    public static double calculateHypotenuse(int a, int b) {
        return Math.sqrt(a*a + b*b);
    }
}