package az.edu.turing.module1.lesson4.familyBar.model;

import java.util.Map;

public class Man extends Human{
    public Man() {
    }

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, int iq, Map<String, String> schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    @Override
    public void greetPet() {
        getFamily().getPet().stream().forEach(pet -> System.out.println("Hello, " + pet.getNickname()));
    }

    public void repearCar (){
        System.out.println("QOZ KIMI OLDU !");
    }
}
