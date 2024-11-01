package com.lbg.unittestactivity;

public class BankAccount {
    // extend to current account/savings account/ISA?


    // variables
    private long balance;
    private long minimumBalance;
    private String accountHolderName;

    // constructor with parameters

    public BankAccount(double inputBalance, double inputMinimumBalance, String accountHolderName){
        // taking input as a double to allow for decimal balance and deposits, changing to a long so that logic works
        long balance = (long) inputBalance * 100;
        long minimumBalance = (long) inputMinimumBalance * 100;
        this.setBalance(balance);
        this.setMinimumBalance(minimumBalance);
        this.setAccountHolderName(accountHolderName);

    }

    // methods

    // depositing money and adding to the balance in the background, making sure the deposit amount is greater than 0
    public void deposit(double inputDepositAmount){
        // taking a long variable first multiply inputDepositAmount which is a double by 100 then casting it to a long - so the logic in brackets works first before it's cast to a long
        long depositAmount = (long) (inputDepositAmount * 100);
        if (depositAmount > 0){
            long newBalance = this.getBalance() + depositAmount;
            this.setBalance(newBalance);
        }
    }

    // withdrawing money and reducing balance in the background
    public void withdraw(double inputWithdrawAmount){
        long withdrawAmount = (long) (inputWithdrawAmount * 100);
        if (withdrawAmount<= getBalance()){
            long newBalance = this.getBalance() - withdrawAmount;
            this.setBalance(newBalance);
        }
    }




    public double getBalanceAsDouble(){
        double dBalance = (double) balance;
        return dBalance / 100;
    }

    // getters and setters
    public long getBalance() {
        return  balance;
    }

    // made private so that people can't set their own balance
    protected void setBalance(long balance) {
        this.balance = balance;
    }

    public long getMinimumBalance() {
        return minimumBalance;
    }

    // made private so that people can't set their own minimum balance
    private void setMinimumBalance(long minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    // made private so that people can't change their own name
    private void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }




}
