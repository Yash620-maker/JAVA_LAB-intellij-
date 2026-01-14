package LAB_3;

import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter LAB_3.Account Number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("LAB_3.Account No: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    @Override
    void disp() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLong();

        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar No: " + aadhar_no);
    }
}

public class AccountDetails {
    public static void main(String[] args) {
        Person[] p = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of LAB_3.Person " + (i + 1));
            p[i] = new Person();
            p[i].input();
            p[i].disp();
        }
    }
}
