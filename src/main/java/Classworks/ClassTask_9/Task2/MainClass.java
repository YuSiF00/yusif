package Classworks.ClassTask_9.Task2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) throws IOException {
        ArrayList<String> newarrayList = new ArrayList<String>();

        GenerateFile generateFile = new GenerateFile();
        generateFile.writeFile(generateFile.create_A_list());
        generateFile.readFile(new File("myfile.txt"));
        System.out.println(" ");
        newarrayList = generateFile.sortArrayList(generateFile.create_A_list());
        generateFile.writeFile2(newarrayList);
        generateFile.readFile(new File("myfile2.txt"));

    }
}
