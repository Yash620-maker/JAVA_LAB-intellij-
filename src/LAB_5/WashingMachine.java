package LAB_5;

interface Motor {
    int capacity = 5;

    void run();
    void consume();
}
public class WashingMachine implements Motor {

    public void run() {
        System.out.println("LAB_5.Motor is running");
    }
    public void consume() {
        System.out.println("LAB_5.Motor is consuming power");
    }
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        System.out.println("Capacity of the motor is " + wm.capacity);
    }
}
