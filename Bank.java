package Bank.com;

import java.util.ArrayList;   //ArrayList class import kiya
public class Bank {
    private ArrayList<Account> arr= new ArrayList<Account>();


    //========method - Account add krne ka========
    public void addAccount(Account account){
        arr.add(account); //arr me nya account add honge
        System.out.println("Account added successfully! ");
    }
    //=======method - all account show krne ka======
    public void displayAllAccount(){
        if(arr.isEmpty()) {
            System.out.println("koi Account nhi hai");
            return;
        }

        for(Account account:arr) {
            account.displayAccount();  //ye jo upr account find krega uski details dega like saving ya currentAccount aur usi ka displayAccount call hoga
        }

    }

        //====method- Account find kro=======
    public Account findAccount(int accountNumber) {
        for(Account account: arr) {
            if(account.getAccountNumber()== accountNumber) {
                return account;
            }
        }
        System.out.println("Account not found! ");
        return null;
    }
}
