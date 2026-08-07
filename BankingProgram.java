import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        double balance;
        int choice;
        boolean isRunning = true;

        System.out.println("Banking Program");
        System.out.print("Enter your Balance:");
        balance = scanner.nextDouble();

        while(isRunning){
            System.out.println("1.Show Balance");
            System.out.println("2.Deposit");
            System.out.println("3.WithDraw");
            System.out.println("4.Exit");

            System.out.print("Enter your choice(1-4):");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showbalance(balance);
                case 2 -> {
                    balance += deposit();
                    showbalance(balance);
                }
                case 3 -> {
                    balance -= withdraw(balance);
                    showbalance(balance);
                }
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }
        System.out.println("Thank You!");
        scanner.close();

    }
    static void showbalance(double balance){
        System.out.printf("%.2f\n",balance);
    }
    static double deposit(){
        double amount;
        System.out.print("Enter the amount to deposit:");
        amount = scanner.nextDouble();
        if(amount > 0){
            return amount;
        }
        else{
            System.out.println("Amount can't be negative");
            return 0;
        }
    }
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter the amount to withdraw:");
        amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("Insufficient Funds");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}