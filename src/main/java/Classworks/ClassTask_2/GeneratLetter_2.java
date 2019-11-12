package Classworks.ClassTask_2;

import java.util.Random;

public class GeneratLetter_2 {


    public static String Small_Vowel(Random rand, int length, String characters) {
        char[] text = new char[characters.length()];
        char[] SmallVowel = new char[characters.length()];
        for (int i = 0; i < length; i++) {

            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }
        int j = 0;

        for (int i = 0; i < text.length; i++) {
            if (text[i] == 97 || text[i] == 101 || text[i] == 105 || text[i] == 111 || text[i] == 117) {


                SmallVowel[j] = text[i];
                j++;

            }

        }


        return new String(text) + "\n" + new String(SmallVowel);

    }

    public static String Capital_Vowel(Random rand, int length, String characters) {
        char[] text = new char[characters.length()];
        char[] CapitalVowel = new char[characters.length()];
        for (int i = 0; i < length; i++) {

            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }
        int j = 0;

        for (int i = 0; i < text.length; i++) {
            if (text[i] == 65 || text[i] == 69 || text[i] == 73 || text[i] == 79 || text[i] == 85) {


                CapitalVowel[j] = text[i];
                j++;

            }

        }


        return new String(text) + "\n" + new String(CapitalVowel);

    }

    public static String Capital_Consonant(Random rand, int length, String characters) {
        char[] text = new char[characters.length()];
        char[] CapitalConsonant = new char[characters.length()];
        for (int i = 0; i < length; i++) {

            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }
        int j = 0;

        for (int i = 0; i < text.length; i++) {
            if ((text[i] > 65 && text[i] < 92) &&( text[i] != 65 || text[i] != 69 || text[i] != 73 || text[i] != 79 || text[i] != 85)) {

                CapitalConsonant[j] = text[i];
                j++;
            }


        }


        return new String(text) + "\n" + new String(CapitalConsonant);

    }

    public static String Small_Consonant(Random rand, int length, String characters) {
        char[] text = new char[characters.length()];
        char[] CapitalConsonant = new char[characters.length()];
        for (int i = 0; i < length; i++) {

            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }
        int j = 0;

        for (int i = 0; i < text.length; i++) {
            if ((text[i] > 65 && text[i] < 92) &&( text[i] != 65 || text[i] != 69 || text[i] != 73 || text[i] != 79 || text[i] != 85)) {

                CapitalConsonant[j] = text[i];
                j++;
            }


        }


        return new String(text) + "\n" + new String(CapitalConsonant);

    }


    public static void main(String[] args) {
        String str = "";
        for (int i = 65; i < 91; i++) {
            str += (char) i;
        }

        // System.out.println(str);

        for (int i = 97; i < 123; i++) {
            str += (char) i;
        }

        System.out.println(str);
        //System.out.println(str);
        String small_wovel = Small_Vowel(new Random(), 30, str);
        System.out.println(small_wovel);
        System.out.println("*************************************************************");
        String capital_wovel = Capital_Vowel(new Random(), 30, str);
        System.out.println(capital_wovel);
        System.out.println("*************************************************************");
        String capital_consonant = Capital_Consonant(new Random(), 30, str);
        System.out.println(capital_consonant);

    }


}
