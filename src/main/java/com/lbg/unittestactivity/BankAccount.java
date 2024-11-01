package com.lbg.unittestactivity;

public class BankAccount {

    // variables
    private long balance;
    private long minimumBalance;
    private String accountHolderName;

    // constructor with parameters

    public BankAccount(long balance, long minimumBalance, String accountHolderName){
        this.setBalance(balance);
        this.setMinimumBalance(minimumBalance);
        this.setAccountHolderName(accountHolderName);

    }

    // methods

    // depositing money and adding to the balance in the background, making sure the deposit amount is greater than 0
    public void deposit(long depositAmount){
        if (depositAmount > 0){
            long newBalance = this.getBalance() + depositAmount;
            this.setBalance(newBalance);
        }
    }

    // withdrawing money and reducing balance in the background
    public void withdraw(long withdrawAmount){
        long newBalance = this.getBalance() - withdrawAmount;
        this.setBalance(newBalance);
    }


    // getters and setters
    public long getBalance() {
        return balance;
    }

    // made private so that people can't set their own balance
    private void setBalance(long balance) {
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
