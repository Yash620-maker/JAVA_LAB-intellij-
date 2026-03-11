package LAB_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationFormApp {

    public static void main(String[] args) {
        new RegistrationFrame();
    }
}

class RegistrationFrame extends JFrame implements ActionListener {

    JTextField name;
    JTextArea address;
    JCheckBox java, python;
    JRadioButton male, female;
    JButton submit;

    RegistrationFrame() {

        setTitle("Registration Form");
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Name"));
        name = new JTextField(20);
        add(name);

        add(new JLabel("Address"));
        address = new JTextArea(4,20);
        add(address);

        add(new JLabel("Course"));
        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        add(java);
        add(python);

        add(new JLabel("Gender"));
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        add(male);
        add(female);

        ImageIcon img = new ImageIcon("image.png");
        add(new JLabel(img));

        submit = new JButton("Submit");
        add(submit);

        submit.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this,"Registration Submitted");
    }
}