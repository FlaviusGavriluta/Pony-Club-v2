package org.example.model;

public class SuperPony extends Pony implements Flying, Magic {
    public SuperPony(String name, Integer experienceLevel) {
        super(name, experienceLevel);
    }
}