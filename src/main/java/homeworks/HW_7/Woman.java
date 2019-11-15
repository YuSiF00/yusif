package homeworks.HW_7;

public class Woman extends Human {


    public Woman(String name, String surname, int dateOfBirthday) {
        super(name, surname, dateOfBirthday);
    }

    public Woman(String name, String surname, int dateOfBirthday, Human mother, Human father) {
        super(name, surname, dateOfBirthday, mother, father);
    }

    public Woman(String name, String surname, int dateOfBirthday, int iq, Pet pet, Human mother, Human father) {
        super(name, surname, dateOfBirthday, iq, pet, mother, father);
    }

    @Override
    void greetPet(Pet pet) {
        System.out.println("Hello, " + pet.getNickName() + " I'm a woman");
    }

    void makeUp() {
        System.out.println("Hello. I'm doing makeup");
    }
}
