package com.lbg.unittestactivity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

//import static org.hamcrest.Matchers.closeTo;
//import static org.hamcrest.MatcherAssert.*;
public class BankAccountTests {
    // deposit tests
    @Test
    public void testDepositOfAPositiveAmount(){
        BankAccount b1 = new BankAccount(1000, 0, "Jane Doe");
        b1.deposit(5000);
        assertEquals(6000, b1.getBalance());

    }

    @Test
    public void testDepositOfANegativeAmount(){
        BankAccount b1 = new BankAccount(1000, 0, "Jane Doe");
        b1.deposit(-500);
        assertEquals(1000, b1.getBalance());
    }


    // withdraw tests
    @Test
    public void testWithdrawPositiveAmount(){
        BankAccount b1 = new BankAccount(1000, 0, "Jane Doe");
        b1.withdraw(500);
        assertEquals(500, b1.getBalance());
    }

}
