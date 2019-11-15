package homeworks.HW_7;

public class Human {
    private String name;
    private String surname;
    private int dateOfBirthday;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;

    public Human(String name, String surname, int dateOfBirthday) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
    }

    public Human(String name, String surname, int dateOfBirthday, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int dateOfBirthday, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    void greetPet(Pet pet) {

    }

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

    public int getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(int dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
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

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                '}';
    }
}
