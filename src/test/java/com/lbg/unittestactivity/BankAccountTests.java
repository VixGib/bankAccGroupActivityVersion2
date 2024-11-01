package com.lbg.unittestactivity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

// Test file for bank account
public class BankAccountTests {
    // deposit tests
    @Test
    public void testDepositOfAPositiveAmount(){
        BankAccount b1 = new BankAccount(1000, 0, "Jane Doe");
        b1.deposit(5000);
        assertEquals(6000, b1.getBalanceAsDouble());

    }

    // deposit tests
    @Test
    public void testDepositOfANegativeAmount(){
        BankAccount b1 = new BankAccount(1000, 0, "Jane Doe");
        b1.deposit(-500);
        assertEquals(1000, b1.getBalanceAsDouble());
    }

    // test to make sure we can deposit a double
    @Test
    public void testDepositDouble(){
        BankAccount b1 = new BankAccount(1000, 0, "Jane Doe");
        b1.deposit(500.50);
        assertEquals(1500.50, b1.getBalanceAsDouble());
    }

    // test to make sure we can't withdraw more than actual balance
    @Test
    public void testWithdrawMoreThanActualBalance(){
        BankAccount b1 = new BankAccount(1000, 0, "Jane Doe");
        b1.withdraw(1001);
        assertEquals(1000, b1.getBalanceAsDouble());


    }

    // withdraw tests
    @Test
    public void testWithdrawPositiveAmount(){
        BankAccount b1 = new BankAccount(1000, 0, "Jane Doe");
        b1.withdraw(500);
        assertEquals(500, b1.getBalanceAsDouble());
    }



    // test that we can withdraw a double
    @Test
    public void testWithdrawDouble(){
        BankAccount b1 = new BankAccount(1000, 0, "Jane Doe");
        b1.withdraw(50.50);
        assertEquals(949.50, b1.getBalanceAsDouble());
    }


    // test double withdraw


}
