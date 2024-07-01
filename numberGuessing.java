package macess;
import java.util.Random;
import java.util.Scanner;
	public class numberGuessing {
		public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();
		        boolean playAgain = true;
		        int totalScore = 0;
		        int roundsPlayed = 0;

		        while (playAgain) {
		            int numberToGuess = random.nextInt(100) + 1;
		            int attempts = 0;
		            boolean hasGuessedCorrectly = false;

		            System.out.println("Guess the number between 1 and 100. You have 10 attempts.");

		            while (attempts < 10 && !hasGuessedCorrectly) {
		                System.out.print("Enter your guess: ");
		                int userGuess = scanner.nextInt();
		                attempts++;

		                if (userGuess == numberToGuess) {
		                    System.out.println("Congratulations! You've guessed the correct number.");
		                    hasGuessedCorrectly = true;
		                    totalScore += 10 - attempts + 1; // Higher score for fewer attempts
		                } else if (userGuess > numberToGuess) {
		                    System.out.println("Your guess is too high.");
		                } else {
		                    System.out.println("Your guess is too low.");
		                }
		            }

		            if (!hasGuessedCorrectly) {
		                System.out.println("You've run out of attempts. The correct number was " + numberToGuess);
		            }

		            roundsPlayed++;
		            System.out.println("Your total score is: " + totalScore);
		            System.out.print("Do you want to play again? (yes/no): ");
		            String response = scanner.next();

		            if (!response.equalsIgnoreCase("yes")) {
		                playAgain = false;
		            }
		        }

		        System.out.println("Thanks for playing! You played " + roundsPlayed + " rounds with a total score of " + totalScore);
		        scanner.close();
		    }
		

	}


