package com.juma.miners.gamedomain;

/**
 * @author marc.vis
 */
public class MiningZone {

    private int amount;
    private int rate;
    protected int nextTimeToMine = 0;
    protected MineClock mineClock;

    public MiningZone(int amount, int rate, MineClock mineClock) {
        this.amount = amount;
        this.rate = rate;
        this.mineClock = mineClock;
    }

    public boolean canMine() {
        return nextTimeToMine < mineClock.getCurrentTime();
    }

    public int mine() {
        if (canMine()) {
            nextTimeToMine = mineClock.getCurrentTime() + rate;
            return amount;
        }
        return 0;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getNextTimeToMine() {
        return nextTimeToMine;
    }

    public void setNextTimeToMine(int nextTimeToMine) {
        this.nextTimeToMine = nextTimeToMine;
    }
}
