package Classworks.ClassTask_9.Task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class GenerateFile {

    static ArrayList<String> create_A_list() {
        ArrayList<String> arrayList = new ArrayList<>();
        Random random = new Random();

        for (int j = 0; j < 30; j++) {
            String s = "";
            for (char i = 0; i < random.nextInt(10)+20; i++) {
                s += (char) (random.nextInt(26) + 65);

            }

            arrayList.add(s);
        }

        return arrayList;
    }

    static boolean writeFile(ArrayList<String> arrayList) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("myfile.txt")));
        bw.write(String.valueOf(arrayList));
        bw.newLine();
        bw.close();
        return true;
    }

    static boolean writeFile2(ArrayList<String> arrayList) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("myfile2.txt")));
        bw.write(String.valueOf(arrayList));
        bw.newLine();
        bw.close();
        return true;
    }

    static String readFile(File file) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader(file));
        String line;
        while ((line = r.readLine()) != null) {
            System.out.println(line);
        }

        return line;


    }

    static ArrayList<String> sortArrayList(ArrayList<String> arrayList){
       // ArrayList<String> sorted = new ArrayList<String>();
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
       // for(int i = 0 ; i<arrayList.size())

        return arrayList;

    }


}