package homeworks.HW_7;

public class Dog extends Pet implements Foulable {
    public Dog(Species species, String nickname) {
        super(species, nickname);
    }

    public Dog(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void eat() {
        System.out.println("I am eating");
    }

    @Override
    void respond() {
        System.out.println("Hello, owner. I am - " + this.getNickName() + ". I miss you!");
    }


    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }
}
