package LAB_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGBColorApp {

    public static void main(String[] args) {
        new RGBFrame();
    }
}

class RGBFrame extends JFrame implements ActionListener {

    JComboBox r,g,b;
    JButton show;
    JPanel panel;

    RGBFrame(){

        setTitle("RGB Color");
        setSize(400,250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Integer values[] = new Integer[256];
        for(int i=0;i<256;i++) values[i]=i;

        add(new JLabel("Red"));
        r = new JComboBox(values);
        add(r);

        add(new JLabel("Green"));
        g = new JComboBox(values);
        add(g);

        add(new JLabel("Blue"));
        b = new JComboBox(values);
        add(b);

        show = new JButton("Show Output");
        add(show);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,100));
        add(panel);

        show.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        int red = (Integer)r.getSelectedItem();
        int green = (Integer)g.getSelectedItem();
        int blue = (Integer)b.getSelectedItem();

        Color c = new Color(red,green,blue);
        panel.setBackground(c);
    }
}