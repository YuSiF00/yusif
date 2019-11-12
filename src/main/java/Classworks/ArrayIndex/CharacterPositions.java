package Classworks.ArrayIndex;

import java.util.*;

public class CharacterPositions {

    public static void printOutput(Map<Character, List<Integer>> data){
       // for (int i = 97 ;i<120;i++){
         //   int a = data.get((char)i).size();
        //    System.out.println(a);
      //  }
       // int a = data.get((char)97).size();
      //  System.out.println(a);


    }



    public Map<Character, List<Integer>> process(String origin_) {
        String origin = origin_.toLowerCase();
        // unique
        Set<Character> unique = new HashSet<Character>();
        for (int index = 0; index < origin.length(); index++) {
            char c = origin.charAt(index);
            unique.add(c);
        }
        // map initialization with <char, empty list>
        Map<Character, List<Integer>> positions = new HashMap<>();
        for (Character c: unique) {
            positions.put(c, new ArrayList<>());
        }

        for (int index = 0; index < origin.length(); index++) {
            char c = origin.charAt(index);
            positions.get(c).add(index + 1);
        }
        return positions;
    }

    public static void main(String[] args) {
        // 1. data obtaining
        Lesson4Task1 l4t1 = new Lesson4Task1();
        final String origin = l4t1.generate_random_string(80);
        // 2. data process
        CharacterPositions app = new CharacterPositions();
        Map<Character, List<Integer>> result = app.process(origin);
        // 3. output the result
        System.out.println(origin);
        System.out.println(result);

        printOutput(result);
    }



}
