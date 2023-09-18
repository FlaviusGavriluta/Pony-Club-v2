package org.example.model;

import org.example.enums.Location;

public class Pegasus extends Pony {
    public Pegasus(String name, int experienceLevel) {
        super(name, experienceLevel);
    }

    @Override
    public Coordinate walk() {
        return null;
    }
}
