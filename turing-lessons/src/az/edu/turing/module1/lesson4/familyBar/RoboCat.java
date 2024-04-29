package az.edu.turing.module1.lesson4.familyBar;

import java.util.Set;

public class RoboCat extends Pet {
    public RoboCat(String nickname) {
        super(nickname);
    }

    public RoboCat(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    public RoboCat() {
    }

    @Override
    public void respond() {
        System.out.println("I am robo cat");
    }
}