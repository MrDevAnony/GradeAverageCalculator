import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[10];
        double sum = 0;

        // Get grades from user with validation
        System.out.println("Enter the grades for 10 subjects (0 to 20):");
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Grade " + (i + 1) + ": ");
                double input = scanner.nextDouble();

                if (input >= 0 && input <= 20) {
                    grades[i] = input;
                    sum += input;
                    break;
                } else {
                    System.out.println("Invalid grade! Please enter a number between 0 and 20.");
                }
            }
        }

        // Calculate average
        double average = sum / grades.length;
        System.out.printf("Your GPA is: %.2f\n", average);

        // Rewards and punishments
        String[] rewards = {
            "Free ice cream",
            "A full day of rest",
            "50,000 Tomans phone credit",
            "Movie night with friends",
            "A free book"
        };

        String[] punishments = {
            "Do 10 push-ups",
            "No phone for a day",
            "Clean your room",
            "Wash the dishes",
            "Wake up early tomorrow"
        };

        Random random = new Random();

        if (average > 18) {
            String reward = rewards[random.nextInt(rewards.length)];
            System.out.println("Congrats! You get a reward: " + reward);
        } else {
            String punishment = punishments[random.nextInt(punishments.length)];
            System.out.println("Oops! Your punishment is: " + punishment);
        }

        scanner.close();
    }
}