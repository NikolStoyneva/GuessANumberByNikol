import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);

            Random randomNumber = new Random();
            int computerNumber = randomNumber.nextInt(100);

            while (true) {
                System.out.print("Guess a number (1-100): ");
                int playerInput = Integer.parseInt(scanner.nextLine());

                boolean isValid = false;

                if (playerInput >= 1 && playerInput <= 100) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input.");
                }

                if (isValid) {
                    if (computerNumber == playerInput) {
                        System.out.println("You guessed it!");
                        break;
                    } else if (playerInput > computerNumber) {
                        System.out.println("Too High");
                    } else {
                        System.out.println("Too Low");
                    }
                }
            }

            System.out.println("Game over!");
            System.out.print("Do you want to play again (Yes/No) - ");

            String playAgain = scanner.nextLine();

            if (playAgain.equals("Yes")) {
                continue;
            } else {
                break;
            }
        }

    }
}