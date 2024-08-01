import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        while (playAgain)
        {
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfTries = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Welcome to the Number Guessing Game, LOSERS!");
            System.out.println("I have selected a number between 1 and 100.");

            while (!hasGuessedCorrectly)
            {
                System.out.println("Enter your guess: ");
                int playerGuess = scanner.nextInt();
                numberOfTries++;

                if (playerGuess < numberToGuess)
                {
                    System.out.println("Too low chump! Try again: ");
                }
                else if (playerGuess > numberToGuess)
                {
                    System.out.println("You stoner, try again: ");
                }
                else
                {
                    hasGuessedCorrectly = true;
                    System.out.println("Congrats! You got it right! Only took you " + numberOfTries + " tries!");
                }
            }

            System.out.println("Would you like to try again and beat your previous tries? (Y/N): ");
            String answer = scanner.next();

            if (!answer.equalsIgnoreCase("Y"))
            {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
