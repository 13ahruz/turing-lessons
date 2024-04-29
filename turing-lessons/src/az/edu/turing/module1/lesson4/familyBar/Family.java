package az.edu.turing.module1.lesson4.familyBar;

import java.util.Arrays;
import java.util.Objects;
import java.util.*;

public class Family {
    private Human mother;
    private Human father;
    private Set<Pet> pet;
    private List <Human> children;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = mother;
    }

    public Family(Human mother, Human father,Pet pet) {
        this.mother = mother;
        this.father = mother;
        this.pet=new HashSet<>();
        this.children = new ArrayList<>();
    }

    public Family(Human mother, Human father, Pet pet, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.pet=new HashSet<>();
        this.children = new ArrayList<>();
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }


    public void addChild(Human child) {
        children.add(child);
    }


    public void deleteChild(Human child) {
    children.remove(child);
    }

    public int countFamily() {
        int parents = 0;
        if (mother != null){
            parents +=1;
        }
        if (father != null){
            parents += 1;
        }
        return children.size() + parents + pet.size();
    }

    public List<Human> getChildren() {
        return children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Objects.equals(pet, family.pet) && Objects.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, pet, children);
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", pet=" + pet +
                ", children=" + children +
                '}';
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("Removing family: " + mother.getName() + " and " + father.getName());
        super.finalize();
    }
}