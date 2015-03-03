package com.juma.miners.gamedomain;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Random;

/**
 * @author marc.vis
 */
@Component
public class MiningZoneFactory {

    private Random rand = new Random();

    @Resource
    private MineClock mineClock;

    /**
     * Randomizes an amount between 1 - 50 and a rate of 1 - 10
     *
     * @return built random mining zone
     */
    public MiningZone build() {
        return new MiningZone(rand.nextInt(50) + 1, rand.nextInt(10) + 1, mineClock);
    }
}
