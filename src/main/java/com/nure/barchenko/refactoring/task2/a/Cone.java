package com.nure.barchenko.refactoring.task2.a;

public class Cone extends Circle {

    private int height;

    public Cone(int x, int y, int z, int radius, int height) {
        super(x, y, z, radius);
        this.height = height;
    }

    @Override
    public double getSquare() {
        return Math.PI * getRadius() * Math.sqrt(Math.pow(getRadius(), 2) + Math.pow(getRadius(), 2));
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + getZ() +
                ", radius=" + getRadius() +
                ", height=" + height +
                '}';
    }
}
