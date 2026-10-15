/**
 * Write a program featuring an integer variable argument's method.
 * The method should return the sum of all parameters and, for each parameter,
 * the cumulative sum up to that point. For instance, given parameters (4, 5, 10),
 * the program should compute the total for the first parameter,
 * such as 4 = (1+2+3+4), and repeat this process for subsequent parameters.
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(getSumOfEachParameter(4, 5, 10)); // 80
    }

    public static int getSumOfEachParameter(int... args) {
        int sum = 0;
        for (int arg : args) {
            for (int j = 1; j <= arg; j++) {
                sum += j;
            }
        }
        return sum;
    }
}
