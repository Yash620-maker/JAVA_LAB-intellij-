package LAB_8;

import java.util.Scanner;

public class ChangeCaseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        String result = changeCase(str);
        System.out.println("The string after changing the case is " + result);
        sc.close();
    }

    static String changeCase(String str) {
        return str.toUpperCase();
    }
}
