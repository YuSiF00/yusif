package Classworks.ArrayIndex;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "";
        int index = 0;


        for(int i = 0 ;i<str.length();i++){
            if(str.charAt(i) == ' '){
                continue;
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            boolean f = true;
            for(int l = 0 ;l<s.length();l++){
                if(s.charAt(l) == str.charAt(i)){
                    f = false;
                    break;
                }
            }
            if(f==false){
                continue;
            }
            int count = 0;
            for(int j = i; j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                    s+=str.charAt(i);
                    arrayList.add(i);

                }
            }
            System.out.println(str.charAt(i)+" "+count+""+arrayList);
        }

        //System.out.println(s);
    }
}
