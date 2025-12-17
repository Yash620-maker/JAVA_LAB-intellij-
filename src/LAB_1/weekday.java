import java.util.Scanner;

class weekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Day Number (1-7): ");
        int day = sc.nextInt();

        String weekday;

        switch(day) {
            case 1: weekday = "Sunday"; break;
            case 2: weekday = "Monday"; break;
            case 3: weekday = "Tuesday"; break;
            case 4: weekday = "Wednesday"; break;
            case 5: weekday = "Thursday"; break;
            case 6: weekday = "Friday"; break;
            case 7: weekday = "Saturday"; break;
            default: weekday = "Invalid Day Number";
        }

        System.out.println("Weekday: " + weekday);
    }
}
