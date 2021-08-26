package ru.netology.service;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldIfBoundary() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldIfOverBoundary() {
        int amount = 1010;

        int actual = service.remain(amount);
        int expected = 990;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldIfLessBoundary() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }
}