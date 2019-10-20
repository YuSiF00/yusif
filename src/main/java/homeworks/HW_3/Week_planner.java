package main.java.homeworks.HW_3;

import java.util.Scanner;

public class Week_planner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] shedule = new String[7][2];

        shedule[0][0] = "Sunday";
        shedule[0][1] = "meet the friends";
        shedule[1][0] = "Monday";
        shedule[1][1] = "go to bank; do homework";
        shedule[2][0] = "Tuesday";
        shedule[2][1] = "go to course, do homework";
        shedule[3][0] = "Wednesday";
        shedule[3][1] = "do exercise , work with computer";
        shedule[4][0] = "Thursday";
        shedule[4][1] = "stay at home and watch a film";
        shedule[5][0] = "Friday";
        shedule[5][1] = "go to the library; read a few books";
        shedule[6][0] = "Saturday";
        shedule[6][1] = "go to the cinema; go to course";


        boolean a = true;


        while (true) {
            System.out.print("Please, input the day of the week : ");
            String your_choose = sc.nextLine().toLowerCase();
            switch (your_choose) {
                case "monday":
                    System.out.println("Your tasks for " + shedule[1][0] + " : " + shedule[1][1]);
                    break;
                case "tuesday":
                    System.out.println("Your tasks for " + shedule[2][0] + " : " + shedule[2][1]);
                    break;
                case "wednesday":
                    System.out.println("Your tasks for " + shedule[3][0] + " : " + shedule[3][1]);
                    break;
                case "thursday":
                    System.out.println("Your tasks for " + shedule[4][0] + " : " + shedule[4][1]);
                    break;
                case "friday":
                    System.out.println("Your tasks for " + shedule[5][0] + " : " + shedule[5][1]);
                    break;
                case "saturday":
                    System.out.println("Your tasks for " + shedule[6][0] + " : " + shedule[6][1]);
                    break;
                case "sunday":
                    System.out.println("Your tasks for" + shedule[7][0] + " : " + shedule[7][1]);
                    break;
                case "exit":
                    a = false;
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
                    break;

            }
            if (a == false) {
                break;
            }
        }


        System.out.println("The program is ended.Thanks");


    }
}
