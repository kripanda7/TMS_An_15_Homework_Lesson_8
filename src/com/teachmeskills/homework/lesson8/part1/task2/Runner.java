package com.teachmeskills.homework.lesson8.part1.task2;

import com.teachmeskills.homework.lesson8.part1.task2.model.Accountant;
import com.teachmeskills.homework.lesson8.part1.task2.model.Director;
import com.teachmeskills.homework.lesson8.part1.task2.model.Worker;

public class Runner {
    public static void main(String[] args) {
        Director director = new Director();
        director.printPosition();

        Worker worker = new Worker();
        worker.printPosition();

        Accountant accountant = new Accountant();
        accountant.printPosition();
    }
}
