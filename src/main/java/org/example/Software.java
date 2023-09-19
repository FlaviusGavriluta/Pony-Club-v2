package org.example;

import org.example.model.Coordinate;
import org.example.model.Pony;
import org.example.model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Software {
    List<User> users;

    public Software() {
        this.users = new ArrayList<>();
    }

    public List<Pony> listPonyByPosition(Coordinate position) {
        return users.stream()
                .flatMap(user -> user.getPonies().stream()
                        .filter(pony -> pony.getPosition().equals(position)))
                .collect(Collectors.toList());
    }

    public User highestLevelOfPony() {
        Pony highestLevelPony = users.stream()
                .flatMap(user -> user.getPonies().stream()
                        .max(Comparator.comparing(Pony::getExperienceLevel))
                        .stream())
                .findFirst()
                .orElse(null);
        return users.stream()
                .filter(user -> user.getPonies().contains(highestLevelPony))
                .findFirst()
                .orElse(null);
    }
}