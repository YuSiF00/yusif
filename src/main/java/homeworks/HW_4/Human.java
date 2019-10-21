package main.java.homeworks.HW_4;

public class Human {
    String name;
    String surname;
    int date_of_birthday;
    int iq;
    Pet pet;
    Human mother;
    Human father;


    public void greetPet(Pet pet) {
        System.out.println("Hello, " + pet.nickname);

    }

    public void describePet(Pet pet) {
        if (pet.trickLevel > 50) {
            System.out.println("I have a " + pet.species + ", he is " + pet.age + " years old, he is very sly");
        } else {
            System.out.println("I have a " + pet.species + ", he is " + pet.age + " years old, he is almost not sly");
        }

    }

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
