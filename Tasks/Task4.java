import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== PALINDROME CHECKER =====");
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        if (checkIfPalindrome(text)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }

    public static boolean checkIfPalindrome(String text) {
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();

        if (sb.toString().equals(text)) {
            return true;
        }
        return false;
    }
}
