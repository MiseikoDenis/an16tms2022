public class Homework {
    public static void main(String[] args) {
        printLiterals();
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(calculateHypotenuse(3, 4));
    }

    private static void printLiterals() {
//        âûâåñòè íà êîíñîëü ëèòåðàëû ñëåäóþùèõ âèäîâ:
//        ëîãè÷åñêèé
        boolean b = true;
//        ñòðîêîâûé
        String str = "ñòðîêà";
//        ñèìâîëüíûé
        char c = 'c';
//        öåëî÷èñëåííûé 2-é
        byte by = 0b1001;
//        öåëî÷èñëåííûé 8-é
        short s = 056;
//        öåëî÷èñëåííûé 10-é
        int i = 126;
//        öåëî÷èñëåííûé 16-é
        long l = 0xAB;
//        ëèòåðàë òèïà float
        float f = 19.5F;
//        ëèòåðàë òèïà double.
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
     * 1. Ìåòîä äîëæåí âåðíóòü ñóììó äâóõ ÷èñåë a è b
     * 2. Äîïîëíèòåëüíî: ñäåëàòü ïðîâåðêó åñëè ñóììà a è b áîëüøå ÷åì ìàêñèìàëüíîå çíà÷åíèå int òî âåðíóòü -1
     **/
    public static int sum(int a, int b) {
        if (((long)a+(long)b)>=Integer.MAX_VALUE){
            return -1;
        } else {
            return a+b
            };
    }

    /**
     * Ìåòîä äîëæåí âåðíóòü ìàêñèìàëüíîå çíà÷åíèå èç äâóõ ÷èñåë
     *
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * Ìåòîä äîëæåí âåðíóòü 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * Ìåòîä äîëæåí âåðíóòü 10
     */
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Èñïîëüçóÿ òåîðåìó Ïèôàãîðà, âû÷èñëèòå çíà÷åíèå ãèïîòåíóçû. Êâàäðàò ãèïîòåíóçû = ñóììå êâàäðàòîâ êàòåòîâ
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
