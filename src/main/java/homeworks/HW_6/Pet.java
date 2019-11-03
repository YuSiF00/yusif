package homeworks.HW_6;

import java.util.Arrays;

public class Pet {
    private Animal species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am - " + this.nickname + ". I miss you!");
    }

    public static void foul() {
        System.out.println("I need to cover it up");
    }

    public Pet() {
    }

    public Pet(Animal species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(Animal species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Animal getSpecies() {
        return species;
    }

    public void setSpecies(Animal species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector is running...");
        super.finalize();
    }

    @Override
    public String toString() {
        return this.species + "{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
