package az.edu.turing.module1.lesson4.familyBar;

import java.util.Map;

public class Woman extends Human{
    public Woman() {
    }

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, int year, int iq, Map<String, String> schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    @Override
    public void greetPet() {
        getFamily().getPet().stream().forEach(pet -> System.out.println("Hello, " + pet.getNickname()));
    }

    public void washDishes (){
        System.out.println("QOZ KIMI OLDU !");
    }
}
