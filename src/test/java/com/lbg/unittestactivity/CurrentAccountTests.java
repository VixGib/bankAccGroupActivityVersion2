package com.lbg.unittestactivity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrentAccountTests {

    // just to check deposit test still passes
    @Test
    public void testDepositOfAPositiveAmount(){
        CurrentAccount c1 = new CurrentAccount(5000, 0, "Jane Doe", 1000, 500);
        c1.deposit(1000);
        assertEquals(6000, c1.getBalanceAsDouble());

    }

    // test to check available balance includes overdraft amount after a deposit
    @Test
    public void testDepositOfAPositiveAmountToIncludeOverdraftAmountInAvailableBalance(){
        CurrentAccount c1 = new CurrentAccount(5000, 0, "Jane Doe", 1000, 500);
        c1.deposit(1000);
        assertEquals(7000, c1.getAvailableBalance());

    }


    // test to see if withdraw gives available balance after balance goes into overdraft
    @Test
    public void testWithdrawPositiveAmount(){
        CurrentAccount c1 = new CurrentAccount(100, 0, "Jane Doe", 1000, 500);
        c1.withdraw(500);
        assertEquals(-400, c1.getBalanceAsDouble());
    }


    // test to see if it stops you withdrawing when you go over max withdraw amount
    @Test
    public void testWithdrawMoreThanMaxWithdrawAmount(){
        CurrentAccount c1 = new CurrentAccount(100, 0, "Jane Doe", 1000, 500);
        c1.withdraw(600);
        assertEquals(100, c1.getBalanceAsDouble());
    }

}
