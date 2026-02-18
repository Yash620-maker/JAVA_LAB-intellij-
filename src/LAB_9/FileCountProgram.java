package LAB_9;

import java.io.*;
import java.util.*;

public class FileCountProgram {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name");
        String filename = sc.next();

        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        int characters = 0;
        int lines = 0;
        int words = 0;

        String line;
        while ((line = br.readLine()) != null) {
            lines++;
            characters += line.length();
            String[] wordList = line.split("\\s+");
            words += wordList.length;
        }

        br.close();
        sc.close();

        System.out.println("No. of characters - " + characters);
        System.out.println("No. of lines - " + lines);
        System.out.println("No. of words - " + words);
    }
}
