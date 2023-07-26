import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int totalGrades = 0;
        int numOfGrades = 0;
        int currentScore;

        while (true) {
            System.out.print("Enter a grade score (enter a negative number to stop): ");
            currentScore = userInput.nextInt();

            if (currentScore < 0) {
                break; // Exit the loop if a negative number is entered
            }

            if (currentScore > 100) {
                System.out.println("Invalid input: Score cannot be over 100. Please try again.");
                continue; // Skip this iteration and start the loop again
            }

            totalGrades += currentScore;
            numOfGrades++;
        }

        if (numOfGrades > 0) {
            int average = totalGrades / numOfGrades;

            if (average > 90) {
                System.out.println("Your average score was: "+ average + "\nExcellent Work!");
            } else if (average > 80) {
                System.out.println("Your average score was: "+ average +"\nGood Job!");
            } else if (average > 70) {
                System.out.println("Your average score was: "+ average + "\nKeep it up!");
            } else {
                System.out.println("Your average score was: "+ average + "\nLet's work hard to get those grades up!");
            }
        } else {
            System.out.println("No scores were entered.");
        }


    }
}
