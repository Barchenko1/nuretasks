package com.nure.barchenko.refactoring.task2.a;

public class MainA {
    public static void main(String[] args) {
        Point point = new Point(1,1,1);
        point.moveX(1);
        Circle circle = new Circle(1,1,1,2);
        circle.moveY(5);
        circle.moveZ(3);
        Cone cone = new Cone(1,1,1,5,5);
        System.out.println(point);
        System.out.println(circle);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getSquare());
        System.out.println(cone);
        System.out.println(cone.getPerimeter());
        System.out.println(cone.getSquare());
    }
}
