package az.edu.turing.module1.lesson4.familyBar;

import java.util.Set;

public class Fish extends Pet {
    public Fish(String nickname) {
        super(nickname);
    }

    public Fish(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    public Fish() {
    }

    @Override
    public void respond() {
        System.out.println("I am swimming gracefully.");
    }
}

