package az.edu.turing.module1.lesson4.familyBar;

import java.util.Arrays;

public class Human {
    String name;
    String surname;
    int year;
    int iq = 1;
    Pet pet;
    Human mother;
    Human father;
    String [][] schedule;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] shedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        if (iq <= 100 && iq >= 1){
        this.iq = iq;
        }
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = shedule;
    }

    public Human() {
    }

    public void greetPet (){
        System.out.println("Hello, " + pet.nickname);
    }

    public void describePet (){
        String trickL;
        if (pet.trickLevel > 50){
            trickL = "Very sly";
        }
        else {
            trickL = "Almost not sly";
        }
        System.out.printf("I have an %s is %.1f years old. He is %s.\n", pet.species, pet.age, trickL);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Human{name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", year=").append(year);
        sb.append(", iq=").append(iq);
        sb.append(", pet=").append(pet.nickname);
        sb.append(", mother=").append(mother.name);
        sb.append(", father=").append(father.name);
        sb.append(", schedule=[");
        for (String[] day : schedule) {
            sb.append(Arrays.toString(day)).append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append("]}");
        return sb.toString();
    }

}
