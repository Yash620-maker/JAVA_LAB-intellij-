package LAB_3;

import java.util.Scanner;

class Plate {
    double length, width;

    Plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("LAB_3.Plate Constructor");
    }
}

class RectBox extends Plate {
    double height;

    RectBox(double l, double w, double h) {
        super(l, w);
        height = h;
        System.out.println("LAB_3.RectBox Constructor");
    }
}

class WoodBox extends RectBox {
    double thick;

    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);
        thick = t;
        System.out.println("LAB_3.WoodBox Constructor");
    }

    void display() {
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Thickness = " + thick);
    }
}

public class MultilevelConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        System.out.print("Enter thickness: ");
        double t = sc.nextDouble();

        WoodBox obj = new WoodBox(l, w, h, t);
        obj.display();
    }
}
