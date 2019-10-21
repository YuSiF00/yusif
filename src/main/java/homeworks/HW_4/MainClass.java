package main.java.homeworks.HW_4;

public class MainClass {
    public static void main(String[] args) {
        //Pet pet = new Pet();
        //pet.eat();

        Human human = new Human();

        Pet pet = new Pet("Dog", "Mestan", 3, 60, new String[]{"sleep", "drink"});
        System.out.println(pet.toString());
        Human father = new Human("Balabey", "Memmedov", 1971);
        Human mother = new Human("Gulnaz", "Memmedova", 1972);


        Human child = new Human("Yusif", "Memmedov", 1998, 88, pet, mother, father);
        System.out.println(child.toString());

        System.out.println("");

        //methods for human
        human.greetPet(pet);
        human.describePet(pet);

        //methods for pet
        pet.eat();
        pet.respond();
        pet.foul();
    }
}
