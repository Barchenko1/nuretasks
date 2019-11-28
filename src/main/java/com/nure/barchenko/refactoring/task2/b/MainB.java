package com.nure.barchenko.refactoring.task2.b;

public class MainB {
    public static void main(String[] args) {
        Figure point = new Point(2,2,2);
        Figure cycle = new Circle(3,3,3,3);
        Figure cone = new Cone(4,4,4,4,4);
        Figure[] figures = {point, cycle, cone};
        showMethods(figures);
    }

    private static void showMethods(Figure[] figures){
        for (Figure figure : figures) {
            System.out.println(figure.getPerimeter());
            System.out.println(figure.getSquare());
            figure.moveX(1);
            figure.moveY(2);
            figure.moveZ(3);
            System.out.println(figure);
        }
    }
}
