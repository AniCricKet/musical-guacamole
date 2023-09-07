import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;    // Minimum number in the range
        int maxRange = 100;  // Maximum number in the range
        int secretNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        
        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have selected a number between " + minRange + " and " + maxRange + ". Try to guess it!");
        
        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess < minRange || userGuess > maxRange) {
                System.out.println("Please enter a number between " + minRange + " and " + maxRange + ".");
            } else if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + secretNumber + " in " + attempts + " attempts.");
                break;
            }
        }
        
        scanner.close();
    }