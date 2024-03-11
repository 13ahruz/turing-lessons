package az.edu.turing.module1.lesson4.familyBar;

public class Woman extends Human{
    public Woman() {
    }

    public Woman(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        super(name, surname, year, iq, pet, mother, father);
    }

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, int year, Human mother, Human father) {
        super(name, surname, year, mother, father);
    }

    public Woman(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        super(name, surname, year, iq, pet, mother, father, schedule);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello, " + getPet().getNickname() + ", I am ARVAD ...");
    }

    public void makeUp (){
        System.out.println("Give me my TANALNI");
    }
}
