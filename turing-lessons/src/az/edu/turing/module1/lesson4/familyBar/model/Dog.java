package az.edu.turing.module1.lesson4.familyBar.model;

import java.util.Set;

public class Dog extends Pet {
    public Dog(String nickname) {
        super(nickname);
    }

    public Dog(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    public Dog() {
    }

    @Override
    public void respond() {
        System.out.println("Hav-hav-hav");
    }
}