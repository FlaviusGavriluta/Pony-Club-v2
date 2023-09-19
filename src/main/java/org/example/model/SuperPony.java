package org.example.model;

import org.example.enums.Location;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SuperPony extends Pony {
    public SuperPony(String name, Integer experienceLevel) {
        super(name, experienceLevel);
    }

    public void canFly() {
        Scanner scanner = new Scanner(System.in);
        setPosition(new Coordinate(scanner.nextInt(), scanner.nextInt()));
        System.out.println(getName() + "fly, fly, fly on: " + getPosition());
    }

    public void canDoMagic() {
        setExperienceLevel(getExperienceLevel() + 1);
        List<String> symbols = List.of("*", "#", "&");
        setName(getName() + symbols.get((new Random().nextInt(symbols.size() - 1))));
    }
}