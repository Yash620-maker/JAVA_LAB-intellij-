import java.util.Scanner;

class RectArea {
    double length, breadth;

    RectArea() {
        length = 0;
        breadth = 0;
    }

    RectArea(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        RectArea r = new RectArea(l, b);
        r.area();
    }
}
