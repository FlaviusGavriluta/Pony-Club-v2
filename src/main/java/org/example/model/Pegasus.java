package org.example.model;

import java.util.Scanner;

public class Pegasus extends Pony {
    public Pegasus(String name, int experienceLevel) {
        super(name, experienceLevel);
    }

    public void canFly() {
        Scanner scanner = new Scanner(System.in);
        setPosition(new Coordinate(scanner.nextInt(), scanner.nextInt()));
        System.out.println(getName() + "fly, fly, fly on: " + getPosition());
    }
}