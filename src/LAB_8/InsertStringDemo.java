package LAB_8;

import java.util.Scanner;

public class InsertStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first String : ");
        String str1 = sc.nextLine();

        System.out.print("Enter string to insert : ");
        String str2 = sc.nextLine();

        String result = insertString(str1, str2);
        System.out.println("The string after insertion is : " + result);
        sc.close();
    }

    static String insertString(String s1, String s2) {
        return s1 + " " + s2;
    }
}
