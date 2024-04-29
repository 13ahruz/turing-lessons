package az.edu.turing.module1.lesson4.familyBar;

public class DomesticCat  extends Pet implements Fouling{
    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }



    @Override
    public void respond() {
        System.out.println("Meowwwwww");
    }

    @Override
    public void foul() {

    }
}