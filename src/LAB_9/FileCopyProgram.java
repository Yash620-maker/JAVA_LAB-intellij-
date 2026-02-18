package LAB_9;

import java.io.*;
import java.util.*;

public class FileCopyProgram {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter source file name");
        String source = sc.next();

        System.out.println("Enter destination file name");
        String dest = sc.next();

        FileReader fr = new FileReader(source);
        FileWriter fw = new FileWriter(dest);

        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close();
        fw.close();

        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(dest);

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        fis.close();
        fos.close();

        System.out.println("File Copied");
        sc.close();
    }
}
