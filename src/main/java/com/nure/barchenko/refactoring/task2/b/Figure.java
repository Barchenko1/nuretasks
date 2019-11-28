package com.nure.barchenko.refactoring.task2.b;

public abstract class Figure {
    private int x;
    private int y;
    private int z;

    public Figure(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void moveX(int dx){
        x += dx;
    }

    public void moveY(int dy){
        y += dy;
    }

    public void moveZ(int dz){
        z += dz;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public abstract double getSquare();

    public abstract double getPerimeter();
}
