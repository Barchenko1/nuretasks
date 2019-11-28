package com.nure.barchenko.refactoring.task2.b;

public class Cone extends Figure {

    private int height;
    private int radius;

    public Cone(int x, int y, int z, int height, int radius) {
        super(x, y, z);
        this.height = height;
        this.radius = radius;
    }

    public double getSquare(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + getZ() +
                ", radius=" + radius +
                ", height=" + height +
                '}';
    }
}
