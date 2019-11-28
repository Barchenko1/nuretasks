package com.nure.barchenko.refactoring.task2.b;

public class Point extends Figure{

    public Point(int x, int y, int z) {
        super(x, y, z);
    }

    public double getSquare() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + getZ() +
                '}';
    }
}
