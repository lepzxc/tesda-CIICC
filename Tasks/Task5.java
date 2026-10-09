import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int maxInput = 3;

        for (int i=0; i<maxInput; i++) {
            System.out.printf("Enter number %d: ", i+1);
            int number = sc.nextInt();

            numbers.add(number);
        }

        int result = findLargestNumber(numbers);

        if (result == -1) {
            System.out.println("All numbers are equal.");
        } else {
            System.out.println("Largest number: " + result);
        }
    }

    public static int findLargestNumber(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
        if (numbers.getFirst() == numbers.getLast()) {
            return -1;
        }
        return numbers.getLast();
    }
}
