package ArraysTopics;

import java.util.Scanner;

public class Practice {
    int[] studentScores;

    Scanner sc = new Scanner(System.in);

    public int calculateAverageScore() {
        System.out.println("enter number of subjects: ");
        int numOfSubjects = sc.nextInt();
        if (numOfSubjects <= 0) {
            System.out.println("Number of subjects must be greater than 0.");
            return 0;
        }
        studentScores = new int[numOfSubjects];
        int sum = 0;

        for (int i = 0; i < studentScores.length; i++) {
            System.out.println("Enter score for subject" + ((i + 1)));
            studentScores[i] = sc.nextInt();

            sum += studentScores[i];
            // int avg = sum / studentScores.length;

        }
        return sum / studentScores.length;
        
        

    }

    public static void main(String[] args) {
        Practice pr = new Practice();
        int avgScore = pr.calculateAverageScore();
        System.out.println("Average score is: " + avgScore);

        // Performance based on average score
        if (avgScore >= 90) {
            System.out.println("Performance: Excellent");
        } else if (avgScore >= 75) {
            System.out.println("Performance: Good");
        } else if (avgScore >= 50) {
            System.out.println("Performance: Average");
        } else {
            System.out.println("Performance: Needs Improvement");
        }
    }
}
