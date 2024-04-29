package az.edu.turing.module1.lesson4.familyBar;
public class FamilyApp {
    public static void main(String[] args) {

        Human mother = new Human("Jane", "Karleone", 1940);
        Human father = new Human("Vito", "Karleone", 1950);
        Pet pet1 = new Dog("Rock");

        Family family = new Family(mother, father,pet1);


        Human child1 = new Human("Michael", "Karleone", 1977);
        family.addChild(child1);
        System.out.println(family.countFamily()); // 3
        System.out.println(family); // mother, father, pet, child1


        Human child2 = new Human("Nazrin", "Karimli", 2004); // iq partladirrrr
        family.addChild(child2);
        System.out.println(family.countFamily()); // 4
        System.out.println(family); // mother, father, pet, child1, child2


        family.deleteChild(child1);  //  Michael övladlığa verildi
        System.out.println(family.countFamily()); // 3
        System.out.println(family);  // mother, father, pet, child2
    }
}
//
//import javax.print.attribute.Size2DSyntax;
//import java.sql.SQLOutput;
//
//public class FamilyApp {
//    public static void main(String[] args) {
//        Pet pet =new Fish(Species.DOMESTICCAT,"Akif");
//        Human human1 = new Human("Arif",
//                "Hesenov",
//                1999,
//                65,
//                new Dog(Species.DOG, "Lusy"),
//                new Human("Sevda", "Hesenova", 1974),
//                new Human("Kamil", "Hesenov", 1960));
//
//        Human human2 = new Human("Arif",
//                "Hesenov",
//                1999,
//                65,
//                new Fish(Species.FISH, "Lusy"),
//                new Human("Sevda", "Hesenova", 1974),
//                new Human("Kamil", "Hesenov", 1960));
//        System.out.println(human2);
//        System.out.println(human1);
//        System.out.println("==========================");
//        Family family1=new Family(human1,human2);
//        family1.addChild(human1);
//        family1.addChild(human2);
//        System.out.println(family1);
//        family1.deleteChild(1);
//        family1.deleteChild(human1);
//        System.out.println(family1);
//        System.out.println(family1.countFamily());
//        System.out.print("Sout my code");
//        System.out.println("Print my code,");
//        SQLOutput(Size2DSyntax):
//
//    }
//
//
//}
