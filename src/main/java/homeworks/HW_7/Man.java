package homeworks.HW_7;

public class Man extends Human {

    public Man(String name, String surname, int date_of_birthday) {
        super(name, surname, date_of_birthday);
    }

    public Man(String name, String surname, int date_of_birthday, Human mother, Human father) {
        super(name, surname, date_of_birthday, mother, father);
    }

    public Man(String name, String surname, int date_of_birthday, int iq, Pet pet, Human mother, Human father) {
        super(name, surname, date_of_birthday, iq, pet, mother, father);
    }

    @Override
    void greetPet(Pet pet) {
        System.out.println("Hello, " + pet.getNickname() + " I'm a man");
    }

    void repair_car() {
        System.out.println("Hello. I'm repairing my car");
    }
}
