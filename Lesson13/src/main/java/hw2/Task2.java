package hw2;


public class Task2 {
    public static void task() {

        Generic<Integer, Cat, Double> generic = new Generic<>(256, new Cat(), 2.5);
        generic.parentName();
    }
}
