/**
 * Math Operations with Static import
 */

import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        // Your code here
        return Math.addExact(a, b);
    }

    public static int subtract(int a, int b) {
        // Your code here
        return Math.subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        // Your code here
        return Math.multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        // Your code here
        return Math.floorDiv(a, b);
    }

    public static void main(String[] args) {
        // Demonstrate the math operations here
        System.out.println(add(5, 10));
        System.out.println(subtract(35, 10));
        System.out.println(multiply(5, 10));
        System.out.println(divide(10, 3));

    }
}