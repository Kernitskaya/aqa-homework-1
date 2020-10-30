package ru.hackservice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testEmptyAmount() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void testAmount() {
        assertEquals(service.remain(900), 100);
    }

    @Test
    public void testTopLimit() {
        assertEquals(service.remain(1000), 0);
    }

}