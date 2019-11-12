package Classworks.ArraySort;

import java.util.ArrayList;
import java.util.Random;

public class Random_Array_List {

    static ArrayList<Integer> random_array_list(int n){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random random = new Random();
        for(int i = 0 ;i<30;i++){
            arrayList.add(random.nextInt(100));
        }

        return arrayList;

    }
}
