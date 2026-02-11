package LAB_8;

import java.util.Scanner;

public class PalindromeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        if (isPalindrome(str))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");

        sc.close();
    }

    static boolean isPalindrome(String str) {
        StringBuffer sb = new StringBuffer(str);
        String reversed = sb.reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
