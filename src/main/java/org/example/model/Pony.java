package org.example.model;

import org.example.enums.Location;

import java.util.Random;

public class Pony {
    private String name;
    private Integer experienceLevel;
    private Coordinate position;

    public Pony(String name, Integer experienceLevel) {
        this.name = name;
        this.experienceLevel = experienceLevel;
        this.position = new Coordinate(new Random().nextInt(10), new Random().nextInt(10));
    }

    public Coordinate walk(Location location) {
        switch (location) {
            case NORTH -> {
                return new Coordinate(position.getX() + 1, position.getY());
            }
            case SOUTH -> {
                return new Coordinate(position.getX() - 1, position.getY());
            }
            case EAST -> {
                return new Coordinate(position.getX(), position.getY() + 1);
            }
            case WEST -> {
                return new Coordinate(position.getX(), position.getY() - 1);
            }
            default -> {
                return position;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(Integer experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public Coordinate getPosition() {
        return position;
    }

    public void setPosition(Coordinate position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Pony{" +
                "name='" + name + '\'' +
                ", experienceLevel=" + experienceLevel +
                ", position=" + position +
                '}';
    }
}