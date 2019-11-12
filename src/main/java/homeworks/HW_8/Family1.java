package homeworks.HW_8;

import java.util.ArrayList;
import java.util.Objects;

public class Family1 {
    private Human1 father;
    private Human1 mother;
    private ArrayList<Human1> children;
    private Pet pet;

    public Family1(Human1 father, Human1 mother, ArrayList<Human1> children, Pet pet) {
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.pet = pet;
    }

    public Human1 getFather() {
        return father;
    }

    public void setFather(Human1 father) {
        this.father = father;
    }

    public Human1 getMother() {
        return mother;
    }

    public void setMother(Human1 mother) {
        this.mother = mother;
    }

    public ArrayList<Human1> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human1> children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family1 family1 = (Family1) o;
        return Objects.equals(father, family1.father) &&
                Objects.equals(mother, family1.mother) &&
                Objects.equals(children, family1.children) &&
                Objects.equals(pet, family1.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(father, mother, children, pet);
    }

    void addChild(Human1 child) {
        children.add(child);
        System.out.println("Child is added.. This is " + child.getName());
    }

    boolean deletechild(int index) {
        if (index >= 0 && index < children.size()) {
            children.remove(index);
            return true;
        } else return false;

    }

    int family_count() {
        return children.size() + 2;
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector is running...");
        super.finalize();
    }


    @Override
    public String toString() {
        return "Family1{" +
                "father=" + father +
                ", mother=" + mother +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }
}
