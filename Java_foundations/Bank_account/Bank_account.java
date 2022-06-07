package Bank_account;
import java.util.ArrayList;

public class Bank_account {

    // MEMBER VARIABLES
    private String name;
    private double checking_balance;
    private double savings_balance;
    private ArrayList<String> transactions;
    // CONSTRUCTOR
    public Bank_account(String name, double checking_balance, double savings_balance) {
        this.name = name;
        this.checking_balance = checking_balance;
        this.savings_balance = savings_balance;
        this.transactions = new ArrayList<String>();
        NumberofAccounts++;
        TotalOfBalances += checking_balance + savings_balance;

    }
    // METHODS
    public void deposit(double amount , String account) {
        if(account.equals("checking")){
            checking_balance+=amount;
        }
        else if(account.equals("savings")){
            savings_balance+=amount;
        }
        else System.out.println("Specify account");
    }
    public void withdraw(double amount, String account) {
        if(account.equals("checking")){
            if(amount>checking_balance){
            System.out.println("In sufficent funds");
            }
            else checking_balance-=amount;
        }
        else if(account.equals("savings")){
            if(amount>savings_balance){
            System.out.println("insufficent funds");
            }
           else savings_balance-=amount;
        }
        else System.out.println("Specify account");
}
    public void printTransactions() {
        System.out.println("Transactions for " + this.name);
        for (String transaction : this.transactions) {
            System.out.println(transaction);
        }
    }
    public void printCheckingBalance() {
        System.out.println("Balance for " + this.name + " is " + this.checking_balance);
    }
    public void printSavingsBalance(){
        System.out.println("Balance for "+ this.name + "is"+ this.savings_balance);
    }
    // STATIC MEMBER VARIABLES
    private static int NumberofAccounts = 0;
    public static int getNumberofAccounts() {
        return NumberofAccounts;
    }
    private static int TotalOfBalances=0;
    public static int getTotalOfBalances() {
        return TotalOfBalances;
    }

    //Setters and Getters
    public double getCheckingBalance() {
        return checking_balance;
    }
    public Double getSavingsBalance(){
        return savings_balance;

    }

}
