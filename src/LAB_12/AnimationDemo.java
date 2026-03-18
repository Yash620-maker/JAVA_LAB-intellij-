package LAB_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AnimationDemo extends JFrame implements ActionListener {

    JButton start, stop;
    JLabel label, imgLabel;

    int x = 50, y = 50;
    boolean running = false;

    String[] msgs = {"Welcome", "Enjoy", "Thanks", "Visit Again"};
    int msgIndex = 0;

    ImageIcon img = new ImageIcon("img.png"); // put image in same folder

    AnimationDemo() {
        setTitle("Animation");
        setSize(600, 400);
        setLayout(null);

        getContentPane().setBackground(Color.YELLOW);

        label = new JLabel("Welcome");
        label.setBounds(260, 50, 200, 30);
        add(label);

        imgLabel = new JLabel(img);
        imgLabel.setBounds(x, y, 100, 100);
        add(imgLabel);

        start = new JButton("Start Animation");
        stop = new JButton("Stop Animation");

        start.setBounds(150, 300, 150, 30);
        stop.setBounds(320, 300, 150, 30);

        add(start);
        add(stop);

        start.addActionListener(this);
        stop.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            running = true;
            new Thread(() -> animate()).start();
            new Thread(() -> changeText()).start();
        } else {
            running = false;
        }
    }

    void animate() {
        while (running) {
            try {
                // move right
                for (x = 50; x <= 400 && running; x++) {
                    imgLabel.setLocation(x, y);
                    Thread.sleep(10);
                }
                // move down
                for (y = 50; y <= 200 && running; y++) {
                    imgLabel.setLocation(x, y);
                    Thread.sleep(10);
                }
                // move left
                for (x = 400; x >= 50 && running; x--) {
                    imgLabel.setLocation(x, y);
                    Thread.sleep(10);
                }
                // move up
                for (y = 200; y >= 50 && running; y--) {
                    imgLabel.setLocation(x, y);
                    Thread.sleep(10);
                }
            } catch (Exception ex) {}
        }
    }

    void changeText() {
        while (running) {
            try {
                label.setText(msgs[msgIndex]);
                msgIndex = (msgIndex + 1) % msgs.length;
                Thread.sleep(1000);
            } catch (Exception ex) {}
        }
    }

    public static void main(String[] args) {
        new AnimationDemo();
    }
}