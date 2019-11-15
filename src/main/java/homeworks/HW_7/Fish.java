package homeworks.HW_7;

public class Fish extends Pet {


    public Fish(Species species, String nickName) {
        super(species, nickName);
    }

    public Fish(Species species, String nickName, int age, int trickLevel, String[] habits) {
        super(species, nickName, age, trickLevel, habits);
    }

    @Override
    void eat() {
        System.out.println("I am eating");
    }

    @Override
    void respond() {
        System.out.println("Hello, owner. I am - " + this.getNickName() + ". I miss you!");
    }
}
