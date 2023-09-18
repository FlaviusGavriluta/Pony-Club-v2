package org.example.model;

import org.example.enums.Location;

public class NormalPony extends Pony{
    public NormalPony(String name, int experienceLevel, Coordinate position, Location location) {
        super(name, experienceLevel, position, location);
    }

    @Override
    public Coordinate walk() {
        return null;
    }
}
