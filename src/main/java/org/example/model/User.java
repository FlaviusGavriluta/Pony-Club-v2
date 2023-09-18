package org.example.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class User {
    private String username;
    private Date registrationDate;
    List<Pony> ponies;

    public User(String username, Date registrationDate) {
        this.username = username;
        this.registrationDate = registrationDate;
        this.ponies = new ArrayList<>();
    }

    public List<Pony> addPony(Pony pony) {
        ponies.add(pony);
        return ponies;
    }

    private List<Pony> getSuperPony() {
        return this.registrationDate.getMonth() == Calendar.AUGUST
                ? addPony(new SuperPony("SuperPony", 10))
                : ponies;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
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
