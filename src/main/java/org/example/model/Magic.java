package org.example.model;

import java.util.List;
import java.util.Random;

public interface Magic {
    default void canDoMagic(Pony pony) {
        pony.setExperienceLevel(pony.getExperienceLevel() + 1);
        List<String> symbols = List.of("*", "#", "&");
        pony.setName(pony.getName() + symbols.get((new Random().nextInt(symbols.size() - 1))));
        System.out.println(pony.getName() + " looks magic.");
    }
}