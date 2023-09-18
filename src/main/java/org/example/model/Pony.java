package org.example.model;

import org.example.enums.Location;

public abstract class Pony {
    private String name;
    private int experienceLevel;
    private Coordinate position;
    private Location location;

    public Pony(String name, int experienceLevel, Coordinate position, Location location) {
        this.name = name;
        this.experienceLevel = experienceLevel;
        this.position = position;
        this.location = location;
    }

    public abstract Coordinate walk();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(int experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public Coordinate getPosition() {
        return position;
    }

    public void setPosition(Coordinate position) {
        this.position = position;
    }
}
