package programmingchallenges;

public class NumberToDay {
    public static void main(String[] args) {
        convertNumberToDay(1); // Monday
        convertNumberToDay(4); // Thursday
        convertNumberToDay(5); // Friday
        convertNumberToDay(0); // Invalid input
        convertNumberToDay(9); // Invalid input
    }

    public static void convertNumberToDay(int numberOfDay) {
        String day;

        switch (numberOfDay) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                System.out.println("Invalid input!");
                return;
        }
        System.out.printf("Corresponding day: %s\n", day);
    }
}
