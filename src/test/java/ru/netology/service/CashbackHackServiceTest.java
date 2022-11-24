package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldBoundary1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1700;
        int actual = service.remain(amount);
        int expected = 300;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldBoundaryThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
}

    @Test
    public void shouldBoundaryZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }
}
