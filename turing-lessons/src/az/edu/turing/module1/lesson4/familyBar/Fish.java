package az.edu.turing.module1.lesson4.familyBar;

public class Fish extends Pet {
    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("I am swimming gracefully.");
    }
}

