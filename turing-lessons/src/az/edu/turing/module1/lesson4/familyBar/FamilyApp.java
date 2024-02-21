package az.edu.turing.module1.lesson4.familyBar;

public class FamilyApp {
    public static void main(String[] args) {
        Human mother1 = new Human("Samira", "Aliyeva", 1970);
        Human father1 = new Human("Qulu", "Aliyev", 1969);
        String [][] schedule = {{"Sunday", "Sport"}, {"Monday", "Education"}};
        String [] habits = {"Running", "Playing Ball"};
        Pet pet = new Pet("Scottish", "Balalayka", 2, 85, habits);
        Human akif = new Human("Akif", "Akifsoy", 1996, 53,
                pet, mother1, father1, schedule);

        System.out.println(akif.toString());
        System.out.println(pet.toString());
        pet.eat();
        pet.respond();
        pet.foul();
        akif.describePet();
        akif.greetPet();
    }
}
