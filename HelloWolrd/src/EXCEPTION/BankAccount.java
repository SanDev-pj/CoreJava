package EXCEPTION;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public interface BankAccount {
    void deposit(float amt);
    void withdraw(float amt);
    float getBalance();
    void displayDetails();
    float getMinimumBalance();
}

class CurrentAccount implements BankAccount {

    private int accNo;
    protected String custName;
    private String accType;
    private float balance;
    public float MIN_BALANCE;

    public CurrentAccount(int accNo, String custName, String accType, float balance) {

        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        MIN_BALANCE = 5000;

        try {
            if (balance < 0) {
                this.balance = 0;
                throw new NegativeAmount(
                        "Amount cannot be Negative Value . Money Withdrawl got restricted on Your Current Account. Please deposit the amount again to meet the Minimum balance");
            }else if (balance < MIN_BALANCE) {
                this.balance = balance;
                throw new InsufficientFunds(
                        "Please Maintain the Minimum Balance !! Money Withdrawl got restricted on Your Current Account. Please deposite money on Your account. ");
            }  else {
                this.balance = balance;
            }

        } catch (InsufficientFunds e) {
            System.out.println("\n" + e.getMessage()+"\n");
        } catch (NegativeAmount e) {
            System.out.println("\n" + e.getMessage()+"\n");
        }

    }

    @Override
    public void deposit(float amt) {
        if (amt < 0) {
            throw new NegativeAmount(
                    "Amount cannot be Negative Value . Money Withdrawl got restricted on Your Current Account. Please deposit the amount again to meet the Minimum balance");
        }else {
            balance +=amt;
        }

    }

    @Override
    public void withdraw(float amt) {
        if((balance - amt) < 1000) {
            System.out.println("\nPlease Maintain the Minimum balance in your Current Account . Withdrawl operation cannot be done .Operation Terminating.....\n");
        }else {
            balance -= amt;
            System.out.printf("\nRs %.2f Amount is Credited from your Account .\nCurrent Balance is Rs %.2f \n",amt,balance);
        }

    }

    @Override
    public float getBalance() {

        return balance;
    }

    @Override
    public void displayDetails() {
        System.out.println("\t\t<-------- Bank Account Details ---------->");
        System.out.println("\n\t\t  @ Account Holder Name : "+custName);
        System.out.println("\n\t\t  @ Account Number : "+accNo);
        System.out.println("\n\t\t  @ Current Balance : "+balance);
        System.out.println("\n\t\t  @ Account Type : "+accType);
        System.out.println("\n\t\t  @ Minimum Balance : "+MIN_BALANCE);
    }

    @Override
    public float getMinimumBalance() {
        return MIN_BALANCE;
    }
}

class InsufficientFunds extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InsufficientFunds(String msg) {
        super(msg);
    }
}

class LowBalanceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public LowBalanceException(String msg) {
        super(msg);
    }
}
class NegativeAmount extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NegativeAmount(String msg) {
        super(msg);
    }
}

class SavingAccount implements BankAccount {
    private int accNo;
    protected String custName;
    private String accType;
    private float balance;
    public float MIN_BALANCE;

    public SavingAccount(int accNo, String custName, String accType, float balance) {

        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        MIN_BALANCE = 1000;

        try {
            if (balance < 0) {
                this.balance = 0;
                throw new NegativeAmount(
                        "Amount cannot be Negative Value . Money Withdrawl got restricted on Your Saving Account. Please deposit the amount again to meet the Minimum balance");
            }else if (balance < MIN_BALANCE) {
                this.balance = balance;
                throw new InsufficientFunds(
                        "Please Maintain the Minimum Balance !! Money Withdrawl got restricted on Your Saving Account. Please deposite money on Your account. ");
            }  else {
                this.balance = balance;
            }

        } catch (InsufficientFunds e) {
            System.out.println("\n" + e.getMessage()+"\n");
        } catch (NegativeAmount e) {
            System.out.println("\n" + e.getMessage()+"\n");
        }

    }

    @Override
    public void deposit(float amt) {
        if (amt < 0) {
            throw new NegativeAmount(
                    "Amount cannot be Negative Value . Money Withdrawl got restricted on Your Saving Account. Please deposit the amount again to meet the Minimum balance");
        }else {
            balance +=amt;
        }

    }

    @Override
    public void withdraw(float amt) {
        if((balance - amt) < 1000) {
            System.out.println("\nPlease Maintain the Minimum balance . Withdrawl operation cannot be done .Operation Terminating.....\n");
        }else {
            balance -= amt;
            System.out.printf("\nRs %.2f Amount is Credited from your Account .\nCurrent Balance is Rs %.2f \n",amt,balance);
        }

    }

    @Override
    public float getBalance() {

        return balance;
    }



    @Override
    public void displayDetails() {
        System.out.println("\n\t\t<-------- Bank Account Details ---------->");
        System.out.println("\n\t\t  @ Account Holder Name : "+custName);
        System.out.println("\n\t\t  @ Account Number : "+accNo);
        System.out.println("\n\t\t  @ Current Balance : "+balance);
        System.out.println("\n\t\t  @ Account Type : "+accType);
        System.out.println("\n\t\t  @ Minimum Balance : "+MIN_BALANCE);
    }

    @Override
    public float getMinimumBalance() {

        return MIN_BALANCE;
    }

}

class UserList {
    static Scanner readVal = new Scanner(System.in);
    static BankAccount accountDetail;

    public static void main(String[] args) {

        String custName;
        int accNo;
        String accType;
        float balance;

        System.out.println("\n\t\t\t<=========== BANK ACCOUNT CREATION ============>");
        System.out.println("\n\t\t1.Create Saving Account\t\t 2.Create Current Account");
        System.out.printf("\nEnter Your Choice = ");
        int choice = readVal.nextInt();

        if (choice == 1) {
            readVal.nextLine();

            System.out.printf("\nEnter Customer full Name = ");
            custName = readVal.nextLine();

            accType = "Saving";

            accNo = ThreadLocalRandom.current().nextInt(1000, 10000);
            System.out.printf("\nAccount number %d is Generated for %s . Please keep it Safe !\n", accNo, custName);

            System.out.printf("\nPlease Deposite the Intital Amount(i.e Minimum Rs 1000) to Activate Your Saving Account = ",accNo, custName);
            balance = readVal.nextFloat();

            accountDetail = new SavingAccount(accNo, custName, accType, balance);

            operateBankAccount();

        } else if (choice == 2) {
            readVal.nextLine();

            System.out.printf("\nEnter Customer full Name = ");
            custName = readVal.nextLine();

            accType = "Current";

            accNo = ThreadLocalRandom.current().nextInt(1000, 10000);
            System.out.printf("\nAccount number %d is Generated for %s . Please keep it Safe !\n", accNo, custName);

            System.out.printf(
                    "\nPlease Deposite the Intital Amount(i.e Minimum Rs 5000) to Activate Your Saving Account = ");
            balance = readVal.nextFloat();

            accountDetail = new CurrentAccount(accNo, custName, accType, balance);

            operateBankAccount();

        } else {
            System.out.println("\n\t\t\t<xxxxxxxxxxxxx WRONG CHOICE SELECTION xxxxxxxxxxxxx>");

        }

        readVal.close();

    }

    public static void operateBankAccount(){

        while(true) {
            System.out.println("\n\t\t\t<================ Account Operation =================>\n");
            System.out.println("1. Deposit\t\t2. Withdrawl\t\t3.Check Balance\t\t4.Check Account Details\t\t5.Exit\n");
            System.out.printf("Enter Your Choice = ");
            int choice = readVal.nextInt();

            switch(choice) {
                case 1: System.out.println("\nEnter the Amount You Want to Deposite = ");
                    float amt = readVal.nextFloat();
                    accountDetail.deposit(amt);
                    break;

                case 2: System.out.println("\nEnter the Amount You Want to Withdrawl = ");
                    float withdrawlAmt = readVal.nextFloat();
                    accountDetail.withdraw(withdrawlAmt);
                    break;

                case 3:
                    float currentBalance = accountDetail.getBalance();

                    try {
                        System.out.println("\nCurrent Balance  = " + currentBalance);
                        if(currentBalance < accountDetail.getMinimumBalance()) {
                            throw new LowBalanceException("The Current Balance In account is not Up to Minimum Balance please Deposite the money.");

                        }

                    }catch(LowBalanceException e) {
                        System.out.println("\n"+e.getMessage());
                    }
                    break;

                case 4: accountDetail.displayDetails();
                    break;
                case 5: break;

                default: System.out.println("********* Wrong Selection ************");
            }

            if(choice == 5) {
                break;
            }

        }

    }

}