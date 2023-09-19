package org.example;

import org.example.model.*;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Software ponyClub = new Software();


        NormalPony normalPony = new NormalPony("NormalPony", 3);
        NormalPony normalPony2 = new NormalPony("NormalPony2", 4);
        SuperPony superPony = new SuperPony("SuperPony", 7);
        SuperPony superPony2 = new SuperPony("SuperPony2", 8);
        Pegasus pegasus = new Pegasus("Pegasus", 5);
        Pegasus pegasus2 = new Pegasus("Pegasus2", 6);

//        System.out.println(pegasus.getPosition());
//        System.out.println("Set new coordinates: ");
//        pegasus.canFly();
//
        Unicorn unicorn = new Unicorn("Unicorn", 6);
        Unicorn unicorn2 = new Unicorn("Unicorn2", 5);

//        System.out.println(unicorn);
//        unicorn.canDoMagic();
//        System.out.println(unicorn);


        User user1 = new User("Lovendal", LocalDate.of(2023, Calendar.AUGUST, 20));
        User user2 = new User("Arthur", LocalDate.of(2023, Calendar.SEPTEMBER, 9));
        User user3 = new User("Ragnar", LocalDate.now());

        user1.addPony(normalPony);
        user1.addPony(unicorn);

        user2.addPony(unicorn2);
        user2.addPony(pegasus);
        user2.addPony(superPony);

        user3.addPony(pegasus2);
        user3.addPony(normalPony2);


        ponyClub.users.add(user1);
        ponyClub.users.add(user2);

        Scanner in = new Scanner(System.in);
//        System.out.println("List ponies of position: ");
//        System.out.println(ponyClub.listPonyByPosition(new Coordinate(in.nextInt(), in.nextInt())));

        superPony2.canDoMagic();
        superPony2.canDoMagic();
        superPony2.canDoMagic();

        user3.addPony(superPony2);
        ponyClub.users.add(user3);

        System.out.println(ponyClub.highestLevelOfPony());
    }
}