package org.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.util.Calendar.AUGUST;

public class User {
    private String username;
    private LocalDate registrationDate;
    List<Pony> ponies = new ArrayList<>();

    public User(String username, LocalDate registrationDate) {
        this.username = username;
        this.registrationDate = registrationDate;
        getSuperPony();
    }

    public List<Pony> addPony(Pony pony) {
        ponies.add(pony);
        return ponies;
    }

    private void getSuperPony() {

        if (registrationDate.getMonth().getValue() == AUGUST)
            ponies.add(new SuperPony("SuperPony", 10));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public List<Pony> getPonies() {
        return ponies;
    }

    public void setPonies(List<Pony> ponies) {
        this.ponies = ponies;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", registrationDate=" + registrationDate +
                ", ponies=" + ponies +
                '}';
    }
}