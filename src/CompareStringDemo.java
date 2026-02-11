import java.util.Scanner;

public class CompareStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first String : ");
        String str1 = sc.nextLine();

        System.out.print("Enter second String : ");
        String str2 = sc.nextLine();

        int diff = compareStrings(str1, str2);
        System.out.println("The difference between ASCII value is " + diff);
        sc.close();
    }

    static int compareStrings(String s1, String s2) {
        return Math.abs(s1.charAt(0) - s2.charAt(0));
    }
}
