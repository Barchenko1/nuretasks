package com.nure.barchenko.refactoring.task2.a;

public class Circle extends Point {

    private int radius;

    public Circle(int x, int y, int z, int radius) {
        super(x, y, z);
        this.radius = radius;
    }

    public double getSquare(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + getZ() +
                ", radius=" + radius +
                '}';
    }
}
