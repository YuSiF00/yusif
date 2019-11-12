package homeworks.HW_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MainClass {

    public static void main(String[] args) throws Throwable {


        Human1 human = new Human1();

        HashMap<DayOfWeek, String> schedule1 = new HashMap<>();
        schedule1.put(DayOfWeek.MONDAY, "go to library");
        schedule1.put(DayOfWeek.FRIDAY, "go to course");

        HashMap<DayOfWeek, String> schedule2 = new HashMap<>();
        schedule2.put(DayOfWeek.SUNDAY, "go to Cinema with friends");
        schedule2.put(DayOfWeek.TUESDAY, "go to courses; watch a film");

        HashSet<String> habits1 = new HashSet<>();
        habits1.add("sleep");
        habits1.add("drink");

        HashSet<String> habits2 = new HashSet<>();
        habits2.add("sleep");
        habits2.add("eat");

        Pet pet1 = new Pet(Species.DOG, "Oliver", 3, 60, habits1);
        Pet pet2 = new Pet(Species.CAT, "Tom", 2, 55, habits2);
        Pet pet3 = new Pet(Species.HORSE, "Oscar", 5, 75, habits1);

        HashSet<Pet> pets1 = new HashSet<>();
        pets1.add(pet1);
        pets1.add(pet3);

        HashSet<Pet> pets2 = new HashSet<>();
        pets2.add(pet2);
        pets2.add(pet3);

        Human1 father = new Human1("Joseph", "Smith", 1971);
        Human1 mother = new Human1("Stella", "Smith", 1972);


        Human1 child1 = new Human1("Leo", "Smith", 1998, 88, pets1, mother, father, schedule1);
        Human1 child2 = new Human1("Harry", "Smith", 1999, 91, pets2, mother, father);
        Human1 child3 = new Human1("Helen", "Smith", 1998, 93, pets2, mother, father, schedule2);

        System.out.println("");

        ArrayList<Human1> children = new ArrayList<>();

        Family1 family1 = new Family1(father, mother, children, pet1);
        System.out.println(family1.toString());

        family1.addChild(child1);
        family1.addChild(child2);
        family1.addChild(child3);


        if (family1.deletechild(1)) {
            System.out.println("Child is deleted...");
        } else
            System.out.println("Child isn't deleted");

        System.out.println("--------------------------------------");
        System.out.println(family1.toString());
        System.out.println("Family count : " + family1.family_count());

        family1.finalize();
    }
}
