package com.juma.miners.gamedomain;

import org.junit.Test;
import org.mockito.InjectMocks;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * @author marc.vis
 */
public class MiningZoneFactoryTest {

    @InjectMocks
    private MiningZoneFactory subject = new MiningZoneFactory();

    @Test
    public void testBuildShouldReturnMiningZone() {
        //WHEN
        MiningZone miningZone = subject.build();

        //THEN
        assertNotNull(miningZone);
    }

    @Test
    public void testMultipleZonesShouldHaveSameClock() {
        //GIVEN
        MiningZone one, two;

        //WHEN
        one = subject.build();
        two = subject.build();

        //THEN
        assertEquals(one.mineClock, two.mineClock);
    }

    @Test
    public void testCreatedZonesShouldHaveAmountBetween1And50() {
        //GIVEN
        MiningZone testZone;

        //WHEN
        testZone = subject.build();

        //THEN
        assertTrue(1 <= testZone.getAmount() && testZone.getAmount() <= 50);
    }

}
