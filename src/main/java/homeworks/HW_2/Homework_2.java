package main.java.homeworks.HW_2;

import java.util.Random;
import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();



        int a;
        int b;
        a = random.nextInt(6);
        b = random.nextInt(6);
        while(true){
            if(a!=0&&b!=0){
                break;
            }
        }

        String[][] array = new String[6][6];
        array[0][0] = "0";
        array[0][1] = "1";
        array[0][2] = "2";
        array[0][3] = "3";
        array[0][4] = "4";
        array[0][5] = "5";
        array[1][0] = "1";
        array[2][0] = "2";
        array[3][0] = "3";
        array[4][0] = "4";
        array[5][0] = "5";



        for(int i = 1;i<6;i++){
            for(int j = 1 ;j<6;j++){
                array[i][j] = "-";
            }
            //System.out.println("");
        }

        for(int i =0;i<6;i++){
            for(int j = 0;j<6;j++){
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("All set. Get ready to rumble!");
        while(true){
            int c;
            int d;
            while(true){
                c = sc.nextInt();
                d = sc.nextInt();
                if((c>=1&&c<=5)&&(d>=1&&d<=5)){
                    break;
                }else{
                    System.err.println("Your numbers must be between 1 and 5!!! ");
                    System.out.println("Please enter your numbers again");
                }
            }

            if(c==a&&d==b){
                array[c][d] = "X";
                System.out.println("You are won");
                break;
            }else{
                array[c][d] = "*";
            }
            for(int i =0;i<6;i++){
                for(int j = 0;j<6;j++){
                    System.out.print(array[i][j]);
                }
                System.out.println("");
            }
        }

        for(int i =0;i<6;i++){
            for(int j = 0;j<6;j++){
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }

    }
}
