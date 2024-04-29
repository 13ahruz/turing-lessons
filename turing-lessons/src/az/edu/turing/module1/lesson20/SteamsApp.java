package az.edu.turing.module1.lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SteamsApp {
    public static void main(String[] args) {
        List <Person> people = new ArrayList<>();
        people.add(new Person("Jeff Bezos", 100000000));
        people.add(new Person("Bill Gates", 1000000000));
        people.add(new Person("Bahruz Shabili", 10));
        people.add(new Person("Paster 5'9", 15));


        List <Person> riches = people.stream()
                .filter(person -> person.money >= 1000000)
                .toList();
        riches.forEach(person -> System.out.println(person.getName()));
    }

    static class Person {
        private String name;
        private int money;

        public Person (String name, int money){
            this.name = name;
            this.money = money;
        }

        public int getMoney() {
            return money;
        }

        public String getName() {
            return name;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "People{name='%s', money=%d}".formatted(name, money);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person people = (Person) o;
            return money == people.money && Objects.equals(name, people.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, money);
        }
    }
}
