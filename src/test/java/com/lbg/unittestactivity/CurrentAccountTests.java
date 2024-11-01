package com.lbg.unittestactivity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrentAccountTests {
    @Test
    public void testDepositOfAPositiveAmount(){
        CurrentAccount c1 = new CurrentAccount(5000, 0, "Jane Doe", 1000, 500);
        c1.deposit(1000);
        assertEquals(6000, c1.getBalanceAsDouble());

    }

    @Test
    public void testDepositOfAPositiveAmountToIncludeOverdraftAmountInAvailableBalance(){
        CurrentAccount c1 = new CurrentAccount(5000, 0, "Jane Doe", 1000, 500);
        c1.deposit(1000);
        assertEquals(6000, c1.getBalanceAsDouble());

    }

}
