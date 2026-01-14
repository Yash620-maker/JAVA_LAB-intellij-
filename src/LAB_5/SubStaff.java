package LAB_5;

import java.util.Scanner;


interface Salary {
    void earnings();
    void deductions();
    void bonus();
}


abstract class manager implements Salary {
    double basic;

    manager(double basic) {
        this.basic = basic;
    }

    public void earnings() {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        double earnings = basic + da + hra;
        System.out.println("Earnings - " + (int) earnings);
    }

    public void deductions() {
        double pf = 0.12 * basic;
        System.out.println("Deduction - " + (int) pf);
    }
}


class Substaff extends manager {

    Substaff(double basic) {
        super(basic);
    }

    public void bonus() {
        double bonus = 0.5 * basic;
        System.out.println("Bonus - " + (int) bonus);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic LAB_5.Salary: ");
        double basic = sc.nextDouble();

        Substaff s = new Substaff(basic);
        s.earnings();
        s.deductions();
        s.bonus();

        sc.close();
    }
}
