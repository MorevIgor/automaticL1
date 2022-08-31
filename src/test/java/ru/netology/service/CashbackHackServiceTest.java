package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void Amount() {
        CashbackHackService remain = new CashbackHackService();

        int amount= 900;

        int expected= 100;
        int actual= remain.remain(amount);

        Assert.assertEquals(actual,expected);
    }
    @Test
    public void minAmount() {
        CashbackHackService remain = new CashbackHackService();

        int amount = 1000;

        int expected= 0;
        int actual= remain.remain(amount);

        Assert.assertEquals(actual,expected);
    }
}