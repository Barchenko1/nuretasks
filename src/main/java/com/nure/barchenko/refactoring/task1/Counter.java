package com.nure.barchenko.refactoring.task1;

public class Counter {
    private int x;
    private int hx;
    private int max = 100;

    public void increaseCounter(int value) {
        int isMoreMax = x + value;
        if (isMoreMax <= max) {
            x += value;
        }
    }

    public int generateCounter(){
        int isMoreMax = x + hx;
        if (isMoreMax <= max) {
            return x += hx;
        }
        return x;
    }

    public String indexer(int index) {
        int result = x;
        int logIndex = 0;
        for (int i = 1; i <= index; i++) {
            if (result <= max - hx) {
                result += hx;
                logIndex = i;
            } else {
                break;
            }
        }
        return "value - "+ result + ", max index is - " +logIndex;
    }

    public Counter(int x, int hx) {
        this.x = x;
        this.hx = hx;
    }

    public Counter(int x) {
        this.x = x;
    }

    public Counter() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getHx() {
        return hx;
    }

    public void setHx(int hx) {
        this.hx = hx;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "x=" + x +
                ", hx=" + hx +
                ", max=" + max +
                '}';
    }
}
