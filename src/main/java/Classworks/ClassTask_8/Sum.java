package Classworks.ClassTask_8;

import java.util.Scanner;

public class Sum {
    static int Ebob(int a,int b) {
        if(a%b==0) {
            return b;
        }else {
            return Ebob(b, a%b);
        }
    }

    static int Ekob(int a , int b){
        return a*b/Ebob(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str = "2/3 + 1/4";
        String s = sc.nextLine();
        String[] massiv = s.split("\\+");

        String[] massiv1 = massiv[0].split("\\/");
        String[] massiv2 = massiv[1].split("\\/");
        //System.out.println(massiv1[0]+" "+massiv1[1]);
        //System.out.println(massiv2[0]+" "+massiv2[1]);

        int bottom = Ekob(Integer.parseInt(massiv1[1]),Integer.parseInt(massiv2[1]));
        int top = Integer.parseInt(massiv1[0])*(bottom/Integer.parseInt(massiv1[1])) + Integer.parseInt(massiv2[0])*(bottom/Integer.parseInt(massiv2[1])) ;

        //System.out.println(bottom+"  "+top);

        System.out.println(top+"/"+bottom);







        /*for(int i = 0;i<massiv.length;i++){
           // System.out.println(massiv[i]);
            try {
                int a = massiv[0];
            }
        }*/
        //int a = Integer.parseInt(massiv[0]);
        //int b = Integer.parseInt(massiv[1]);
       // int sum  = a+b;

    }
}
