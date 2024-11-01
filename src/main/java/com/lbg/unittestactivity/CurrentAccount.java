package com.lbg.unittestactivity;

public class CurrentAccount extends BankAccount{



    // class variables
    private long overdraft;
    private long maxWithdrawAmount;

    private long availableBalance;


    // constructor including super constructor to pull parameters from super class BankAccount
    public CurrentAccount(double inputBalance, double inputMinimumBalance, String accountHolderName, double overdraft, double maxWithdrawAmount) {
        super(inputBalance, inputMinimumBalance, accountHolderName);
        this.overdraft = (long) (overdraft * 100);
        this.maxWithdrawAmount = (long) (maxWithdrawAmount * 100);
    }

    // methods
    public double getAvailableBalance(){
        return getBalanceAsDouble() + (double) overdraft / 100;
    }


    @Override
    public void withdraw(double inputWithdrawAmount) {
        super.withdraw(inputWithdrawAmount);
    }

    // getters and setters
    public long getOverdraft() {
        return overdraft;
    }

    private void setOverdraft(long overdraft) {
        this.overdraft = overdraft;
    }

    public long getMaxWithdrawAmount() {
        return maxWithdrawAmount;
    }

    private void setMaxWithdrawAmount(long maxWithdrawAmount) {
        this.maxWithdrawAmount = maxWithdrawAmount;
    }


}
