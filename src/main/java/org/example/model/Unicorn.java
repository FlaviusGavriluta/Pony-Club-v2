package org.example.model;

import java.util.List;
import java.util.Random;

public class Unicorn extends Pony {
    public Unicorn(String name, int experienceLevel) {
        super(name, experienceLevel);
    }

    public void canDoMagic() {
        setExperienceLevel(getExperienceLevel() + 1);
        List<String> symbols = List.of("*", "#", "&");
        setName(getName() + symbols.get((new Random().nextInt(symbols.size() - 1))));
        System.out.println(getName() + " goes to:" + getExperienceLevel());
    }
}