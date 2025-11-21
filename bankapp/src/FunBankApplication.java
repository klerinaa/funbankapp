import java.util.Scanner;

public class FunBankApplication {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to FUN BANK");
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Please enter your ac Number: ");
        String acNumber = sc.nextLine();
        BankAccount account1=new BankAccount(name,acNumber,0);
    }
}
