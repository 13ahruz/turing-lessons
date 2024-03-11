package az.edu.turing.module1.lesson4.familyBar;

public class Man extends Human{
    public Man() {
    }

    public Man(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        super(name, surname, year, iq, pet, mother, father);
    }

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, Human mother, Human father) {
        super(name, surname, year, mother, father);
    }

    public Man(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        super(name, surname, year, iq, pet, mother, father, schedule);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello, " + getPet().getNickname() + ", I am ERKEK ...");
    }

    public void repearCar (){
        System.out.println("QOZ KIMI OLDU !");
    }
}
