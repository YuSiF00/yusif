package test.java.ClassTask;

import java.util.Random;

public class GenerateLetter {

    public static  String gen_random(Random rand, int length,String characters){
        char[] text = new char[characters.length()];
        for(int i=0;i<length;i++){

            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }

        return new String(text);

    }
    public static void main(String[] args) {
        String str = "";
        for(int i = 65;i<91;i++){
            str += (char) i;
        }

        for(int i = 97;i<122;i++){
            str += (char) i;
        }
        //System.out.println(str);
        String s = gen_random(new Random(), 30, str);
        System.out.println(s);



    }
}
