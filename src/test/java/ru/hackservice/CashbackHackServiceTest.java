package ru.hackservice;

import static org.junit.Assert.*;

import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testEmptyAmount() {
        assertEquals(1000, service.remain(0));
    }

    @Test
    public void testAmount() {
        assertEquals(100, service.remain(900));
    }

    @Test
    public void testTopLimit() {
        assertEquals( 0, service.remain(1000));
    }
}