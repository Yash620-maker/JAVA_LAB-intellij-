package LAB_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorListApp {

    public static void main(String[] args) {
        new ColorFrame();
    }
}

class ColorFrame extends JFrame implements ActionListener {

    JList list;
    JButton button;
    JPanel panel;

    ColorFrame(){

        setTitle("My Frame");
        setSize(350,200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String colors[]={"white","orange","red","blue"};

        list = new JList(colors);
        add(list);

        button = new JButton("Click");
        add(button);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,100));
        panel.setBackground(Color.blue);
        add(panel);

        button.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        String c = list.getSelectedValue().toString();

        if(c.equals("white")) panel.setBackground(Color.white);
        if(c.equals("orange")) panel.setBackground(Color.orange);
        if(c.equals("red")) panel.setBackground(Color.red);
        if(c.equals("blue")) panel.setBackground(Color.blue);
    }
}