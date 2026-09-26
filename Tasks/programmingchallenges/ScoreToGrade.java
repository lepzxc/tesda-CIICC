package programmingchallenges;

public class ScoreToGrade {
    public static void main(String[] args) {
        double grade1 = 95;
        double grade2 = 90.2;
        double grade3 = 89.4;
        double grade4 = 59;
        double grade5 = 65;
        double grade6 = 101;
        double grade7 = -1;

        convertScoreToGrade(grade1); // A grade
        convertScoreToGrade(grade2); // A grade
        convertScoreToGrade(grade3); // B grade
        convertScoreToGrade(grade4); // F grade
        convertScoreToGrade(grade5); // D grade
        convertScoreToGrade(grade6); // Invalid grade
        convertScoreToGrade(grade7); // Invalid grade
    }

    public static void convertScoreToGrade(double score) {
        String grade;
        if (score>=90 && score<=100) {
            grade = "A grade";
        } else if (score>=80 && score<90) {
            grade = "B grade";
        } else if (score>=70 && score<80) {
            grade = "C grade";
        } else if (score>=60 && score<70) {
            grade = "D grade";
        } else if (score>=1 && score<60) {
            grade = "F grade";
        } else {
            grade = "Invalid grade";
        }
        System.out.println(grade);
    }
}
