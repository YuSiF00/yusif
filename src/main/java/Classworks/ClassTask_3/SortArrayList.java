package Classworks.ClassTask_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;


public class SortArrayList {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 0; i<30;i++){
            arrayList.add(random.nextInt(100));
        }

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        ArrayList<Integer> result  = new ArrayList<Integer>();


        for (int i = 0;i<arrayList.size();i++){
            if(arrayList.get(i)%2==1){
                arrayList1.add(arrayList.get(i));
            }else{
                arrayList2.add(arrayList.get(i));
            }
        }


        System.out.println(arrayList);
        System.out.println(arrayList1);
        System.out.println(arrayList2);







        Comparator<Integer>  comparator  = new Comparator<Integer>() {
            @Override

            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };

        Comparator<Integer>  comparator2  = new Comparator<Integer>() {
            @Override

            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };

        Collections.sort(arrayList1,comparator);
        Collections.sort(arrayList2,comparator2);

        System.out.println(arrayList1.toString());
        System.out.println(arrayList2.toString());

        for (int i = 0; i<arrayList2.size();i++){
            result.add(arrayList2.get(i));
        }

        for (int i = 0; i<arrayList1.size();i++){
            result.add(arrayList1.get(i));
        }

        System.out.println(result.toString());




       /* for (int i = 0 ;i<arrayList.size();i++){
            if(arrayList.get(i)%2 == 1){

                Collections.sort(arrayList,comparator);
            }else{
                Collections.sort(arrayList,comparator2);
            }

        }*/





        //System.out.println(arrayList.toString());





    }
}
