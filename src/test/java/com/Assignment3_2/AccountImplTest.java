package com.Assignment3_2;

import static org.junit.Assert.*;
import org.junit.*;
/**
 * Created by Rory on 2017-03-26.
 */
public class AccountImplTest {
    @Test
    public void deposit() throws Exception {
        AccountInterface deposit = new AccountImpl();
        int result = deposit.deposit(60,20);
        Assert.assertEquals(80, result);


    }

    @Test
    public void withdraw() throws Exception {
        AccountInterface withdraw = new AccountImpl();
        int result = withdraw.withdraw(80,25);
        Assert.assertEquals(55, result);

    }

}