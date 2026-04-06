package Bank.com;
//child class
//-------koi minimum balance required nhi ------

public class SavingsAccount extends Account {

    // because Account constructor v hai Account class me ------
    public SavingsAccount(int accountNumber, String accountName, double balance) {
        super(accountNumber, accountName, balance);
    }

    @Override

    public void withdraw( double amount){
        if(amount<= 0){
            System.out.println("Transiction not possible! enter valid amount");
        }

        if(getBalance()-amount<0){
            System.out.println("Insufficiant balance!  paisa kamao pahle 😁");
        }
        if(getBalance()-amount>= 0){
            setBalance(getBalance()- amount);
            System.out.println("Transiction Sussessful! new balance: "+getBalance());

        }
    }

    @Override
    public void displayAccount(){
        super.displayAccount();   //parent ke displayAccount ko pahle execute kra dega jo v displayAccount method me hogi
        System.out.println("Account Type: Savings Account");
    }
}
