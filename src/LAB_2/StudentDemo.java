import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;
}

class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];
        double minCgpa = Double.MAX_VALUE;
        String lowName = "";

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            System.out.print("Enter Roll No: ");
            s[i].roll = sc.nextInt();
            System.out.print("Enter Name: ");
            s[i].name = sc.next();
            System.out.print("Enter CGPA: ");
            s[i].cgpa = sc.nextDouble();

            if (s[i].cgpa < minCgpa) {
                minCgpa = s[i].cgpa;
                lowName = s[i].name;
            }
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println(s[i].roll + " " + s[i].name + " " + s[i].cgpa);
        }

        System.out.println("Student with lowest CGPA: " + lowName);
    }
}
