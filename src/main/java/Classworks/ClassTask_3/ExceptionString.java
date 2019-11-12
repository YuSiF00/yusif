package Classworks.ClassTask_3;

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<String>();



        String s = sc.nextLine();
        int sum1 = 0;
        int exception_count =0;


        String[] massiv = s.split(" ");

        for(int i = 0;i<massiv.length;i++){

            try {
                int a = Integer.parseInt(massiv[i]);
                sum1+=a;
            }catch (Exception e){
                arrayList.add(massiv[i]);
                exception_count++;
            }


            //System.out.println(massiv[i]);
        }
        System.out.println("SUM "+sum1);
        System.out.println("Exception count:" +exception_count);
        System.out.println(arrayList.toString());
    }
}
