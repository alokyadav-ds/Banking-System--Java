package Bank.com;

public class CurrentAccount extends Account {

    public static final double OVERDRAFT_LIMIT= 5000.0;  // itna ammount minus me ho skta hai account me

    // -----constructor jo Account class me bnaya  hu-------
    public CurrentAccount(int accountNumber, String accountName, double balance) {
        super(accountNumber, accountName, balance);  //---mtlb parent class ka method call hoga jisme ye 3 parameter honge
    }

    @Override  // missing parameter bta dega

    public void withdraw(double amount){
        if(amount<= 0){
            System.out.println("plz enter valid ammount 0 means nothing 😜");
        }
        if(getBalance()-amount< -OVERDRAFT_LIMIT){
            System.out.println("overdraft limit crossed transiction not possible");
        }
        if(getBalance()-amount>= -OVERDRAFT_LIMIT){
            setBalance(getBalance()-amount);  // because ye 1 method hai so setBalance() = getBalance() - amount; nhi kr skte
            System.out.println("Transiction Successful! new Balance: "  +getBalance());
        }
    }

    @Override

    public void displayAccount(){
        super.displayAccount();  //parent ke displayAccount ko pahle execute kra dega jo v displayAccount method me hogi

        System.out.println("Account type: Current Account");
        System.out.println("Over Draft limit: " +OVERDRAFT_LIMIT);
    }
}
