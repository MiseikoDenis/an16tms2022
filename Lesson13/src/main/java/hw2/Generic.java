package hw2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class Generic<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T t;
    private V v;
    private K k;

    public void parentName() {
        System.out.println(t.getClass());
        System.out.println(v.getClass());
        System.out.println(k.getClass());

    }
}
