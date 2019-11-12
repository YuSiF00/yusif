package Classworks.ArraySort;

import java.util.ArrayList;

public class Minimal_Pair {

    void  minimal_pair(ArrayList<Integer> arrayList){

        int min_sum = arrayList.get(0)+arrayList.get(1);
        int min1 = 0;
        int min2 = 0;
        int index = 0;
        for (int i = 2; i<arrayList.size();i++){
            if((arrayList.get(i-1)+arrayList.get(i)) < min_sum){
                min_sum =  arrayList.get(i-1)+arrayList.get(i);
                min1 = arrayList.get(i-1);
                min2 = arrayList.get(i);
                index = i;
            }
        }

        System.out.println("the original array : "+arrayList.toString());
        System.out.println("sum of that found pair : "+min_sum);
        System.out.println("left number : "+min1 + " \n"+"right number : " + min2);
        System.out.println("index of the left element : "+ index) ;


    }
}
