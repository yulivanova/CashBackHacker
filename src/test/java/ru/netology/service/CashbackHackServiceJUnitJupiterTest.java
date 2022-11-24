package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceJUnitJupiterTest {

   @Test
    public void shouldBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBoundary1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2700;
        int actual = service.remain(amount);
        int expected = 300;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldBoundaryThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldBoundaryZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assertions.assertEquals(actual, expected);
    }
}