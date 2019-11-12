package homeworks.HW_8;

import java.util.HashSet;
import java.util.Map;

public class Human1 {
    private String name;
    private String surname;
    private int date_of_birthday;
    private int iq;
    private HashSet<Pet> pet;
    private Human1 mother;
    private Human1 father;
    private Map<DayOfWeek, String> schedule;

    public Human1() {
    }

    public Human1(String name, String surname, int date_of_birthday) {
        this.name = name;
        this.surname = surname;
        this.date_of_birthday = date_of_birthday;
    }
    public Human1(String name, String surname, int date_of_birthday, Human1 mother, Human1 father) {
        this.name = name;
        this.surname = surname;
        this.date_of_birthday = date_of_birthday;
        this.mother = mother;
        this.father = father;
    }

    public Human1(String name, String surname, int date_of_birthday, int iq, HashSet<Pet> pet, Human1 mother, Human1 father) {
        this.name = name;
        this.surname = surname;
        this.date_of_birthday = date_of_birthday;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    public Human1(String name, String surname, int date_of_birthday, int iq, HashSet<Pet> pet, Human1 mother, Human1 father, Map<DayOfWeek, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.date_of_birthday = date_of_birthday;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void describePet(Pet pet) {
        if (pet.getTrickLevel() > 50) {
            System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is very sly");
        } else {
            System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is almost not sly");
        }
    }

    public void greetPet(Pet pet) {
        System.out.println("Hello, " + pet.getNickname());
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

    public HashSet<Pet> getPet() {
        return pet;
    }

    public void setPet(HashSet<Pet> pet) {
        this.pet = pet;
    }

    public Human1 getMother() {
        return mother;
    }

    public void setMother(Human1 mother) {
        this.mother = mother;
    }

    public Human1 getFather() {
        return father;
    }

    public void setFather(Human1 father) {
        this.father = father;
    }

    public Map<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DayOfWeek, String> schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Human1{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date_of_birthday=" + date_of_birthday +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + schedule +
                '}';
    }
}
