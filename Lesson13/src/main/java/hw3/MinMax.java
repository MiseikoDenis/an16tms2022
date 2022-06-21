package hw3;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class MinMax<T extends Comparable> {
    private T[] array;

    public void printMinMax() {
        if (array.length > 0) {
            T min = array[0];
            T max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i].compareTo(min) < 0) {
                    min = array[i];
                }
                if (array[i].compareTo(max) > 0) {
                    max = array[i];
                }
            }
            System.out.println(min.toString() + " " + max.toString());
        }
    }
}
