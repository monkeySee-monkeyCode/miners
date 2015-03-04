package com.juma.miners.gamedomain;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author marc.vis
 */
public class MiningZoneTest {

    private MiningZone subject;

    private MineClock mineClock;

    @Before
    public void setup() {
        mineClock = mock(MineClock.class);
        this.subject = new MiningZone(5,10, mineClock);
        this.subject.nextTimeToMine = 5;
    }

    @Test
    public void testMineBeforeCanMineShouldReturnZero() {
        //GIVEN
        when(mineClock.getCurrentTime()).thenReturn(4);

        //WHEN
        int amount = subject.mine();

        //THEN
        assertEquals(0, amount);
    }

    @Test
    public void testMineAfterCanMineShouldReturnAmount() {
        //GIVEN
        when(mineClock.getCurrentTime()).thenReturn(6);

        //WHEN
        int amount = subject.mine();

        //THEN
        assertEquals(5, amount);
    }
}
