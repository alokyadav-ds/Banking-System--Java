package Bank.com;

public class Account {

    private int accountNumber;
    private String accountName;
    private double balance;

    // private variables ko value dene ke liye------

    public Account(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    // balace change hota hai with time-----

    public void setBalance(double balance) {
        this.balance= balance;
    }

    //------for getting value

    public int getAccountNumber(){

        return accountNumber;
    }

    public String getAccountName(){

        return accountName;
    }

    public  double getBalance(){

        return balance;
    }

    // paisa deposit ka method

    public void deposit(double amount){
        balance= balance+amount;
    }

    // paisa withdraw ka method

    public void withdraw(double amount){
        if(balance- amount <0){
            System.out.println("Insufficiant balance");
            return;
        }
        balance= balance-amount;
    }

    // account details ke liye method

    public void displayAccount(){
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + accountName);
        System.out.println("Balance: " + balance);
    }
}
