import java.util.Random;
import java.util.Scanner;

public class FunBankApplication {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to FUN BANK");
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Please enter your ac Number: ");
        String acNumber = sc.nextLine();
        BankAccount account1 = new BankAccount(name, acNumber, 0);
        System.out.println("Please enter your friend name: ");
        String name2 = sc.nextLine();
        System.out.println("Please enter your friend ac Number: ");
        String acNumber2 = sc.nextLine();
        BankAccount account2 = new BankAccount(name2, acNumber2, 0);
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to FUNBANK");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Transfer");
            System.out.println("4.Show my account");
            System.out.println("5.Try bank challenge");
            System.out.println("6.Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter deposit amount");
                    double amount = sc.nextDouble();
                    account1.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter withdraw amount");
                    double ammountWithdraw = sc.nextDouble();
                    account1.withdraw(ammountWithdraw);
                    break;
                case 3:
                    System.out.println("Enter transfer amount");
                    double transferAmount = sc.nextDouble();
                    account1.transferFunds(account2, transferAmount);
                    break;
                case 4:
                    account1.showDetails();
                    break;
                case 5:
                    playMathChallenge(account1,sc);
                    break;
                case 6:
                    System.out.println("Thanks for using FUN BANK");
                    exit=true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }

    }
    static void playMathChallenge(BankAccount account,Scanner sc) {
        Random rand = new Random();
        int a=rand.nextInt(10)+1;//1-10
        int b=rand.nextInt(10)+1;
        int correctAnswer=a+b;
        System.out.println("Bank Math Challenge");
        System.out.println("Solve this : "+a+" + "+b+" = ?");
        System.out.println("Please enter your answer: ");
        int answer = sc.nextInt();
        if(answer == correctAnswer) {
            double reward=Math.round((rand.nextDouble()*20)*100.0)/100.0;
            account.deposit(reward);
            System.out.println("Correct you won the challenge");
        }else{
            System.out.println("Incorrect answer. Try again");
        }
    }
}
