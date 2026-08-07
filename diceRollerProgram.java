import java.util.Scanner;
import java.util.Random;

public class diceRollerProgram {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total = 0;

        System.out.print("Enter the number of dice to roll:");
        numOfDice = scanner.nextInt();

        if(numOfDice > 0){
            for(int i=0;i<numOfDice;i++){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled:" + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        }
        else{
            System.out.println("number of DIce must be greater than 0.");
        }

    }
    static void printDie(int roll){

        String dice1 = """
                        _______
                       |       |
                       |   ●   |
                       |       |
                        _______
                        """;
        String dice2 = """
                        _______
                       | ●     |
                       |       |
                       |     ● |
                        _______
                        """;
        String dice3 = """
                        _______
                       | ●     |
                       |   ●   |
                       |     ● |
                        _______
                        """;
        String dice4 = """
                        _______
                       | ●   ● |
                       |       |
                       | ●   ● |
                        _______
                        """;
        String dice5 = """
                        _______
                       | ●   ● |
                       |   ●   |
                       | ●   ● |
                        _______
                        """;
        String dice6 = """
                        _______
                       | ●   ● |
                       | ●   ● |
                       | ●   ● |
                        _______
                        """;

        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }

    }
}