package homeworks.HW_7;

public class Fish extends Pet {


    public Fish(Species species, String nickname) {
        super(species, nickname);
    }

    public Fish(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    void eat() {
        System.out.println("I am eating");
    }

    @Override
    void respond() {
        System.out.println("Hello, owner. I am - " + this.getNickname() + ". I miss you!");
    }
}
