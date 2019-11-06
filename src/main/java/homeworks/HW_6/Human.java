package homeworks.HW_6;

public class Human {
    private String name;
    private String surname;
    private int date_of_birthday;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;


    public Human() {
    }

    public Human(String name, String surname, int date_of_birthday) {
        this.name = name;
        this.surname = surname;
        this.date_of_birthday = date_of_birthday;
    }

    public Human(String name, String surname, int date_of_birthday, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.date_of_birthday = date_of_birthday;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int date_of_birthday, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.date_of_birthday = date_of_birthday;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
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

    public int getDate_of_birthday() {
        return date_of_birthday;
    }

    public void setDate_of_birthday(int date_of_birthday) {
        this.date_of_birthday = date_of_birthday;
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

    public void greetPet(Pet pet){
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet(Pet pet){
        if (pet.getTrickLevel() > 50) {
            System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is very sly");
        } else {
            System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is almost not sly");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector is running...");
        super.finalize();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date_of_birthday=" + date_of_birthday +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother.name +
                ", father=" + father.name +
                '}';
    }
}
