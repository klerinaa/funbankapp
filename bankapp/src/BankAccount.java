import java.util.Random;

public class BankAccount {
    private String ownerName;
    private String accountNumber;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String ownerName, String accountNumber, double balance) {
        this.ownerName = ownerName.substring(0,1).toUpperCase()+ownerName.substring(1).toLowerCase();
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited successfully: "+amount+"$");
            giveLuckyBonus();
        }else{
            System.out.println("Deposit must be a positive number");
        }
    }
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Withdrawal must be a positive number");
        }else if(amount>balance){
            System.out.println("Insufficient balance");
        }else {
            balance -= amount;
            System.out.println("Withdrawn successfully: "+amount+"$");
        }
    }
    public void transferFunds(BankAccount otherAccount,double amount){
        if(amount<=0){
            System.out.println("Withdrawal must be a positive number");
        }else if(amount>balance){
            System.out.println("Insufficient balance");
        }else {
            balance -= amount;
            otherAccount.deposit(amount);
            System.out.println("Transferred successfully: "+amount+"$ to "+otherAccount.getOwnerName());
        }
    }
    public void showDetails(){
        System.out.println("Owner Name: "+ownerName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
    void giveLuckyBonus(){
        Random rand = new Random();
        int chance = rand.nextInt(10);
       if(chance==0){
           double bonus=Math.round((rand.nextDouble()*50)*100.0)/100.0;
           balance+=bonus;
           System.out.println("Lucky bonus has been given: "+bonus+"$");
       }
    }
}
