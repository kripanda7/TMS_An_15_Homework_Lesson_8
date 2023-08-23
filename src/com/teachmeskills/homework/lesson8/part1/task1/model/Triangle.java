package com.teachmeskills.homework.lesson8.part1.task1.model;

public final class Triangle extends Figure {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        int s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public int getPerimeter() {
        return a + b + c;
    }
}
