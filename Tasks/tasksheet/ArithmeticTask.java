package tasksheet;

/**
 * The ArithmeticTask class implements an application that
 * using a compound assignment and simply prints the result to standard output.
 * Task 1-1-2
 */

public class ArithmeticTask {

    public static void main (String[] args){
        int result = 1 + 2; // result is now 3
        System.out.println(result);

        result -= 1; // result is now 2
        System.out.println(result);

        result *= 2; // result is now 4
        System.out.println(result);

        result /= 2; // result is now 2
        System.out.println(result);

        result += 8; // result is now 10
        result %= 7; // result is now 3
        System.out.println(result);

    }
}
