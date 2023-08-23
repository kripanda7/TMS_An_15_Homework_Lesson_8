package com.teachmeskills.homework.lesson8.part1.task1.model;

public sealed abstract class Figure permits Circle, Rectangle, Triangle {
    public abstract double getArea();

    public abstract int getPerimeter();
}
