import java.util.Scanner;

public class ReverseStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        String result = reverseString(str);
        System.out.println("The string after reversing is " + result);
        sc.close();
    }

    static String reverseString(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }
}
