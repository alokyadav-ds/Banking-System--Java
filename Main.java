package Bank.com;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Bank obj= new Bank();  //Bank class ka object

        Scanner sc= new Scanner(System.in); // Scanner ka object bnaya

        int choice;
        do {
            System.out.println("==== Banking System ===");
            System.out.println("1. New Saving Account");
            System.out.println("2. New Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5.Display All Account");
            System.out.println("6. Exit");

            System.out.println("Enter Your choice: ");// user se choice pucha
            choice= sc.nextInt();

            // Bina switch ke - if else
            //if(choice == 1) {
            //    // Savings account
            //} else if(choice == 2) {
            //    // Current account
            //} else if(choice == 3) {
            //    // Deposit
            //} same kaam switch(choice kr rha hai


            switch (choice) {
                case 1:
                    // New saving account create kro
                    System.out.println("Enter your Account number : ");
                    int accNo= sc.nextInt(); //accNo me account no store ho gya jo user diya

                    System.out.println("Enter Yor Name: ");
                    String accName= sc.next();

                    System.out.println("Enter Balance");
                    double accBalance= sc.nextDouble();  //float value v leta hai

                    SavingsAccount sa = new SavingsAccount(accNo, accName, accBalance);
                    obj.addAccount(sa);
                    break;

                case 2:
                    // New Current Account Create kro
                    System.out.print("Enter Account Number: ");
                    int accNo2 = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String accname2 = sc.next();
                    System.out.print("Enter Balance: ");
                    double accbalance2 = sc.nextDouble();

                    CurrentAccount ca = new CurrentAccount(accNo2, accname2, accbalance2);
                    obj.addAccount(ca);
                    break;

                case 3:
                    // Deposit karo
                    System.out.print("Enter Account Number: ");
                    int depAccNo = sc.nextInt();
                    Account depAcc = obj.findAccount(depAccNo);
                    if (depAcc != null) {
                        System.out.print("Enter Amount: ");
                        double amount = sc.nextDouble();
                        depAcc.deposit(amount);
                    }
                    break;

                case 4:
                    // Withdraw karo
                    System.out.print("Enter Account Number: ");
                    int witAccNo = sc.nextInt();
                    Account witAcc = obj.findAccount(witAccNo);
                    if (witAcc != null) {
                        System.out.print("Enter Amount: ");
                        double amount2 = sc.nextDouble();
                        witAcc.withdraw(amount2);
                    }
                    break;

                case 5:
                    // Sab accounts dikhao
                    obj.displayAllAccount();
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Galat choice");
            }


        } while(choice != 6);

    }

}
