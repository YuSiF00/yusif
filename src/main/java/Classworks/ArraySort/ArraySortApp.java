package Classworks.ArraySort;

import java.util.ArrayList;
import java.util.Random;

public class ArraySortApp {

    static ArrayList<Integer> random_array_list(int n){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random random = new Random();
        for(int i = 0 ;i<30;i++){
            arrayList.add(random.nextInt(100));
        }

        return arrayList;

    }


    public static void main(String[] args) {


       Minimal_Pair minimal_pair = new Minimal_Pair();
       minimal_pair.minimal_pair(random_array_list(30));
    }
}
