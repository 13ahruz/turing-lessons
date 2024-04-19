package az.edu.turing.module1.lesson17;

public class Student  {
    public String name;
    public double score;
    public int age;

    public Student(String name, double score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }
}
