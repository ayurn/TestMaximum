import java.util.Scanner;

public class FindMaximum<T extends Comparable<T>> {
    T a, b, c;

    public FindMaximum(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T findMax() {
        return FindMaximum.findMax(a, b, c);
    }

    public static <E extends Comparable<E>> E findMax(E a, E b, E c) {
        E max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        return max;
    }


    public static void main(String[] args) {
        System.out.println("welcome to test maximum program ");
    }
}
