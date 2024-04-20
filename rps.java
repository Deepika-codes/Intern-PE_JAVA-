import java.util.Scanner;

public class rps {

    public static void main(String[] args) {
        Scanner sc1 = null;
        try {
            sc1 = new Scanner(System.in);

            System.out.println("Welcome to Rock, Paper, Scissors game!");
            System.out.println(
                "Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors");

            int userChoice = sc1.nextInt();
            int computerChoice = (int) (Math.random() * 3) + 1;

            String userChoiceString = null;
            String computerChoiceString = null;

            switch (userChoice) {
                case 1:
                    userChoiceString = "Rock";
                    break;
                case 2:
                    userChoiceString = "Paper";
                    break;
                case 3:
                    userChoiceString = "Scissors";
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return;
            }

            switch (computerChoice) {
                case 1:
                    computerChoiceString = "Rock";
                    break;
                case 2:
                    computerChoiceString = "Paper";
                    break;
                case 3:
                    computerChoiceString = "Scissors";
                    break;
                default:
                    computerChoiceString = null;
            }

            System.out.println("You chose: " + userChoiceString);
            System.out.println("Computer chose: " + computerChoiceString);

            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                       (userChoice == 2 && computerChoice == 1) ||
                       (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input!");
        } finally {
            if (sc1!= null) {
                sc1.close();
            }
        }
    }
}