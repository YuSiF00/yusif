package homeworks.HW_4_5_6_New;

import java.util.ArrayList;
import java.util.Objects;

public class Family extends Human {
    private Human father;
    private Human mother;
    private ArrayList<Human> children;
    private Pet pet;

    public Family(Human father, Human mother, ArrayList<Human> children, Pet pet) {
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.pet = pet;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
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
        Family family = (Family) o;
        return father.equals(family.father) &&
                mother.equals(family.mother) &&
                children.equals(family.children) &&
                pet.equals(family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(father, mother, children, pet);
    }

    void addChild(Human child) {
        children.add(child);
        System.out.println("Child is added.. This is " + child.getName());
    }

    boolean deletechild(int index) {
        if (index >= 0 && index < children.size()) {
            children.remove(index);
            return true;
        } else return false;

    }

    int family_count(){
        return children.size()+2;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector is running...");
        super.finalize();
    }

    @Override
    public String toString() {
        return "Family{" +
                "father=" + father.getName() +
                ", mother=" + mother.getName() +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }
}
