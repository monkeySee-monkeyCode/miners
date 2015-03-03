package com.juma.miners.gamedomain;

import org.springframework.stereotype.Component;

/**
 * @author marc.vis
 */
@Component
public class MineClock {

    private int currentTime = 0;

    public void tick() {
        currentTime++;
    }

    public int getCurrentTime() {
        return currentTime;
    }
}
