import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int totalPoints = 0;
        boolean keepPlaying = true;

        System.out.println("Welcome to the Guess the Number Game!");

        while (keepPlaying) {
            int minNumber = 1;
            int maxNumber = 100;
            int maxChances = 7;

            int secretNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
            int chancesUsed = 0;
            boolean guessedIt = false;

            System.out.println("\nI have chosen a number between " + minNumber + " and " + maxNumber + ".");
            System.out.println("\nYou have " + maxChances + " chances to guess it. Let's begin!");

            while (chancesUsed < maxChances) {
                System.out.print("\nEnter your guess (only numbers): ");

              
                if (input.hasNextInt()) {
                    int playerGuess = input.nextInt();
                    chancesUsed++;

                    
                    if (playerGuess == secretNumber) {
                        System.out.println("Great job! You guessed the correct number in " + chancesUsed + " tries.");
                        guessedIt = true;
                        totalPoints += (maxChances - chancesUsed + 1) * 10;
                        break;
                    } else if (playerGuess < secretNumber) {
                        System.out.println("Your guess is too low. Try again.");
                    } else {
                        System.out.println("Your guess is too high. Try again.");
                    }

                    System.out.println("Chances left: " + (maxChances - chancesUsed));
                } else {
                 
                    System.out.println("That is not a number. Please try again.");
                    input.next(); 
                }
            }

            if (!guessedIt) {
                System.out.println("You have used all your chances. The correct number was: " + secretNumber);
            }

            System.out.println("Your total points so far: " + totalPoints);

            System.out.print("\nDo you want to play another round? (y/n): ");
            String answer = input.next();
            if (!answer.equalsIgnoreCase("y")) {
                keepPlaying = false;
            }
        }

        System.out.println("\nThank you for playing! Your final score is: " + totalPoints);
        input.close();
    }
}
