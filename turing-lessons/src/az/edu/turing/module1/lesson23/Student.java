package az.edu.turing.module1.lesson23;

public class Student {
    public static long MAX_INDEX = 0;
    private long id;
    private int age;
    private float grade;
    private String name;

    public Student(long id, int age, float grade, String name) {
        this.id = id + MAX_INDEX;
        MAX_INDEX++;
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Student{id=%d, age=%d, grade=%s, name='%s'}".formatted(id, age, grade, name);
    }
}
