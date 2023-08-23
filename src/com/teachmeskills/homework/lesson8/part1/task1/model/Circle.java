package com.teachmeskills.homework.lesson8.part1.task1.model;

public final class Circle extends Figure {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * r);
    }
}
