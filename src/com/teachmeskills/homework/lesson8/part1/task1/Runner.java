package com.teachmeskills.homework.lesson8.part1.task1;

import com.teachmeskills.homework.lesson8.part1.task1.model.Circle;
import com.teachmeskills.homework.lesson8.part1.task1.model.Figure;
import com.teachmeskills.homework.lesson8.part1.task1.model.Rectangle;
import com.teachmeskills.homework.lesson8.part1.task1.model.Triangle;

public class Runner {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Circle(3);
        figures[1] = new Rectangle(3, 4);
        figures[2] = new Triangle(3, 4, 5);
        figures[3] = new Rectangle(4, 9);
        figures[4] = new Triangle(2, 5, 7);

        int perimeterSum = 0;
        for (Figure figure : figures) {
            perimeterSum += figure.getPerimeter();
            System.out.println("Area of " + figure.getClass().getSimpleName() + " is: " + figure.getArea());
        }

        System.out.println("Perimeter sum is: " + perimeterSum);
    }
}
