package az.edu.turing.module1.lesson17.functionalInt;

import az.edu.turing.module1.lesson17.Student;

import java.util.Comparator;

public class FunctionalInterfacesApp {

    public static void main(String[] args) {
        Student akif = new Student("Akif", 51.3, 19);
        Student bkif = new Student("Bkif", 98.2, 18);

        Comparator<Student> studentComparator = new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.score, s2.score);
            }
        };


        System.out.println(studentComparator.compare(akif, bkif));


        Comparator<Student> studentComparator1 = (s1,s2) -> {
            return Integer.compare(s1.age, s2.age);
        };

        System.out.println(studentComparator1.compare(akif, bkif));
    }
}
