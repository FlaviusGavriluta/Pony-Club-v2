package org.example.model;

import org.example.enums.Location;

public class Unicorn extends Pony{
    public Unicorn(String name, int experienceLevel) {
        super(name, experienceLevel);
    }

    @Override
    public Coordinate walk() {
        return null;
    }
}
