package org.example.model;

import java.util.Scanner;

public interface Flying {
    default void canFly(Pony pony) {
        Scanner scanner = new Scanner(System.in);
        pony.setPosition(new Coordinate(scanner.nextInt(), scanner.nextInt()));
        System.out.println(pony.getName() + "fly, fly, fly on: " + pony.getPosition());
    }
}