public class Homework {
    public static void main(String[] args) {
        printLiterals();
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(calculateHypotenuse(3, 4));
    }

    private static void printLiterals() {
//        ������� �� ������� �������� ��������� �����:
//        ����������
        boolean b = true;
//        ���������
        String str = "������";
//        ����������
        char c = 'c';
//        ������������� 2-�
        byte by = 0b1001;
//        ������������� 8-�
        short s = 056;
//        ������������� 10-�
        int i = 126;
//        ������������� 16-�
        long l = 0xAB;
//        ������� ���� float
        float f = 19.5F;
//        ������� ���� double.
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
     * 1. ����� ������ ������� ����� ���� ����� a � b
     * 2. �������������: ������� �������� ���� ����� a � b ������ ��� ������������ �������� int �� ������� -1
     **/
    public static int sum(int a, int b) {
        if (a==Integer.MAX_VALUE | b==Integer.MAX_VALUE | (a+b)>=Integer.MAX_VALUE)
            return -1;
        else return a+b;
    }

    /**
     * ����� ������ ������� ������������ �������� �� ���� �����
     *
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * ����� ������ ������� 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * ����� ������ ������� 10
     */
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * ��������� ������� ��������, ��������� �������� ����������. ������� ���������� = ����� ��������� �������
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