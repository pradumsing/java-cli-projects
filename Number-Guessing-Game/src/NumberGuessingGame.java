import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100");

        while(attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
              attempts++;

            if(guess > secretNumber) {
                System.out.println("TOO HIGH!");
            }
            else if(guess < secretNumber) {
                System.out.println("TOO LOW!");
            }
            else {
                System.out.println("Congratulations!");
                System.out.println("You guessed the number in " + attempts + " attempts.");
                break;
            }
        }
        if(attempts == maxAttempts && guess != secretNumber) {
            System.out.println("Game Over ");
            System.out.println("Correct number is: " + secretNumber);
        }
        sc.close();
    }
}
