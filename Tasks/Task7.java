/**
 * Create a program where user inputs two numbers and
 * perform 4 basic arithmetic operations using 4 methods
 * with return types and print the results.
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers(5, 5));
        System.out.println(differenceOfNumbers(15, 3));
        System.out.println(productOfNumbers(3, 7));
        System.out.println(quotientOfNumbers(10, 4));
    }

    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int differenceOfNumbers(int num1, int num2) {
        return num1 - num2;
    }

    public static int productOfNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public static double quotientOfNumbers(double num1, double num2) {
        return num1 / num2;
    }

}
