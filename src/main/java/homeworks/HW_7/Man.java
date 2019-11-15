package homeworks.HW_7;

public class Man extends Human {


    public Man(String name, String surname, int dateOfBirthday) {
        super(name, surname, dateOfBirthday);
    }

    public Man(String name, String surname, int dateOfBirthday, Human mother, Human father) {
        super(name, surname, dateOfBirthday, mother, father);
    }

    public Man(String name, String surname, int dateOfBirthday, int iq, Pet pet, Human mother, Human father) {
        super(name, surname, dateOfBirthday, iq, pet, mother, father);
    }

    @Override
    void greetPet(Pet pet) {
        System.out.println("Hello, " + pet.getNickName() + " I'm a man");
    }

    void repair_car() {
        System.out.println("Hello. I'm repairing my car");
    }
}
