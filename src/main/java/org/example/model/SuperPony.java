package org.example.model;

import org.example.enums.Location;

public class SuperPony extends Pony{
    public SuperPony(String name, int experienceLevel) {
        super(name, experienceLevel);
    }

    @Override
    public Coordinate walk() {
        return null;
    }
}
