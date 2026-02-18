package LAB_9;

import java.io.*;
import java.util.*;

public class StudentFileProgram {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rollno, Name, Subject, Marks");
        int roll = sc.nextInt();
        String name = sc.next();
        String subject = sc.next();
        int marks = sc.nextInt();

        System.out.println("Enter file name");
        String filename = sc.next();

        FileWriter fw = new FileWriter(filename, true);
        fw.write(roll + " " + name + " " + subject + " " + marks + "\n");
        fw.close();

        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        sc.close();
    }
}
