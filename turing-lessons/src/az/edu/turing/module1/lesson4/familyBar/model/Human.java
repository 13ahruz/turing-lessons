package az.edu.turing.module1.lesson4.familyBar.model;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.*;

public class Human {
    private String name;
    private String surname;
    //TODO birthDayMillis
    private long birthDate;
    private int iq;
    private Map<String,String> schedule;
    private Family family;

    // Constructors
    public Human(String name, String surname, long birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname, int birthDate, int iq, Map<String, String> schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
    }

    public Human() {
    }

    // Getters setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String describeAge() {
        LocalDate bDate = LocalDate.ofEpochDay(birthDate / (24 * 60 * 60 * 1000));
        LocalDate currentDate = LocalDate.now();
        long years = bDate.until(currentDate).getYears();
        long months = bDate.until(currentDate).getMonths();
        long days = bDate.until(currentDate).getDays();
        return years + " years, " + months + " months, and " + days + " days";
    }
    public long getYear() {
        LocalDate bDate = LocalDate.ofEpochDay(birthDate / (24 * 60 * 60 * 1000));
        LocalDate currentDate = LocalDate.now();
        return bDate.until(currentDate).getYears();
    }

    public String getBirthDateFormatted() {
        LocalDate bDate = LocalDate.ofEpochDay(birthDate / (24 * 60 * 60 * 1000));
        LocalDate currentDate = LocalDate.now();
        long years = bDate.until(currentDate).getYears();
        long months = bDate.until(currentDate).getMonths();
        long days = bDate.until(currentDate).getDays();
        return days + "/" + months + "/" + years;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Map<String,String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String,String> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void greetPet() {
        for (int i = 0; i < family.getPet().size(); i++) {
            family.getPet().stream().forEach(pet -> System.out.println("Hello, " + pet.getNickname()));
        }
    }

    public void describePet() {
        for (int i = 0; i < family.getPet().size(); i++) {
            family.getPet().stream().forEach(
                    pet -> System.out.println("I have an  "
                            + pet.getSpecies() + " is " + pet.getAge()
                            + " years old, he is " + ((pet.getTrickLevel() > 50)
                            ? " very sly." : " almost not sly.")));
        }
    }

    private long convertToMillis(String date) {
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC) * 1000;
    }

    @Override
    public String toString() {
        return "name='%s', surname='%s', birthDate=%s, iq=%d, schedule=%s, family=%s}"
                .formatted(name, surname, getBirthDateFormatted(), iq, schedule, family);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthDate == human.birthDate && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(schedule, human.schedule) && Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, iq, schedule, family);
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}





