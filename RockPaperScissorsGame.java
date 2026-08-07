import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        String[] choice = {"rock" , "paper" , "scissors"};

        System.out.println("Rock Paper Scissors Game: ");

        do{

            System.out.println("Enter your move(rock,paper,scissors):");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Invalid Choice");
                continue;
            }

            computerChoice = choice[random.nextInt(3)];
            System.out.println("Computer Choice: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }
            else if(playerChoice.equals("rock") && computerChoice.equals("scissors")){
                System.out.println("You Win!");
            }
            else if(playerChoice.equals("paper") && computerChoice.equals("rock")){
                System.out.println("You Win!");
            }
            else if(playerChoice.equals("scissors") && computerChoice.equals("paper")){
                System.out.println("You Win!");
            }
            else{
                System.out.println("You Lose!");
            }

            System.out.println("Play Again(yes/no):");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        System.out.println("Thank You for Playing");

        scanner.close();

    }
}