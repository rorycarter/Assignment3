package com.Assignment3_2;

/**
 * Created by Rory on 2017-03-26.
 */
public class AccountImpl implements AccountInterface {

    public int deposit(int x, int y)
    {
        return x+y;
    }


    public int withdraw(int x, int y)
    {
        return x-y;
    }


}
