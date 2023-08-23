package com.teachmeskills.homework.lesson8.part1.task1.model;

public final class Rectangle extends Figure {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public int getPerimeter() {
        return (a + b) * 2;
    }
}
