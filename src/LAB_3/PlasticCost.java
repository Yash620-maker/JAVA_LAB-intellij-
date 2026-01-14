package LAB_3;

import java.util.Scanner;

class Sheet2D {
    double length, width;

    void input2D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
    }

    double cost2D() {
        double area = length * width;
        return area * 40;
    }
}

class Box3D extends Sheet2D {
    double height;

    void input3D() {
        Scanner sc = new Scanner(System.in);
        input2D();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    double cost3D() {
        double volume = length * width * height;
        return volume * 60;
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box3D obj = new Box3D();

        System.out.println("1. 2D Sheet");
        System.out.println("2. 3D Box");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            obj.input2D();
            System.out.println("Cost of Plastic Sheet = Rs " + obj.cost2D());
        } else if (choice == 2) {
            obj.input3D();
            System.out.println("Cost of Plastic Box = Rs " + obj.cost3D());
        } else {
            System.out.println("Invalid choice");
        }
    }
}
