package Classworks.ClassTask_11;

import java.util.Scanner;

public class MainClass {
    public static int solution(String S){
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i<S.length();i++){
            if(S.charAt(i)=='R'){
                count1++;
            }else if(S.charAt(i) == 'L') {
                count2++;
            }
            if(count1==count2){
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextLine()));
    }
}
