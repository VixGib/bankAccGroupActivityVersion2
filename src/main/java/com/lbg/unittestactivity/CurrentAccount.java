package com.lbg.unittestactivity;

public class CurrentAccount extends BankAccount{



    // class variables
    private long overdraft;
    private long maxWithdrawAmount;


    // constructor including super constructor to pull parameters from super class BankAccount
    public CurrentAccount(double inputBalance, double inputMinimumBalance, String accountHolderName, double overdraft, double maxWithdrawAmount) {
        super(inputBalance, inputMinimumBalance, accountHolderName);
        this.overdraft = (long) (overdraft * 100);
        this.maxWithdrawAmount = (long) (maxWithdrawAmount * 100);
    }

    // methods

    // to get a total available balance to include overdraft
    public double getAvailableBalance(){
        return getBalanceAsDouble() + (double) overdraft / 100;
    }


    // override method from BankAccount class to include available balance of input balance plus overdraft
    @Override
    public void withdraw(double inputWithdrawAmount){
        long withdrawAmount = (long) (inputWithdrawAmount * 100);
        long availableBalance = (long) (getAvailableBalance() * 100);
        if ((withdrawAmount<= availableBalance) && (withdrawAmount <= maxWithdrawAmount)){
            long newBalance = this.getBalance() - withdrawAmount;
            this.setBalance(newBalance);
        }

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
