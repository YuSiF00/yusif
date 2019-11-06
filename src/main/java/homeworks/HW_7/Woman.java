package homeworks.HW_7;

public class Woman extends Human {

    public Woman(String name, String surname, int date_of_birthday) {
        super(name, surname, date_of_birthday);
    }

    public Woman(String name, String surname, int date_of_birthday, Human mother, Human father) {
        super(name, surname, date_of_birthday, mother, father);
    }

    public Woman(String name, String surname, int date_of_birthday, int iq, Pet pet, Human mother, Human father) {
        super(name, surname, date_of_birthday, iq, pet, mother, father);
    }

    @Override
    void greetPet(Pet pet) {
        System.out.println("Hello, " + pet.getNickname() + " I'm a woman");
    }

    void makeUp() {
        System.out.println("Hello. I'm doing makeup");
    }
}
